package nju.edu.express.transiterdataservice;

import nju.edu.express.PO.WareOutPO;

public interface WareOutDataService {

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public WareOutPO[] getWareOutList(String TransitID);
	
	/**
	 * 根据WareOutID 查找单一持久化对象
	 */
	public WareOutPO getWareOut(String WareOutID);
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertWareOut(WareOutPO po);
	
	
}
