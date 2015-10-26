package nju.edu.express.businesserdata.stub;

import nju.edu.express.PO.DriverPO;
import nju.edu.express.businesserdataservice.DriverDataService;

public class DriverDataImpl_stub implements DriverDataService {
	
	DriverPO[] driverpo;

	@Override
	public DriverPO[] getDriverList(String bussinessID) {
		// TODO Auto-generated method stub
		driverpo=new DriverPO[1];
		driverpo[0]=new DriverPO("10000");
		return driverpo;
	}

	@Override
	public DriverPO getDriver(String CarID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertDriver(DriverPO po) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDriver(String DriverID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDriver(DriverPO po) {
		// TODO Auto-generated method stub

	}

}
