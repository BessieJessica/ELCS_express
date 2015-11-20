package nju.edu.express.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.TablePO;
import nju.edu.express.managerdataservice.TableDataService;

public class TableDataImpl extends UnicastRemoteObject implements TableDataService {

	public TableDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public TablePO[] getTableList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTable(String[] tableID) {
		// TODO Auto-generated method stub
		return false;
	}

}
