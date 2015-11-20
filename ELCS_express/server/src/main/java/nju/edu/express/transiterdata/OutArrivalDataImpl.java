package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.OutArrivalPO;
import nju.edu.express.transiterdataservice.OutArrivalDataService;

public class OutArrivalDataImpl extends UnicastRemoteObject implements
		OutArrivalDataService {

	public OutArrivalDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public OutArrivalPO[] getOutArrivalList(String TransitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutArrivalPO getOutArrival(String OutArrivalID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertOutArrival(OutArrivalPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
