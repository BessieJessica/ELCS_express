package nju.edu.express.VO;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

public class LogisticsVO {

	String orderID;
	Timestamp time;
	String expressInfo;
	String contact;
	
	
	public LogisticsVO(String orderID, Timestamp timestamp, String expressInfo, String contact) {
		super();
		this.orderID = orderID;
		this.time = timestamp;
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

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}
	

}
