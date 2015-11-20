package nju.edu.express.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.DepartmentPO;
import nju.edu.express.managerdataservice.DepartmentDataService;

public class DepartmentDataImpl extends UnicastRemoteObject implements DepartmentDataService {

	public DepartmentDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public DepartmentPO[] getDepartmentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertDepartment(DepartmentPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDepartment(String[] departmentID) {
		// TODO Auto-generated method stub
		return false;
	}

}
