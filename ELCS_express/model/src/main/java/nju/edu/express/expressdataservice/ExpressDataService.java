package nju.edu.express.expressdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.OrderPO;

public interface ExpressDataService extends Remote{

	/**
	 * 根据快递员ID查找多个持久化对象
	 */
	public OrderPO[] getOrderList(String expressID)throws RemoteException;
	
	/**
	 * 根据ID查找单一持久化对象
	 */
	public OrderPO getOrder(String orderID)throws RemoteException;
	
	/**
	 * 增加单一持久化对象
	 */
	public boolean insertOrder(OrderPO po)throws RemoteException;
	
	/**
	 * 更新订单信息
	 * @param orderID
	 * @return
	 */
	public boolean updateOrder(String[] orderID)throws RemoteException;
}
