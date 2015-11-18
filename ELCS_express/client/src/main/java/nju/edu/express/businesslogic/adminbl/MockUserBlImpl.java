package nju.edu.express.businesslogic.adminbl;

import nju.edu.express.VO.UserVO;
import nju.edu.express.admindata.stub.UserDataImpl_stub;

public class MockUserBlImpl extends UserBlImpl{

	public boolean addUser(){
		UserDataImpl_stub userData = new UserDataImpl_stub();
		return userData.insertUser(null);
		
	}
	
	public boolean deleteUser(){
		UserDataImpl_stub userData = new UserDataImpl_stub();
		return userData.deleteUser(null);
	}
	
	public boolean updateUser(){
		UserDataImpl_stub userData = new UserDataImpl_stub();
		return userData.updateUser(null);
	}
}
