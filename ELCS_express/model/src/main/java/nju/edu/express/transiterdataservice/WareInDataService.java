package nju.edu.express.transiterdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.WareInPO;

public interface WareInDataService extends Remote{

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public WareInPO[] getWareInList(String TransitID)throws RemoteException;
	
	/**
	 * 根据WareInID 查找单一持久化对象
	 */
	public WareInPO getWareIn(String WareInID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertWareIn(WareInPO po)throws RemoteException;
	
	
}
