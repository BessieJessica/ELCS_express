package nju.edu.express.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.financedataservice.BalanceDataService;

public class BalanceDataImpl extends UnicastRemoteObject implements
		BalanceDataService {

	public BalanceDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public BalancePO[] getBalanceList(String BusinessId, String date) {
		// TODO Auto-generated method stub
		return null;
	}

}
