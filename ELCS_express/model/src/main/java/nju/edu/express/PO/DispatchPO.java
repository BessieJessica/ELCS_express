package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 中转中心中转单——装车日期date、本中转中心中转单编号transistID（中转中心编号+日期+0000000七位数字），航班号flightID、出发地startPlaceID、到达地startPlaceID、货柜号、监装员startPlaceID、本次装箱所有托运单号orderList、运费feight（运费根据出发地和目的地自动生成）
 * @author asd
 * 还缺点。
 *
 */
public class DispatchPO {

	String date;
	String transistID;
	String startPlaceID;
	String destinationID;
	String jianzhuangyuan;
	String flightID;
	double freight;
	ArrayList<String> orderList;
	String ID;
	/**
	 * @param date
	 * @param transistID
	 * @param startPlaceID
	 * @param destinationID
	 * @param jianzhuangyuan
	 * @param flightID
	 * @param freight
	 * @param orderList
	 */
	public DispatchPO(String date, String transistID, String startPlaceID,
			String destinationID, String jianzhuangyuan, String flightID,
			double freight, ArrayList<String> orderList) {
		super();
		this.date = date;
		this.transistID = transistID;
		this.startPlaceID = startPlaceID;
		this.destinationID = destinationID;
		this.jianzhuangyuan = jianzhuangyuan;
		this.flightID = flightID;
		this.freight = freight;
		this.orderList = orderList;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTransistID() {
		return transistID;
	}

	public void setTransistID(String transistID) {
		this.transistID = transistID;
	}

	public String getStartPlaceID() {
		return startPlaceID;
	}

	public void setStartPlaceID(String startPlaceID) {
		this.startPlaceID = startPlaceID;
	}

	public String getDestinationID() {
		return destinationID;
	}

	public void setDestinationID(String destinationID) {
		this.destinationID = destinationID;
	}

	public String getJianzhuangyuan() {
		return jianzhuangyuan;
	}

	public void setJianzhuangyuan(String jianzhuangyuan) {
		this.jianzhuangyuan = jianzhuangyuan;
	}

	public String getFlightID() {
		return flightID;
	}

	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	public double getFreight() {
		return freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	public ArrayList<String> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<String> orderList) {
		this.orderList = orderList;
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
	public DispatchPO(String iD) {
		super();
		ID = iD;
	}
	public DispatchPO(){
		
	}
}
