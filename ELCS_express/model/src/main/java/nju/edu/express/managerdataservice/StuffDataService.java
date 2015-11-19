package nju.edu.express.managerdataservice;

import nju.edu.express.PO.StuffPO;

public interface StuffDataService {

	/**
	 * 获得人员列表
	 */
	public StuffPO[] getStuffList();
	
	/**
	 * 根据人员ID获得人员信息
	 */
	public StuffPO getStuff(String stuffID);
	
	/**
	 * 在数据库中插入StuffPO对象
	 */
	public boolean insertStuff (StuffPO po);
	
	/**
	 * 在数据库中删除StuffPO对象
	 */
	public boolean deleteStuff(String stuffID);
	
}
