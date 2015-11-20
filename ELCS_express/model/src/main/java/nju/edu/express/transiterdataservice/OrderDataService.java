package nju.edu.express.transiterdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.OrderPO;

public interface OrderDataService extends Remote{

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public OrderPO[] getOrderList(String TransitID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertOrder(String OrderID)throws RemoteException;
}
