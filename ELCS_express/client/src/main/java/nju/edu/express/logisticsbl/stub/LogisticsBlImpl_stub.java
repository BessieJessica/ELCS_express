package nju.edu.express.logisticsbl.stub;

import nju.edu.express.PO.LogisticsPO;
import nju.edu.express.VO.LogisticsVO;
import nju.edu.express.logisticsblservice.LogisticsBlService;
import nju.edu.express.logisticsdata.stub.LogisticsDataImpl_stub;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class LogisticsBlImpl_stub implements LogisticsBlService {

	LogisticsDataService logistics;
	LogisticsPO logisticsPO;
	LogisticsVO logisticsVO;
	
	public LogisticsVO getLogistics(String orderID) {
		logistics = new LogisticsDataImpl_stub();
		logisticsPO = logistics.getLogistics(orderID);
		transform(logisticsPO);
		return logisticsVO;
	}
	
	private void transform(LogisticsPO po)
	{
		String orderID = po.getOrderID();
		String businessInfo = po.getBusinessInfo();
		String warehouseInfo = po.getWarehouseInfo();
		String expresser = po.getExpresser();
		String contact = po.getContact();
		logisticsVO = new LogisticsVO(orderID, businessInfo, warehouseInfo, expresser, contact);	
	}
}