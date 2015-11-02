package nju.edu.express.admindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import nju.edu.express.PO.UserPO;
import nju.edu.express.admindataservice.UserDataService;
import nju.edu.express.mysql.MySqlImpl;

public class UserDataImpl extends UnicastRemoteObject implements
		UserDataService {
	MySqlImpl mySql;

	public UserDataImpl() throws RemoteException {
		super();
		try {
			mySql = new MySqlImpl();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public UserPO[] getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPO getUser(String userID) {
		ResultSet rs;
		UserPO po = null;

		try {
			rs = mySql.query("SELECT password,access FROM user WHERE userID = "
					+ "'" + userID + "'");
			if(rs.next())
				po = new UserPO(userID, rs.getString(1), rs.getString(2));
			else
				return po;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return po;
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
