package nju.edu.express.financedataservice;

import nju.edu.express.PO.ProfitPO;

public interface ProfitDataService {

	/**
	 * 从数据库中查询成本收益表
	 */
	public ProfitPO getProfitChart();
	
}
