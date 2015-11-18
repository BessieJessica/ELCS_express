package nju.edu.express.logisticsdata.stub;

import java.rmi.RemoteException;

import nju.edu.express.PO.LogisticsPO;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class LogisticsDataImpl_stub implements LogisticsDataService{

	@Override
	public LogisticsPO[] getLogistics(String orderID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertLogistics(LogisticsPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return true;
	}

}
