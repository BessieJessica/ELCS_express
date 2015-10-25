package nju.edu.express.signinblservice;

public interface SigninBlService {
	
	/**
	 * 判断输入的用户名密码是否格式正确
	 */
	public boolean isValid(String id,String password);
	
	/**
	 * 判断输入用户名密码是否在系统中并匹配
	 */
	public boolean isCorrect(String id,String password);
}
