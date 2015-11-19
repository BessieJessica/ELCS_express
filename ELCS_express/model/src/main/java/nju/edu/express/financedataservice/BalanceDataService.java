package nju.edu.express.financedataservice;

import nju.edu.express.PO.BalancePO;

public interface BalanceDataService {

	/**
	 * 根据营业厅ID和日期查找多个持久化对象
	 */
	public BalancePO[] getBalanceList(String BusinessId, String date);
	
	/**
	 * 通过日期获得所有收款单的金额
	 */
	public double getTotalIncome(String date);
	
	/**
	 * 在数据库中更新银行账户余额
	 */
	public boolean updateAccount(double totalIncome);
	

}
