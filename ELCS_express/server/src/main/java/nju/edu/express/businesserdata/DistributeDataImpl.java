package nju.edu.express.businesserdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.DistributePO;
import nju.edu.express.businesserdataservice.DistributeDataService;

public class DistributeDataImpl extends UnicastRemoteObject implements DistributeDataService {

	public DistributeDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public DistributePO[] getDistributeList(String bussinessID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DistributePO getDistribute(String DistributeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertDistribute(DistributePO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
