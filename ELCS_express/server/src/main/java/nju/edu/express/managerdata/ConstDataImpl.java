package nju.edu.express.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.ConstPO;
import nju.edu.express.managerdataservice.ConstDataService;

public class ConstDataImpl extends UnicastRemoteObject implements ConstDataService {

	public ConstDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ConstPO[] getConstList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateConst(ConstPO[] po) {
		// TODO Auto-generated method stub
		return false;
	}

}
