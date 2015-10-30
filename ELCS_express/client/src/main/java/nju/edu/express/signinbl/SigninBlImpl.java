package nju.edu.express.signinbl;

import java.rmi.Naming;

import nju.edu.express.PO.UserPO;
import nju.edu.express.admindataservice.UserDataService;
import nju.edu.express.enumdata.StuffAccess;
import nju.edu.express.signinblservice.SigninBlService;

public class SigninBlImpl implements SigninBlService {

	public boolean isValid(String id, String password) {
		
		if(id.length()>12)
			return false;
		if(id.matches("\\w")&&(password.matches("\\w")))
			return true;
		else 
			return false;	
	}

	
	UserDataService userData;
	UserPO userPO;
	
	public StuffAccess isCorrect(String id, String password) {
		
		try {
			userData = (UserDataService) Naming.lookup("rmi://127.0.0.1:6600/UserService");
			userPO = userData.getUser(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if(userPO==null)
			return StuffAccess.ERROR;
		else if(userPO.getPassword().equals(password)){
			switch (userPO.getAccess()) {
			case "快递员":
				return StuffAccess.EXPRESSER;
			case "营业厅业务员":
				return StuffAccess.BUSINESSER;
			case "仓库管理员":
				return StuffAccess.WAREHOUSER;
			case "中转中心业务员":
				return StuffAccess.TRANSITER;
			case "财务人员":
				return StuffAccess.FINANCER;
			case "总经理":
				return StuffAccess.MANAGER;
			case "管理员":
				return StuffAccess.ADMIN;
			}
		}
		else
			return StuffAccess.ERROR;
		return StuffAccess.ERROR;
	}
	

}
