package nju.edu.express.financeblservice;

import nju.edu.express.VO.AccountVO;

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
}
