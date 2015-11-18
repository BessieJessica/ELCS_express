package nju.edu.express.admindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.UserPO;

public interface UserDataService extends Remote{

	/**
	 * 查找用户账户的多个持久化对象
	 */
	public UserPO[] getUserList() throws RemoteException;
	
	/**
	 * 根据ID进行查找单一持久化对象
	 */
	public UserPO getUser(String userID) throws RemoteException;
	
	/**
	 * 插入单一持久化对象
	 */
	public boolean insertUser(UserPO po) throws RemoteException;
	
	/**
	 * 删除单一持久化对象
	 */
	public boolean deleteUser(String userID) throws RemoteException;
	
	/**
	 * 更新单一持久化对象
	 */
	public boolean updateUser(UserPO po) throws RemoteException;

}
