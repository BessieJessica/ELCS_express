package nju.edu.express.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.AccountPO;

public interface AccountDataService extends Remote {

	/**
	 * 查找多个银行账户持久化对象
	 */
	public AccountPO[] getAccountList() throws RemoteException;

	/**
	 * 根据银行账户ID查找持久化对象
	 */
	public AccountPO getAccount(String accountID) throws RemoteException;

	/**
	 * 在数据库中添加一个银行账户持久化对象
	 */
	public boolean insertAccount(AccountPO po) throws RemoteException;

	/**
	 * 在数据库中删除一个银行账户持久化对象
	 */
	public boolean deleteAccount(String[] accountID) throws RemoteException;

	/**
	 * 在数据库中根据accountID对一个银行账户持久化对象进行修改
	 */
	public boolean updateAccount(String accountID, AccountPO po)
			throws RemoteException;
}
