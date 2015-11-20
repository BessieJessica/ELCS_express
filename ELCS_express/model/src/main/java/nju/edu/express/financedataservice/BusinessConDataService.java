package nju.edu.express.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.BusinessConPO;

public interface BusinessConDataService extends Remote{

	/**
	 * 获得经营情况表
	 */
	public BusinessConPO getBusinessConChart()throws RemoteException;
}
