package nju.edu.express.financeblservice;

import nju.edu.express.VO.AccountVO;
import nju.edu.express.VO.BalanceVO;
import nju.edu.express.VO.PaymentVO;

public interface AccountBlService {

	/**
	 * 获得银行账户列表
	 */
	public AccountVO[] getAccountList();
	
	/**
	 * 根据accountID获得银行账户信息
	 */
	public AccountVO getAccount(String accountID);
	
	/**
	 * 添加银行账户
	 */
	public boolean addAccount(AccountVO vo);
	
	/**
	 * 根据accountID删除银行账户
	 */
	public boolean delAccount(String[] accountID);
	
	/**
	 * 根据AccountID更新银行账户信息，可能是金额也可能是账户名称
	 * @param accountID
	 * @param vo
	 * @return
	 */
	public boolean endAccount(String accountID, AccountVO vo);
	
	/**
	 * 根据收款单的总额来更新银行账户信息
	 * @param businessID
	 * @param vo
	 * @return
	 */
	public boolean updateBalanceIncome(String businessID, BalanceVO vo);
	
	/**
	 * 根据付款单的总额来更新银行账户信息
	 * @param accountID
	 * @param vo
	 * @return
	 */
	public boolean updatePaymentOutcome(String accountID, PaymentVO vo);
}
