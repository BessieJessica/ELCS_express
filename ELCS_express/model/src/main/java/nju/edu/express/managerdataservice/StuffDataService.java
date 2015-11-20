package nju.edu.express.managerdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.StuffPO;

public interface StuffDataService extends Remote{

	/**
	 * 获得人员列表
	 */
	public StuffPO[] getStuffList()throws RemoteException;
	
	/**
	 * 根据人员ID获得人员信息
	 */
	public StuffPO getStuff(String stuffID)throws RemoteException;
	
	/**
	 * 在数据库中插入StuffPO对象
	 */
	public boolean insertStuff (StuffPO po)throws RemoteException;
	
	/**
	 * 在数据库中删除StuffPO对象
	 */
	public boolean deleteStuff(String[] stuffID)throws RemoteException;
	
}
