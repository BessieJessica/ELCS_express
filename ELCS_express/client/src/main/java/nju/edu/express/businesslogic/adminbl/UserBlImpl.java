package nju.edu.express.businesslogic.adminbl;

import java.rmi.Naming;

import nju.edu.express.PO.UserPO;
import nju.edu.express.VO.UserVO;
import nju.edu.express.adminblservice.UserBlService;
import nju.edu.express.admindataservice.UserDataService;
import nju.edu.express.enumdata.StuffAccess;

public class UserBlImpl implements UserBlService {

	@Override
	public UserVO[] getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	UserDataService userData;
	UserPO userPO;
	StuffAccess access;
	String oldAccess;

	@Override
	public UserVO getUser(String userID) {
		try {
			userData = (UserDataService) Naming
					.lookup("rmi://127.0.0.1:6600/UserData");
			userPO = userData.getUser(userID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// PO转VO
		oldAccess = userPO.getAccess();
		if (oldAccess.equals("快递员"))
			access = StuffAccess.EXPRESSER;
		else if (oldAccess.equals("营业厅业务员"))
			access = StuffAccess.BUSINESSER;
		else if (oldAccess.equals("中转中心业务员"))
			access = StuffAccess.TRANSITER;
		else if (oldAccess.equals("仓库管理员"))
			access = StuffAccess.WAREHOUSER;
		else if (oldAccess.equals("财务人员"))
			access = StuffAccess.FINANCER;
		else if (oldAccess.equals("总经理"))
			access = StuffAccess.MANAGER;
		else if (oldAccess.equals("管理员"))
			access = StuffAccess.ADMIN;
		else
			access = StuffAccess.ERROR;

		return new UserVO(userPO.getUserID(), userPO.getPassword(),
				userPO.getName(), userPO.getBusiness(), userPO.getCity(),
				access);
	}

	@Override
	public boolean addUser(UserVO vo) {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delUser(String[] userID) {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean endUser(UserVO vo) {
		return false;
		// TODO Auto-generated method stub

	}

}
