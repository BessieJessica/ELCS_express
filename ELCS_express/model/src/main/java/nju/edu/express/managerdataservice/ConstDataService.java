package nju.edu.express.managerdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.ConstPO;

public interface ConstDataService extends Remote{

	/**
	 * 获得常量列表
	 */
	public ConstPO[] getConstList()throws RemoteException;
	
	/**
	 * 更新ConstPO
	 */
	public boolean updateConst(ConstPO[] po)throws RemoteException;
	
}
