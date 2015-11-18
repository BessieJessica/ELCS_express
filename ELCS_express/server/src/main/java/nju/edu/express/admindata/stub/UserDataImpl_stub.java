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
		UserPO userPO1 = new UserPO("alan","徐朱峰","南京鼓楼区总公司","南京","11111", "user");
		switch (userID) {
		case "alan":
			return userPO1;
		default:
			return null;
		}
	}

	@Override
	public boolean insertUser(UserPO po) {
		// TODO Auto-generated method stub
		System.out.println("添加成功");
		return true;

	}

	@Override
	public boolean deleteUser(String userID) {
		// TODO Auto-generated method stub
		System.out.println("删除成功");
		return true;
	}

	@Override
	public boolean updateUser(UserPO po) {
		// TODO Auto-generated method stub
		System.out.println("更新成功");
		return true;
	}

}
