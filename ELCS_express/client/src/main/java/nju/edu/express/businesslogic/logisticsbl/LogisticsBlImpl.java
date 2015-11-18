package nju.edu.express.businesslogic.logisticsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.LogisticsPO;
import nju.edu.express.VO.LogisticsVO;
import nju.edu.express.logisticsblservice.LogisticsBlService;
import nju.edu.express.logisticsdata.LogisticsDataImpl;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class LogisticsBlImpl implements LogisticsBlService {

	LogisticsDataService logistics;
	LogisticsPO[] logisticsPO;
	LogisticsVO[] logisticsVO;

	public LogisticsVO[] getLogistics(String orderID) {
		if (orderID.matches("\\d{10}")) {// 格式符合
			try {
				logistics = (LogisticsDataService) Naming
						.lookup("rmi://127.0.0.1:6600/LogisticsService");
				logisticsPO = logistics.getLogistics(orderID);
				if (logisticsPO == null)// 如果在数据库中不存在
					return null;
				else
					// 在数据库中存在数据
					transform(logisticsPO);
				return logisticsVO;
			} catch (MalformedURLException | RemoteException
					| NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else
			// 格式不符合
			return null;
		return null;

	}

	private void transform(LogisticsPO[] po) {
		logisticsVO = new LogisticsVO[po.length];
		for (int i = 0; i < po.length; i++) {
			logisticsVO[i] = new LogisticsVO(po[i].getOrderID(),
					po[i].getTime(), po[i].getExpressInfo(), po[i].getContact());
		}
	}

	@Override
	public boolean insertLogistics(LogisticsVO logisticsVO) {
		// TODO Auto-generated method stub
		return false;
	}
}
