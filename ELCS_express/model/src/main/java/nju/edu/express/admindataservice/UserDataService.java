package nju.edu.express.admindataservice;

import nju.edu.express.PO.UserPO;

public interface UserDataService {

	/**
	 * 查找用户账户的多个持久化对象
	 */
	public UserPO[] getUserList();
	
	/**
	 * 根据ID进行查找单一持久化对象
	 */
	public UserPO getUser(String userID);
	
	/**
	 * 插入单一持久化对象
	 */
	public void insertUser(UserPO po);
	
	/**
	 * 删除单一持久化对象
	 */
	public void deleteUser(String userID);
	
	/**
	 * 更新单一持久化对象
	 */
	public void updateUser(UserPO po);

}