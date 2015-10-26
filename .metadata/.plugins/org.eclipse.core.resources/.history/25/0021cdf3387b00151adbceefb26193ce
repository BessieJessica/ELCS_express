package nju.edu.express.logisticsdata.stub;

import nju.edu.express.PO.LogisticsPO;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class LogisticsDataImpl implements LogisticsDataService {

	LogisticsPO logisticsPO;
	public LogisticsPO getLogistics(String orderID) {
		switch (orderID) {
		case "10000":
			logisticsPO = new LogisticsPO("10000", "南京南快递营业厅", "", "", "12345678");
			return logisticsPO;
		default:
			logisticsPO = new LogisticsPO("", "", "", "", "");
			return logisticsPO;
		}
		
	}

	public void insertLogistics(LogisticsPO po) {
		// TODO Auto-generated method stub

	}

}
