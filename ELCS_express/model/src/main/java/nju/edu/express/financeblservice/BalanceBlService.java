package nju.edu.express.financeblservice;

import nju.edu.express.VO.BalanceVO;

public interface BalanceBlService {

	/**
	 * 通过businessID查看相应收款单列表
	 */
	public BalanceVO[] getBalanceList(String businessID, String date);

	/**
	 * 根据收款单总额更新银行账户金额
	 * @param businessID
	 * @param vo
	 * @return
	 */
	public boolean updateBalanceToAccount(String businessID, BalanceVO vo);
}
