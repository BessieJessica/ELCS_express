package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.OutTransPO;
import nju.edu.express.transiterdataservice.OutTransDataService;

public class OutTransDataImpl extends UnicastRemoteObject implements OutTransDataService {

	public OutTransDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public OutTransPO[] getOutTransList(String TransitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutTransPO getOutTrans(String OutTransID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertOutTrans(OutTransPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
