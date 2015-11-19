package nju.edu.express.financeblservice;

import nju.edu.express.VO.BalanceVO;

public interface BalanceBlService {

	/**
	 * 通过businessID查看相应收款单列表
	 */
	public BalanceVO[] getBalanceList(String businessID);
	
	/**
	 * 通过balanceID来更新相应信息
	 */
	public boolean endBalance(double totalIncome);
}
