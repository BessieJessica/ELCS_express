package nju.edu.express.managerdataservice;

import nju.edu.express.PO.DepartmentPO;

public interface DepartmentDataService {

	/**
	 * 获得机构列表
	 */
	public DepartmentPO[] getDepartmentList();
	
	/**
	 * 在数据库中插入DepartmentPO对象
	 */
	public void insertDepartment(DepartmentPO po);
	
	/**
	 * 在数据库中删除DepartmentPO对象
	 */
	public void deleteDepartment(String[] departmentID);
	
}
