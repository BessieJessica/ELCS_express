package nju.edu.express.VO;

import nju.edu.express.enumdata.StuffAccess;

public class UserVO {

	String userID;
	String password;
	String name;
	String business;
	String city;
	StuffAccess access;

	public UserVO(String userID, String password, String name, String business,
			String city, StuffAccess access) {
		super();
		this.userID = userID;
		this.password = password;
		this.name = name;
		this.business = business;
		this.city = city;
		this.access = access;
	}

	public StuffAccess getAccess() {
		return access;
	}

	public void setAccess(StuffAccess access) {
		this.access = access;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
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
