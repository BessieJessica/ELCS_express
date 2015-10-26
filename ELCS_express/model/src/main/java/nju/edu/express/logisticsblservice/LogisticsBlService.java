package nju.edu.express.logisticsblservice;

import nju.edu.express.VO.LogisticsVO;

public interface LogisticsBlService {

	/**
	 * 根据订单号查询物流信息
	 */
	public LogisticsVO getLogistics(String orderID);
}
