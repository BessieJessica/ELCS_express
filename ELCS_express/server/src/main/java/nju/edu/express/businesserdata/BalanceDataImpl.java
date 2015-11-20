package nju.edu.express.businesserdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.PO.OrderPO;
import nju.edu.express.businesserdataservice.BalanceDataService;

public class BalanceDataImpl extends UnicastRemoteObject implements BalanceDataService{

	public BalanceDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insertBalance(OrderPO orderPO) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public BalancePO[] getBalanceList(String businessID, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BalancePO getBalance(String BalanceID) {
		// TODO Auto-generated method stub
		return null;
	}

}
