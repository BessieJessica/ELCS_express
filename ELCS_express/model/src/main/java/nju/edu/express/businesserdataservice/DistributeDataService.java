package nju.edu.express.businesserdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.DistributePO;

public interface DistributeDataService extends Remote{

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public DistributePO[] getDistributeList(String bussinessID)throws RemoteException;
	
	/**
	 * 根据DistributeID 查找单一持久化对象
	 */
	public DistributePO getDistribute(String DistributeID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertDistribute(DistributePO po)throws RemoteException;
}
