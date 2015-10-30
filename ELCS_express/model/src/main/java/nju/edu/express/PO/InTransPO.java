package nju.edu.express.PO;

import java.util.ArrayList;
/**
 * 营业厅装车单——	记录装车日期date、本营业厅编号businessID（025城市编码+000鼓楼营业厅）、汽运编号carryID （营业厅编号+20150921日期+00000编码 、五位数字）、
 * 到达地ArrivalID（本地中转中心或者其它营业厅）、车辆代号carID、监装员jianzhuangyuan、押运员yayunyuan、本次装箱所有订单条形码号orderList）、运费freight（运费根据出发地和目的地自动生成）
 * @author asd
 *
 */
public class InTransPO {
	String ID;
	String date;
	String businessID;
	/**
	 * 汽运编号
	 */
	String carryID;
	String ArrivalID;
	String carID;
	String jianzhuangyuan;
	String yayunyuan;
	Double freight;
	ArrayList<String> orderList;

	/**
	 * @param iD
	 * @param date
	 * @param businessID
	 * @param carryID
	 * @param arrivalID
	 * @param carID
	 * @param jianzhuangyuan
	 * @param yayunyuan
	 * @param freight
	 * @param orderList
	 */
	public InTransPO(String iD, String date, String businessID,
			String carryID, String arrivalID, String carID,
			String jianzhuangyuan, String yayunyuan, Double freight,
			ArrayList<String> orderList) {
		super();
		ID = iD;
		this.date = date;
		this.businessID = businessID;
		this.carryID = carryID;
		ArrivalID = arrivalID;
		this.carID = carID;
		this.jianzhuangyuan = jianzhuangyuan;
		this.yayunyuan = yayunyuan;
		this.freight = freight;
		this.orderList = orderList;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBusinessID() {
		return businessID;
	}
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
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

	/**
	 * @param iD
	 */
	public InTransPO(String iD) {
		super();
		ID = iD;
	}
	public InTransPO(){
		
	}
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}
