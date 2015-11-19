package nju.edu.express.transiterdataservice;

import nju.edu.express.PO.DispatchPO;

public interface DispatchDataService {

	/**
	 * 根据中转中心ID字段名查找多个持久化对象
	 */
	public DispatchPO[] getDispatchList(String TransitID);
	
	/**
	 * 根据DispatchID查找单一持久化对象
	 */
	public DispatchPO getDispatch(String DispatchID);
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertDispatch(DispatchPO po);
}
