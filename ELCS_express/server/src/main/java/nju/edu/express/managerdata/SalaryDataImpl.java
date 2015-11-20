package nju.edu.express.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.SalaryPO;
import nju.edu.express.managerdataservice.SalaryDataService;

public class SalaryDataImpl extends UnicastRemoteObject implements SalaryDataService {

	public SalaryDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public SalaryPO[] getSalaryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalaryPO getSalary(String positionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateSalary(SalaryPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
