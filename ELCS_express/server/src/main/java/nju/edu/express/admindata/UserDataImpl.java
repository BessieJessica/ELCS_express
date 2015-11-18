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
			rs = mySql.query("SELECT password,name,business,city,access FROM user WHERE userID = "
					+ "'" + userID + "'");
			if (rs.next())
				po = new UserPO(userID, rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5));
			else
				return po;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return po;
	}

	@Override
	public boolean insertUser(UserPO po) {
		// TODO Auto-generated method stub
		return false;

	}

	@Override
	public boolean deleteUser(String userID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(UserPO po) {
		return false;
		// TODO Auto-generated method stub

	}

}
