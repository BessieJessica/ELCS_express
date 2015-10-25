package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.PO.OrderPO;

public interface BalanceDataService {

	/**
	 * 更新营业厅业务员的收款单的信息
	 */
	public void insertBalance(OrderPO orderPO);
	
	/**
	 * 根据营业厅ID和日期字段名查找多个持久化对象
	 */
	public BalancePO[] getBalanceList(String BusinessId, String date);
	
	/**
	 * 根据BalanceID 查找单一持久化对象
	 */
	public BalancePO getBalance(String BalanceID);
	
}
