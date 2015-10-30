package nju.edu.express.PO;
/**
 * 司机编号driverID、姓名name、出生日期birthday、身份证号identityCardID、手机phoneNumber、车辆单位organizationID、性别sex、行驶证期限timeOfLicense
 * @author asd
 *
 */
public class DriverPO {

	/**
	 * 司机编号城市编号（电话号码区号南京025）+营业厅编号（000三位数字）+000三位数字
	 */
	String driverID;
	String name;
	String birthday;
	String identityCardID;
	String phoneNumber;
	String organizationID;
	int sex;
	String timeOfLicense;
	
	/**
	 * @param driverID
	 * @param name
	 * @param birthday
	 * @param identityCardID
	 * @param phoneNumber
	 * @param organizationID
	 * @param sex
	 * @param timeOfLicense
	 */
	public DriverPO(String driverID, String name, String birthday,
			String identityCardID, String phoneNumber, String organizationID,
			int sex, String timeOfLicense) {
		super();
		this.driverID = driverID;
		this.name = name;
		this.birthday = birthday;
		this.identityCardID = identityCardID;
		this.phoneNumber = phoneNumber;
		this.organizationID = organizationID;
		this.sex = sex;
		this.timeOfLicense = timeOfLicense;
	}
	public DriverPO(){
		
	}
	public String getDriverID() {
		return driverID;
	}
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIdentityCardID() {
		return identityCardID;
	}
	public void setIdentityCardID(String identityCardID) {
		this.identityCardID = identityCardID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrganizationID() {
		return organizationID;
	}
	public void setOrganizationID(String organizationID) {
		this.organizationID = organizationID;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTimeOfLicense() {
		return timeOfLicense;
	}
	public void setTimeOfLicense(String timeOfLicense) {
		this.timeOfLicense = timeOfLicense;
	}
	public DriverPO(String iD){
		super();
		driverID=iD;
	}
	public String getID() {
		return driverID;
	}

	public void setID(String iD) {
		driverID = iD;
	}
	
}
