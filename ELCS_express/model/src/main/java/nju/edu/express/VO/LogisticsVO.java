package nju.edu.express.VO;

public class LogisticsVO {

	String orderID;
	String businessInfo;
	String warehouseInfo;
	String expresser;
	String contact;
	
	public LogisticsVO(String orderID,String businessInfo,String warehouseInfo,String expresser,String contact) {
		this.orderID = orderID;
		this.businessInfo = businessInfo;
		this.warehouseInfo = warehouseInfo;
		this.expresser = expresser;
		this.contact = contact;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getBusinessInfo() {
		return businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
	}

	public String getWarehouseInfo() {
		return warehouseInfo;
	}

	public void setWarehouseInfo(String warehouseInfo) {
		this.warehouseInfo = warehouseInfo;
	}

	public String getExpresser() {
		return expresser;
	}

	public void setExpresser(String expresser) {
		this.expresser = expresser;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
