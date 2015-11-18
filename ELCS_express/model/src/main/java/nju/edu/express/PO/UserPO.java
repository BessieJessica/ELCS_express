package nju.edu.express.PO;

import java.io.Serializable;

import nju.edu.express.enumdata.StuffAccess;

/**
 * 用户——用户IDuserID，用户密码password，用户权限级别access
 * 
 * @author asd
 *
 */
public class UserPO implements Serializable {

	String userID;
	String password;
	String name;
	String business;
	String city;
	String access;

	public UserPO(String userID, String password, String name, String business,
			String city, String access) {
		super();
		this.userID = userID;
		this.password = password;
		this.name = name;
		this.business = business;
		this.city = city;
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

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
