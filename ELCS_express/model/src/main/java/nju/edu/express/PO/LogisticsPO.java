package nju.edu.express.PO;

public class LogisticsPO {

	String orderID;
	String businessInfo;
	String warehouseInfo;
	String expresser;
	String contact;
	
	public LogisticsPO(String orderID,String businessInfo,String warehouseInfo,String expresser,String contact) {
		this.orderID = orderID;
		this.businessInfo = businessInfo;
		this.warehouseInfo = warehouseInfo;
		this.expresser = expresser;
		this.contact = contact;
	}

	public String getOrderID() {
		return orderID;
	}

	public String getBusinessInfo() {
		return businessInfo;
	}

	public String getWarehouseInfo() {
		return warehouseInfo;
	}

	public String getExpresser() {
		return expresser;
	}

	public String getContact() {
		return contact;
	}
}
