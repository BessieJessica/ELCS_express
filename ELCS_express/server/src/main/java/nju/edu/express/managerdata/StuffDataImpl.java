package nju.edu.express.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.StuffPO;
import nju.edu.express.managerdataservice.StuffDataService;

public class StuffDataImpl extends UnicastRemoteObject implements StuffDataService{

	public StuffDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public StuffPO[] getStuffList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StuffPO getStuff(String stuffID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertStuff(StuffPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStuff(String[] stuffID) {
		// TODO Auto-generated method stub
		return false;
	}



}
