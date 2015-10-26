package nju.edu.express.managerdataservice;

import nju.edu.express.PO.BusinessConPO;

public interface BusinessConDataService {

	/**
	 * 获得一段时间内的经营情况表
	 */
	public BusinessConPO getBusinessConList(String beginDate, String endDate);
	
}