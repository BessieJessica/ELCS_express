package nju.edu.express.logisticsdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import nju.edu.express.PO.LogisticsPO;
import nju.edu.express.logisticsdataservice.LogisticsDataService;
import nju.edu.express.mysql.MySqlImpl;

public class LogisticsDataImpl extends UnicastRemoteObject implements
		LogisticsDataService {

	MySqlImpl mySql;

	public LogisticsDataImpl() throws RemoteException {
		super();
		try {
			mySql = new MySqlImpl();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	LogisticsPO logisticsPO;

	public LogisticsPO getLogistics(String orderID) {

		ResultSet rs;
		LogisticsPO po = null;

		try {
			rs = mySql
					.query("SELECT expressInfo,contact FROM logistics WHERE orderID = '"
							+ orderID + "'");
			if (rs.next()) {
				po = new LogisticsPO(orderID, rs.getString(1), rs.getString(2));
				return po;
			} else
				return po;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void insertLogistics(LogisticsPO po) {
		// TODO Auto-generated method stub

	}

}
