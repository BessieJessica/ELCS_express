package nju.edu.express.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.BusinessConPO;
import nju.edu.express.financedataservice.BusinessConDataService;

public class BusinessConDataImpl extends UnicastRemoteObject implements BusinessConDataService {

	public BusinessConDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public BusinessConPO getBusinessConChart() {
		// TODO Auto-generated method stub
		return null;
	}

}
