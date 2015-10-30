package nju.edu.express.PO;

import java.util.ArrayList;
/**
 * 收款单－包含营业厅编号businessID、收款日期date、收款金额amountList、收款快递员expressID、对应的所有快递订单条形码号orderIDList
 * @author asd
 *
 */
public class BalancePO {
	String businessID;
	String expressID;
	String date;
	ArrayList<String> amountList;
	ArrayList<String> orderIDList;
	String ID;
	
	/**
	 * @param businessID
	 * @param expressID
	 * @param date
	 * @param amountList
	 * @param orderIDList
	 */
	public BalancePO(String businessID, String expressID, String date,
			ArrayList<String> amountList, ArrayList<String> orderIDList) {
		super();
		this.businessID = businessID;
		this.expressID = expressID;
		this.date = date;
		this.amountList = amountList;
		this.orderIDList = orderIDList;
	}
	public String getBusinessID() {
		return businessID;
	}
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}
	public String getExpressID() {
		return expressID;
	}
	public void setExpressID(String expressID) {
		this.expressID = expressID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<String> getAmountList() {
		return amountList;
	}
	public void setAmountList(ArrayList<String> amountList) {
		this.amountList = amountList;
	}
	public ArrayList<String> getOrderIDList() {
		return orderIDList;
	}
	public void setOrderIDList(ArrayList<String> orderIDList) {
		this.orderIDList = orderIDList;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @param iD
	 */
	public BalancePO(String iD) {
		super();
		ID = iD;
	}
	
	
}
