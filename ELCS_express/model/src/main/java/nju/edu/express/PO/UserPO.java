package nju.edu.express.PO;

import java.io.Serializable;

/**
 * 用户——用户IDuserID，用户密码password，用户权限级别access
 * @author asd
 *
 */
public class UserPO implements Serializable{

	String userID;
	String password;
	String access;
	public UserPO(String userID, String password, String access) {
		super();
		this.userID = userID;
		this.password = password;
		this.access = access;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
