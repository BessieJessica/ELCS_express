package nju.edu.express.admindata.stub;

import nju.edu.express.PO.UserPO;
import nju.edu.express.admindataservice.UserDataService;

public class UserDataImpl_stub implements UserDataService {

	@Override
	public UserPO[] getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPO getUser(String userID) {
		UserPO userPO1 = new UserPO("alan", "11111", "user");
		switch (userID) {
		case "alan":
			return userPO1;
		default:
			return null;
		}
	}

	@Override
	public void insertUser(UserPO po) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String userID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserPO po) {
		// TODO Auto-generated method stub

	}

}
