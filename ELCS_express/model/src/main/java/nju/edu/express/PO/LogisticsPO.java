package nju.edu.express.PO;
/**
 * 物流信息--订单编号；货运状态（收件、到达寄件人营业厅、到达寄件人中转中心、到达收件人中转中心、到达收件人营业厅、派件中、已接收）
 * @author asd
 *
 */
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
