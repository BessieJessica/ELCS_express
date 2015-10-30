package nju.edu.express.logisticsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.LogisticsPO;

public interface LogisticsDataService extends Remote{

	/**
	 * 根据ID查找单一持久化对象
	 */
	public LogisticsPO getLogistics(String orderID) throws RemoteException;
	
	/**
	 * 增加单一持久化对象
	 */
	public void insertLogistics(LogisticsPO po) throws RemoteException;
}
