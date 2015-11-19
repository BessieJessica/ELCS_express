package nju.edu.express.businesserdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.InArrivalPO;

public interface InArrivalDataService extends Remote{

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public InArrivalPO[] getInArrivalList(String bussinessID)throws RemoteException;
	
	/**
	 * 根据InArrivalID 查找单一持久化对象
	 */
	public InArrivalPO getInArrival(String InArrivalID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertInArrival(InArrivalPO po)throws RemoteException;
	
}
