package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 公司账目－机构organizationIDList、人员stuffIDlIST、车辆carIDList、库存orderList、 银行账户信息（名称AccountID，余额AccountNum）。
 * @author asd
 *
 */
public class BookPO {
	ArrayList<String> organizationIDList;
	ArrayList<String> stuffIDlIST;
	ArrayList<String> orderList;
	ArrayList<String> carIDList;
	String AccountID;
	double AccountNum;
	/**
	 * @param organizationIDList
	 * @param stuffIDlIST
	 * @param orderList
	 * @param carIDList
	 * @param accountID
	 * @param accountNum
	 */
	public BookPO(ArrayList<String> organizationIDList,
			ArrayList<String> stuffIDlIST, ArrayList<String> orderList,
			ArrayList<String> carIDList, String accountID, double accountNum) {
		super();
		this.organizationIDList = organizationIDList;
		this.stuffIDlIST = stuffIDlIST;
		this.orderList = orderList;
		this.carIDList = carIDList;
		AccountID = accountID;
		AccountNum = accountNum;
	}
	public BookPO(){
		
	}
	public ArrayList<String> getOrganizationIDList() {
		return organizationIDList;
	}
	public void setOrganizationIDList(ArrayList<String> organizationIDList) {
		this.organizationIDList = organizationIDList;
	}
	public ArrayList<String> getStuffIDlIST() {
		return stuffIDlIST;
	}
	public void setStuffIDlIST(ArrayList<String> stuffIDlIST) {
		this.stuffIDlIST = stuffIDlIST;
	}
	public ArrayList<String> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<String> orderList) {
		this.orderList = orderList;
	}
	public ArrayList<String> getCarIDList() {
		return carIDList;
	}
	public void setCarIDList(ArrayList<String> carIDList) {
		this.carIDList = carIDList;
	}
	public String getAccountID() {
		return AccountID;
	}
	public void setAccountID(String accountID) {
		AccountID = accountID;
	}
	public double getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(double accountNum) {
		AccountNum = accountNum;
	}
}
