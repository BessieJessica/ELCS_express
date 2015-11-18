package nju.edu.express.businesslogic.signinbl;

import nju.edu.express.VO.UserVO;
import nju.edu.express.businesslogic.adminbl.UserBlImpl;
import nju.edu.express.enumdata.StuffAccess;
import nju.edu.express.signinblservice.SigninBlService;

public class SigninBlImpl implements SigninBlService {

	public boolean isValid(String id, String password) {
		
		if(id.length()>12)
			return false;
		else if(id.matches("\\w+")&&(password.matches("\\w+")))
			return true;
		else 
			return false;
	}

	
	UserBlImpl userBl;
	UserVO userVO;
	
	public UserVO isCorrect(String id, String password) {
		userBl = new UserBlImpl();
		userVO = userBl.getUser(id);
		
		if(userVO==null)
			return null;
		else if(userVO.getPassword().equals(password))
			return userVO;
		else
			return null;
	}
	

}
