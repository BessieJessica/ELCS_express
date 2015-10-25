package nju.edu.express.logisticsdataservice;

import nju.edu.express.PO.LogisticsPO;

public interface LogisticsDataService {

	/**
	 * 根据ID查找单一持久化对象
	 */
	public LogisticsPO getLogistics(String orderID);
	
	/**
	 * 增加单一持久化对象
	 */
	public void insertLogistics(LogisticsPO po);
}
