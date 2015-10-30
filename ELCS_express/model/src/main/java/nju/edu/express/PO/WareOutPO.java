package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 库存出库单——快递编号 orderList、出库日期date、目的地destinationID、装运形式postKind（火车、飞机、汽车）、中转单编号或者汽运编号dispatchIDorCarryID
 * @author asd
 *
 */
public class WareOutPO {
	ArrayList<String> orderList;
	String date;
	String destinationID;
	int postKind;
	String dispatchIDorCarryID;
	/**
	 * @param orderList
	 * @param date
	 * @param destinationID
	 * @param postKind
	 * @param dispatchIDorCarryID
	 */
	public WareOutPO(ArrayList<String> orderList, String date,
			String destinationID, int postKind, String dispatchIDorCarryID) {
		super();
		this.orderList = orderList;
		this.date = date;
		this.destinationID = destinationID;
		this.postKind = postKind;
		this.dispatchIDorCarryID = dispatchIDorCarryID;
	}
	public WareOutPO(){
		
	}
	public ArrayList<String> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<String> orderList) {
		this.orderList = orderList;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDestinationID() {
		return destinationID;
	}
	public void setDestinationID(String destinationID) {
		this.destinationID = destinationID;
	}
	public int getPostKind() {
		return postKind;
	}
	public void setPostKind(int postKind) {
		this.postKind = postKind;
	}
	public String getDispatchIDorCarryID() {
		return dispatchIDorCarryID;
	}
	public void setDispatchIDorCarryID(String dispatchIDorCarryID) {
		this.dispatchIDorCarryID = dispatchIDorCarryID;
	}
	
}
