package nju.edu.express.transiterdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.OutArrivalPO;

public interface OutArrivalDataService extends Remote{

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public OutArrivalPO[] getOutArrivalList(String TransitID)throws RemoteException;
	
	/**
	 * 根据OutArrivalID 查找单一持久化对象
	 */
	public OutArrivalPO getOutArrival(String OutArrivalID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertOutArrival(OutArrivalPO po)throws RemoteException;
	
	
}
