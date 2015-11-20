package nju.edu.express.transiterdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.OutTransPO;

public interface OutTransDataService extends Remote{

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public OutTransPO[] getOutTransList(String TransitID)throws RemoteException;
	
	/**
	 * 根据OutTransID 查找单一持久化对象
	 */
	public OutTransPO getOutTrans(String OutTransID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertOutTrans(OutTransPO po)throws RemoteException;
}
