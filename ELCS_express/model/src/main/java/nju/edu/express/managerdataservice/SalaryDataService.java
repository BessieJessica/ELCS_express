package nju.edu.express.managerdataservice;

import nju.edu.express.PO.SalaryPO;

public interface SalaryDataService {

	/**
	 * 获得工资列表
	 */
	public SalaryPO[] getSalaryList();
	
	/**
	 * 根据职位获得具体工资信息
	 */
	public SalaryPO getSalary(String positionID);
	
	/**
	 * 更新SalaryPO
	 */
	public boolean updateSalary(SalaryPO po);
	
}
