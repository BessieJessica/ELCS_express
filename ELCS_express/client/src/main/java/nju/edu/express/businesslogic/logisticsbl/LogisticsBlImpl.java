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

	public LogisticsBlImpl() {
		try {
			logistics = (LogisticsDataService) Naming
					.lookup("rmi://127.0.0.1:6600/LogisticsData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	public LogisticsVO[] getLogistics(String orderID) {
		if (orderID.matches("\\d{10}")) {// 格式符合
			try {
				logisticsPO = logistics.getLogistics(orderID);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			if (logisticsPO == null)// 如果在数据库中不存在
				return null;
			else
				// 在数据库中存在数据
				transformP2V(logisticsPO);
			return logisticsVO;

		} else
			// 格式不符合
			return null;

	}

	@Override
	public boolean insertLogistics(LogisticsVO logisticsVO) {
		try {
			return logistics.insertLogistics(transformV2P(logisticsVO));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private LogisticsPO transformV2P(LogisticsVO logisticsVO2) {
		// TODO Auto-generated method stub
		return null;
	}

	private void transformP2V(LogisticsPO[] po) {
		logisticsVO = new LogisticsVO[po.length];
		for (int i = 0; i < po.length; i++) {
			logisticsVO[i] = new LogisticsVO(po[i].getOrderID(),
					po[i].getTime(), po[i].getExpressInfo(), po[i].getContact());
		}
	}

}
