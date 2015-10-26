package nju.edu.express.signinbl.stub;

import nju.edu.express.PO.UserPO;
import nju.edu.express.admindata.stub.UserDataImpl_stub;
import nju.edu.express.admindataservice.UserDataService;
import nju.edu.express.signinblservice.SigninBlService;

public class SigninBlImpl_stub implements SigninBlService {

	UserDataService user;
	UserPO userPO;
	
	public boolean isValid(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isCorrect(String id, String password) {
		user = new UserDataImpl_stub();
		userPO = user.getUser(id);
		if(userPO==null)
			return false;
		else if(userPO.getPassword().equals(password))
			return true;
		else
			return false;
	}

}
