package nju.edu.express.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.BalancePO;

public interface BalanceDataService extends Remote {

	/**
	 * 根据营业厅ID和日期查找多个持久化对象
	 */
	public BalancePO[] getBalanceList(String BusinessId, String date)
			throws RemoteException;

}
