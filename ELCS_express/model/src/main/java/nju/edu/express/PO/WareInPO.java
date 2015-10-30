package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 库存入库单——快递编号orderList、入库日期date、目的地destinationID、区号quhao、排号paihao、架号jiahao、位号weihao
 * @author asd
 *
 */
public class WareInPO {

	ArrayList<String> orderList;
	String date;
	String destinationID;
	int quhao;
	int paihao;
	int jiahao;
	int weihao;
	/**
	 * @param orderList
	 * @param date
	 * @param destinationID
	 * @param quhao
	 * @param paihao
	 * @param jiahao
	 * @param weihao
	 */
	public WareInPO(ArrayList<String> orderList, String date,
			String destinationID, int quhao, int paihao, int jiahao, int weihao) {
		super();
		this.orderList = orderList;
		this.date = date;
		this.destinationID = destinationID;
		this.quhao = quhao;
		this.paihao = paihao;
		this.jiahao = jiahao;
		this.weihao = weihao;
	}
	public WareInPO(){
		
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
	public int getQuhao() {
		return quhao;
	}
	public void setQuhao(int quhao) {
		this.quhao = quhao;
	}
	public int getPaihao() {
		return paihao;
	}
	public void setPaihao(int paihao) {
		this.paihao = paihao;
	}
	public int getJiahao() {
		return jiahao;
	}
	public void setJiahao(int jiahao) {
		this.jiahao = jiahao;
	}
	public int getWeihao() {
		return weihao;
	}
	public void setWeihao(int weihao) {
		this.weihao = weihao;
	}
}
