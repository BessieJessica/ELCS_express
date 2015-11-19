package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.DriverPO;

public interface DriverDataService {

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public DriverPO[] getDriverList(String bussinessID);
	
	/**
	 * 根据DriverID 查找单一持久化对象
	 */
	public DriverPO getDriver(String CarID);
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertDriver(DriverPO po);
	
	/**
	 * 删除一个持久化对象
	 */
	public boolean deleteDriver(String DriverID);
	
	/**
	 * 更改一个持久化对象
	 */
	public boolean updateDriver(DriverPO po);
}

