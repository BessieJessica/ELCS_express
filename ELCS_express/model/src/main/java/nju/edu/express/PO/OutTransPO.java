package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 中转中心装车单——装车日期date、本中转中心汽运编号carryID（中转中心编号+日期+0000000七位数字）、到达地ArrivalID（营业厅）、车辆代号carID、监装员jianzhuangyuan、押运员yayunyuan、
 * 本次装箱所有订单条形码号orderList）、运费freight（运费根据出发地和目的地自动生成）	
 * 
 *
 */
public class OutTransPO {
	String ID;
	String date;
	/**
	 * 汽运编号,(中转中心编号+日期+0000000七位数字)
	 */
	String carryID;
	String ArrivalID;
	String carID;
	String jianzhuangyuan;
	String yayunyuan;
	Double freight;
	ArrayList<String> orderList;
	
	
	public OutTransPO(){
		
	}
	/**
	 * @param iD
	 */
	public OutTransPO(String iD) {
		super();
		ID = iD;
	}
	/**
	 * @param date
	 * @param carryID
	 * @param arrivalID
	 * @param carID
	 * @param jianzhuangyuan
	 * @param yayunyuan
	 * @param freight
	 * @param orderList
	 */
	public OutTransPO(String date, String carryID, String arrivalID,
			String carID, String jianzhuangyuan, String yayunyuan,
			Double freight, ArrayList<String> orderList) {
		super();
		this.date = date;
		this.carryID = carryID;
		ArrivalID = arrivalID;
		this.carID = carID;
		this.jianzhuangyuan = jianzhuangyuan;
		this.yayunyuan = yayunyuan;
		this.freight = freight;
		this.orderList = orderList;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCarryID() {
		return carryID;
	}
	public void setCarryID(String carryID) {
		this.carryID = carryID;
	}
	public String getArrivalID() {
		return ArrivalID;
	}
	public void setArrivalID(String arrivalID) {
		ArrivalID = arrivalID;
	}
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	public String getJianzhuangyuan() {
		return jianzhuangyuan;
	}
	public void setJianzhuangyuan(String jianzhuangyuan) {
		this.jianzhuangyuan = jianzhuangyuan;
	}
	public String getYayunyuan() {
		return yayunyuan;
	}
	public void setYayunyuan(String yayunyuan) {
		this.yayunyuan = yayunyuan;
	}
	public Double getFreight() {
		return freight;
	}
	public void setFreight(Double freight) {
		this.freight = freight;
	}
	public ArrayList<String> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<String> orderList) {
		this.orderList = orderList;
	}
	
}
