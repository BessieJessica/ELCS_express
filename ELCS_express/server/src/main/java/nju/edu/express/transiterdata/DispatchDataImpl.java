package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.DispatchPO;
import nju.edu.express.transiterdataservice.DispatchDataService;

public class DispatchDataImpl extends UnicastRemoteObject implements DispatchDataService {

	public DispatchDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public DispatchPO[] getDispatchList(String TransitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DispatchPO getDispatch(String DispatchID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertDispatch(DispatchPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
