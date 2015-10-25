package nju.edu.express.financeblservice;

import nju.edu.express.VO.BusinessConVO;

public interface BusinessConBlService {

	/**
	 * 根据beginDate和endDate查询经营情况表
	 */
	public BusinessConVO getBusinessConChart(String beginDate, String endDate);
	
}
