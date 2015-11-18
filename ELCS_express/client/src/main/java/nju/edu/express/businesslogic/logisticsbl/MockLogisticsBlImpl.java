package nju.edu.express.businesslogic.logisticsbl;

import java.rmi.RemoteException;

import nju.edu.express.VO.LogisticsVO;
import nju.edu.express.logisticsdata.stub.LogisticsDataImpl_stub;
import nju.edu.express.logisticsdataservice.LogisticsDataService;

public class MockLogisticsBlImpl extends LogisticsBlImpl{


	public boolean insertLogistics(LogisticsVO logisticsVO) {
		// TODO Auto-generated method stub
		LogisticsDataService logistics = new LogisticsDataImpl_stub();
		try {
			return logistics.insertLogistics(null);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
