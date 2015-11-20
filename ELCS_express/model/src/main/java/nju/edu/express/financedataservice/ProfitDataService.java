package nju.edu.express.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.ProfitPO;

public interface ProfitDataService extends Remote{

	/**
	 * 从数据库中查询成本收益表
	 */
	public ProfitPO getProfitChart()throws RemoteException;
	
}
