package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 派件单——到达日期date、托运订单号orderList、派送员expressID
 * @author asd
 *
 */
public class DistributePO {
	String date;
	String expressID;
	ArrayList<String> orderList;
	String ID;

	/**
	 * @param date
	 * @param expressID
	 * @param orderList
	 */
	public DistributePO(String date, String expressID,
			ArrayList<String> orderList) {
		super();
		this.date = date;
		this.expressID = expressID;
		this.orderList = orderList;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getExpressID() {
		return expressID;
	}
	public void setExpressID(String expressID) {
		this.expressID = expressID;
	}
	public ArrayList<String> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<String> orderList) {
		this.orderList = orderList;
	}
	/**
	 * @param iD
	 */
	public DistributePO(String iD) {
		super();
		ID = iD;
	}
	public DistributePO(){
		
	}
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
}
