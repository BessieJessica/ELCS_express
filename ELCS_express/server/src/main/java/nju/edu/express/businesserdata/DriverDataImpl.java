package nju.edu.express.businesserdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.DriverPO;
import nju.edu.express.businesserdataservice.DriverDataService;

public class DriverDataImpl extends UnicastRemoteObject implements DriverDataService {

	public DriverDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public DriverPO[] getDriverList(String bussinessID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverPO getDriver(String CarID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertDriver(DriverPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDriver(String DriverID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDriver(DriverPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
