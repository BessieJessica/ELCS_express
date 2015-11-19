package nju.edu.express.managerblservice;

import nju.edu.express.VO.TableVO;

public interface TableBlService {

	/**
	 * 获得所有未审批的单据列表
	 */
	public TableVO[] getTableList();
	
	/**
	 * 根据tableID更新单据审批状态为“已审批”
	 */
	public boolean updateTable(String tableID);
	
}
