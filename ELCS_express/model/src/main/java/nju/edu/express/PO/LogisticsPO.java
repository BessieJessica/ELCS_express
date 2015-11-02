package nju.edu.express.PO;

import java.io.Serializable;

/**
 * 物流信息--订单编号；货运状态（收件、到达寄件人营业厅、到达寄件人中转中心、到达收件人中转中心、到达收件人营业厅、派件中、已接收）
 * 
 * @author asd
 *
 */
public class LogisticsPO implements Serializable {

	String orderID;
	String expressInfo;
	String contact;
	
	
	public LogisticsPO(String orderID, String expressInfo, String contact) {
		super();
		this.orderID = orderID;
		this.expressInfo = expressInfo;
		this.contact = contact;
	}
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getExpressInfo() {
		return expressInfo;
	}
	public void setExpressInfo(String expressInfo) {
		this.expressInfo = expressInfo;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
