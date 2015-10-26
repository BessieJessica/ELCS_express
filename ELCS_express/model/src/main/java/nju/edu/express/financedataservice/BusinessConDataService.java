package nju.edu.express.financedataservice;

import nju.edu.express.PO.BusinessConPO;

public interface BusinessConDataService {

	/**
	 * 获得经营情况表
	 */
	public BusinessConPO getBusinessConChart();
}
