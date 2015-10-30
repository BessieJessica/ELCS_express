package nju.edu.express.logisticsblservice;

import java.rmi.RemoteException;

import nju.edu.express.VO.LogisticsVO;

public interface LogisticsBlService {

	/**
	 * 根据订单号查询物流信息
	 * @param orderID
	 * @return
	 * @throws RemoteException
	 */
	public LogisticsVO getLogistics(String orderID) throws RemoteException;
}
