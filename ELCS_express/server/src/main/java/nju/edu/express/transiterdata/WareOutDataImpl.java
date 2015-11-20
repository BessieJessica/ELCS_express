package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.WareOutPO;
import nju.edu.express.transiterdataservice.WareOutDataService;

public class WareOutDataImpl extends UnicastRemoteObject implements WareOutDataService {

	public WareOutDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public WareOutPO[] getWareOutList(String TransitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WareOutPO getWareOut(String WareOutID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertWareOut(WareOutPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
