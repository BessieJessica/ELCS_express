package nju.edu.express.businesserdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.InArrivalPO;
import nju.edu.express.businesserdataservice.InArrivalDataService;

public class InArrivalDataImpl extends UnicastRemoteObject implements InArrivalDataService {

	public InArrivalDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public InArrivalPO[] getInArrivalList(String bussinessID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InArrivalPO getInArrival(String InArrivalID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertInArrival(InArrivalPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
