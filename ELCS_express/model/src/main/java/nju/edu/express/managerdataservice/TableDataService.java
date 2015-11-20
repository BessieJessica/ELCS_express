package nju.edu.express.managerdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.TablePO;

public interface TableDataService extends Remote{

	/**
	 * 获得单据列表
	 */
	public TablePO[] getTableList()throws RemoteException;
	
	/**
	 * 根据表单的ID更新TablePO
	 */
	public boolean updateTable(String[] tableID)throws RemoteException;
	
}
