package nju.edu.express.transiterdataservice;

import nju.edu.express.PO.OutArrivalPO;

public interface OutArrivalDataService {

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public OutArrivalPO[] getOutArrivalList(String TransitID);
	
	/**
	 * 根据OutArrivalID 查找单一持久化对象
	 */
	public OutArrivalPO getOutArrival(String OutArrivalID);
	
	/**
	 * 增加一个持久化对象
	 */
	public void insertOutArrival(OutArrivalPO po);
	
	
}
