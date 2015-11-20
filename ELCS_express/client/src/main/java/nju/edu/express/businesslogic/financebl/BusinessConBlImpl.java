package nju.edu.express.businesslogic.financebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.BusinessConPO;
import nju.edu.express.VO.BusinessConVO;
import nju.edu.express.financeblservice.BusinessConBlService;
import nju.edu.express.financedataservice.BusinessConDataService;

public class BusinessConBlImpl implements BusinessConBlService {

	BusinessConDataService businessConData;

	public BusinessConBlImpl() {

		try {
			businessConData = (BusinessConDataService) Naming
					.lookup("rmi://127.0.0.1:6600/BusinessConData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	BusinessConVO businessConVO = null;

	@Override
	public BusinessConVO getBusinessConChart(String beginDate, String endDate) {

		try {
			businessConVO = transformP2V(businessConData.getBusinessConChart());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return businessConVO;
	}

	private BusinessConVO transformP2V(BusinessConPO businessConChart) {
		// TODO Auto-generated method stub
		return null;
	}

}
