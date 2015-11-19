package nju.edu.express.businesserdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.DriverPO;

public interface DriverDataService extends Remote{

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public DriverPO[] getDriverList(String bussinessID)throws RemoteException;
	
	/**
	 * 根据DriverID 查找单一持久化对象
	 */
	public DriverPO getDriver(String CarID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertDriver(DriverPO po)throws RemoteException;
	
	/**
	 * 删除一个持久化对象
	 */
	public boolean deleteDriver(String DriverID)throws RemoteException;
	
	/**
	 * 更改一个持久化对象
	 */
	public boolean updateDriver(DriverPO po)throws RemoteException;
}

