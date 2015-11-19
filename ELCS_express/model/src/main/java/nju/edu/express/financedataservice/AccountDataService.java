package nju.edu.express.financedataservice;

import nju.edu.express.PO.AccountPO;

public interface AccountDataService {

	/**
	 * 查找多个银行账户持久化对象
	 */
	public AccountPO[] getAccountList();
	
	/**
	 * 根据银行账户ID查找持久化对象
	 */
	public AccountPO getAccount(String accountID);
	
	/**
	 * 在数据库中添加一个银行账户持久化对象
	 */
	public boolean insertAccount(AccountPO po);
	
	/**
	 * 在数据库中删除一个银行账户持久化对象
	 */
	public boolean deleteAccount(String[] accountID);
	
	/**
	 * 在数据库中对一个银行账户持久化对象进行修改
	 */
	public boolean updateAccount(AccountPO po);
}
