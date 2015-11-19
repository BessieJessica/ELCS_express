package nju.edu.express.businesserdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.InTransPO;

public interface InTransDataService extends Remote{

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public InTransPO[] getInTransList (String bussinessID)throws RemoteException;
	
	/**
	 * 根据InTransID 查找单一持久化对象
	 */
	public InTransPO getInTrans(String InTransID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertInTrans(InTransPO po)throws RemoteException;
	
}
