package nju.edu.express.transiterdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.DispatchPO;

public interface DispatchDataService extends Remote{

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public DispatchPO[] getDispatchList(String TransitID)throws RemoteException;
	
	/**
	 * 根据DispatchID查找单一持久化对象
	 */
	public DispatchPO getDispatch(String DispatchID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertDispatch(DispatchPO po)throws RemoteException;
}
