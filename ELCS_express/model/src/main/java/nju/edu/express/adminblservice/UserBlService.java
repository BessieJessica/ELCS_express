package nju.edu.express.adminblservice;

import nju.edu.express.VO.UserVO;

public interface UserBlService {

	/**
	 * 获得用户列表
	 */
	public UserVO[] getUserList();
	
	/**
	 * 根据userID获得相应用户信息
	 */
	public UserVO getUser(String userID);
	
	/**
	 * 新增用户信息
	 */
	public boolean addUser(UserVO vo);
	
	/**
	 * 根据userID删除相应用户信息
	 */
	public boolean delUser(String[] userID);
	
	/**
	 * 完成修改信息后，更新用户信息
	 */
	public boolean endUser(UserVO vo);
}
