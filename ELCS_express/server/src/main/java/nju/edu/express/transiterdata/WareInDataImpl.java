package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.WareInPO;
import nju.edu.express.transiterdataservice.WareInDataService;

public class WareInDataImpl extends UnicastRemoteObject implements WareInDataService {

	public WareInDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public WareInPO[] getWareInList(String TransitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WareInPO getWareIn(String WareInID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertWareIn(WareInPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
