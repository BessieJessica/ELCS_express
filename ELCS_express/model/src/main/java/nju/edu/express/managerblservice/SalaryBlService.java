package nju.edu.express.managerblservice;

import nju.edu.express.VO.SalaryVO;

public interface SalaryBlService {

	/**
	 * 获得工资信息列表
	 */
	public SalaryVO[] getSalaryList();
	
	/**
	 * 根据salaryID获得工资信息
	 */
	public SalaryVO getSalary(String salaryID);
	
	/**
	 * 更新工资内容信息
	 */
	public boolean endSalary(SalaryVO vo);
}
