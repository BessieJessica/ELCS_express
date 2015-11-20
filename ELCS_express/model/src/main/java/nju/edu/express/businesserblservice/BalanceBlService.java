package nju.edu.express.businesserblservice;

import nju.edu.express.VO.BalanceVO;

public interface BalanceBlService {

	/**
	 * 根据businessID和date获得相应的收款单信息列表
	 */
	public BalanceVO[] getBalanceList(String businessID, String date);

	/**
	 * 根据balanceID获得相应的收款单信息
	 */
	public BalanceVO getBalance(String balanceID);

	/**
	 * 添加收款单
	 * 
	 * @param vo
	 * @return
	 */
	public boolean addBalance(String businessID, BalanceVO vo);

}
