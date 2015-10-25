package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.InTransPO;

public interface InTransDataService {

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public InTransPO[] getInTransList (String bussinessID);
	
	/**
	 * 根据InTransID 查找单一持久化对象
	 */
	public InTransPO getInTrans(String InTransID);
	
	/**
	 * 增加一个持久化对象
	 */
	public void insertInTrans(InTransPO po);
	
}
