package nju.edu.express.expressdataservice;

import nju.edu.express.PO.OrderPO;

public interface ExpressDataService {

	/**
	 * 根据快递员ID查找多个持久化对象
	 */
	public OrderPO[] getOrderList(String expressID);
	
	/**
	 * 根据ID查找单一持久化对象
	 */
	public OrderPO getOrder(String orderID);
	
	/**
	 * 增加单一持久化对象
	 */
	public void insertOrder(OrderPO po);
}
