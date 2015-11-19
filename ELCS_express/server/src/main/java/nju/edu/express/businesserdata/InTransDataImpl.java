package nju.edu.express.businesserdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.InTransPO;
import nju.edu.express.businesserdataservice.InTransDataService;

public class InTransDataImpl extends UnicastRemoteObject implements InTransDataService {

	public InTransDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public InTransPO[] getInTransList(String bussinessID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InTransPO getInTrans(String InTransID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertInTrans(InTransPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
