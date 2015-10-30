package nju.edu.express.PO;
/**
 * 车辆信息————车辆代号carID、发动机号engineID、车牌号licensePlateNumber、底盘号chassisID、购买时间dateOfBuy、服役时间timeOfUse
 * 
 * @author asd
 *
 */
public class CarPO {

	/**
	 * carID:
	 * 城市编号（电话号码区号南京025）+营业厅编号（000三位数字）+000三位数字
	 */
	String carID;
	String engineID;
	String chassisID;
	/**
	 * licensePlateNumber:
	 * 苏A 00000
	 */
	String licensePlateNumber;
	String dateOfBuy;
	String timeOfUse;
	/**
	 * @param carID
	 * @param engineID
	 * @param chassisID
	 * @param dateOfBuy
	 * @param timeOfUse
	 */
	public CarPO(String carID, String engineID, String chassisID,
			String dateOfBuy, String timeOfUse) {
		super();
		this.carID = carID;
		this.engineID = engineID;
		this.chassisID = chassisID;
		this.dateOfBuy = dateOfBuy;
		this.timeOfUse = timeOfUse;
	}

	public String getEngineID() {
		return engineID;
	}

	public void setEngineID(String engineID) {
		this.engineID = engineID;
	}

	public String getChassisID() {
		return chassisID;
	}

	public void setChassisID(String chassisID) {
		this.chassisID = chassisID;
	}

	public String getDateOfBuy() {
		return dateOfBuy;
	}

	public void setDateOfBuy(String dateOfBuy) {
		this.dateOfBuy = dateOfBuy;
	}

	public String getTimeOfUse() {
		return timeOfUse;
	}

	public void setTimeOfUse(String timeOfUse) {
		this.timeOfUse = timeOfUse;
	}

	/**
	 * @param iD
	 */
	public CarPO(String iD) {
		super();
		carID = iD;
	}

	public String getID() {
		return carID;
	}

	public void setID(String iD) {
		carID = iD;
	}
}
