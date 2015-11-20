package nju.edu.express.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.ProfitPO;
import nju.edu.express.financedataservice.ProfitDataService;

public class ProfitDataImpl extends UnicastRemoteObject implements ProfitDataService {

	public ProfitDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProfitPO getProfitChart() {
		// TODO Auto-generated method stub
		return null;
	}

}
