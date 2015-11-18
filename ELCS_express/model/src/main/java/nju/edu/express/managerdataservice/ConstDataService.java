package nju.edu.express.managerdataservice;

import nju.edu.express.PO.ConstPO;

public interface ConstDataService {

	/**
	 * 获得常量列表
	 */
	public ConstPO[] getConstList();
	
	/**
	 * 更新ConstPO
	 */
	public boolean updateConst(ConstPO[] po);
	
}
