package nju.edu.express.businesserblservice;

import nju.edu.express.VO.BalanceVO;

public interface BalanceBlService {

	/**
	 * 根据businessID获得相应的收款单信息列表
	 */
	public BalanceVO[] getBalanceList(String businessID);
	
	/**
	 * 根据balanceID获得相应的收款单信息
	 */
	public BalanceVO getBalance(String balanceID);
	
}