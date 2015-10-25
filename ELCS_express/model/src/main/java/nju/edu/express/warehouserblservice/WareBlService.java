package nju.edu.express.warehouserblservice;

import nju.edu.express.VO.OrderVO;

public interface WareBlService {

	/**
	 * 根据wareID获得相应的库存（订单）信息列表
	 */
	public OrderVO[] getOrderList(String wareID);
	
	/**
	 * 根据orderID更新相应的库存信息
	 */
	public void endOrder(String[] orderID);
}
