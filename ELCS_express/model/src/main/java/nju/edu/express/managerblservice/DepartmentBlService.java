package nju.edu.express.managerblservice;

import nju.edu.express.VO.DepartmentVO;

public interface DepartmentBlService {

	/**
	 * 获得公司机构列表
	 */
	public DepartmentVO[] getDepartmentList();
	
	/**
	 * 新增机构信息
	 */
	public boolean addDepartment(DepartmentVO vo);
	
	/**
	 * 根据departmentID删除相应的机构信息
	 */
	public boolean delDepartment(String[] departmentID);
}
