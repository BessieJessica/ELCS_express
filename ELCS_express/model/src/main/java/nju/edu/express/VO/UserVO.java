package nju.edu.express.VO;

public class UserVO {

	String userID;
	String access;
	
	public UserVO(String userID, String access) {
		super();
		this.userID = userID;
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

}
