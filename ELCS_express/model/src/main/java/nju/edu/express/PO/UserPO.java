package nju.edu.express.PO;
/**
 * 用户——用户IDuserID，用户职务，用户密码password，用户权限级别access
 * @author asd
 *
 */
public class UserPO {

	String userID;
	String password;
	String access;
	int userJob;
	public int getUserJob() {
		return userJob;
	}
	public void setUserJob(int userJob) {
		this.userJob = userJob;
	}
	public UserPO(String userID, String password, String access,int userJob) {
		super();
		this.userID = userID;
		this.password = password;
		this.access = access;
		this.userJob=userJob;
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
