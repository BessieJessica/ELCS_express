package nju.edu.express.signinblservice;

import java.rmi.RemoteException;

import nju.edu.express.enumdata.StuffAccess;




public interface SigninBlService {
	
	/**
	 * 判断输入的用户名密码是否格式正确
	 * @param id 用户名
	 * @param password 密码
	 * @return boolean
	 */
	public boolean isValid(String id,String password) throws RemoteException;
	
	/**
	 * 判断输入用户名密码是否在系统中并匹配
	 * @param id 用户名
	 * @param password 密码
	 * @return StuffAccess
	 */
	public StuffAccess isCorrect(String id,String password)throws RemoteException;
}
