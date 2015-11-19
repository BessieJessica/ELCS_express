package nju.edu.express.managerdataservice;

import nju.edu.express.PO.TablePO;

public interface TableDataService {

	/**
	 * 获得单据列表
	 */
	public TablePO[] getTableList();
	
	/**
	 * 根据表单的ID更新TablePO
	 */
	public boolean updateTable(String[] tableID);
	
}
