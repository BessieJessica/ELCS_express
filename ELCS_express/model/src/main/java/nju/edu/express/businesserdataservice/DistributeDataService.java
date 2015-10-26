package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.DistributePO;

public interface DistributeDataService {

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public DistributePO[] getDistributeList(String bussinessID);
	
	/**
	 * 根据DistributeID 查找单一持久化对象
	 */
	public DistributePO getDistribute(String DistributeID);
	
	/**
	 * 增加一个持久化对象
	 */
	public void insertDistribute(DistributePO po);
}