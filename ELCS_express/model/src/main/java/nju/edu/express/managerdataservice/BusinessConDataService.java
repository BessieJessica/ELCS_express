package nju.edu.express.managerdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.BusinessConPO;

public interface BusinessConDataService extends Remote{

	/**
	 * 获得一段时间内的经营情况表
	 */
	public BusinessConPO getBusinessConList(String beginDate, String endDate)throws RemoteException;
	
}
