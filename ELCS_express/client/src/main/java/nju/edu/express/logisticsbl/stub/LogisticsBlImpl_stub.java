package nju.edu.express.logisticsbl.stub;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

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
		try {
			logistics = (LogisticsDataService) Naming
					.lookup("rmi://127.0.0.1:6600/LogisticsService");
			logisticsPO = logistics.getLogistics(orderID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if (logisticsPO == null){
			System.out.println("logisticsPO==null");
			return null;
		}	
		else {
			transform(logisticsPO);
			return logisticsVO;
		}

	}

	private void transform(LogisticsPO po) {
		String orderID = po.getOrderID();
		String businessInfo = po.getBusinessInfo();
		String warehouseInfo = po.getWarehouseInfo();
		String expresser = po.getExpresser();
		String contact = po.getContact();
		logisticsVO = new LogisticsVO(orderID, businessInfo, warehouseInfo,
				expresser, contact);
	}
}
