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

	
	public LogisticsPO[] getLogistics(String orderID) {

		ResultSet rs;
		LogisticsPO[] po = null;
		
		try {
			rs = mySql
					.query("SELECT time,expressInfo,contact FROM logistics WHERE orderID = '"
							+ orderID + "' ORDER BY time DESC");
			rs.last();
			int length = rs.getRow();
			if(length==0)
				return po;
			po = new LogisticsPO[length];
			rs.beforeFirst();
			
			for(int i=0;i<length;i++){
				rs.next();
				po[i] = new LogisticsPO(orderID, rs.getTimestamp(1),rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return po;
	}

	public boolean insertLogistics(LogisticsPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
