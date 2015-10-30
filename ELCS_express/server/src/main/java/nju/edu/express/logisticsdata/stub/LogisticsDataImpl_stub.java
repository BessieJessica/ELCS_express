package nju.edu.express.logisticsdata.stub;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.LogisticsPO;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class LogisticsDataImpl_stub extends UnicastRemoteObject implements LogisticsDataService {

	public LogisticsDataImpl_stub() throws RemoteException {
		super();
	}

	LogisticsPO logisticsPO;
	public LogisticsPO getLogistics(String orderID){
		switch (orderID) {
		case "10000":
			logisticsPO = new LogisticsPO("10000", "南京南快递营业厅", "", "", "联系方式:12345678");
			System.out.println(orderID+"hao");
			return logisticsPO;
		default:
			System.out.println(orderID+"hao");
			return null;
		}
		
	}

	public void insertLogistics(LogisticsPO po) {
		// TODO Auto-generated method stub

	}
	

}
