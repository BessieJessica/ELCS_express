package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.OrderPO;

public interface BalanceDataService {

	/**
	 * 更新营业厅业务员的收款单的信息
	 */
	public void insertBalance(OrderPO orderPO);
}
