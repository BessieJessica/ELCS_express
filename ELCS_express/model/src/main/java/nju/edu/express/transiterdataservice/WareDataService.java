package nju.edu.express.transiterdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.OrderPO;

public interface WareDataService extends Remote{

	/**
	 * 向WareData中添加OrderID
	 * @param orderID
	 * @return
	 * @throws RemoteException
	 */
	public boolean insertOrder(String orderID)throws RemoteException;
	
	/**
	 * 获得储存在该仓库的订单列表
	 * @param wareID
	 * @return
	 * @throws RemoteException
	 */
	public OrderPO[] getOrderList(String wareID)throws RemoteException;
}
