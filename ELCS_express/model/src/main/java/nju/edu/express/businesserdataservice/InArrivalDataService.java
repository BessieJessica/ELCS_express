package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.InArrivalPO;

public interface InArrivalDataService {

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public InArrivalPO[] getInArrivalList(String bussinessID);
	
	/**
	 * 根据InArrivalID 查找单一持久化对象
	 */
	public InArrivalPO getInArrival(String InArrivalID);
	
	/**
	 * 增加一个持久化对象
	 */
	public void insertInArrival(InArrivalPO po);
	
}