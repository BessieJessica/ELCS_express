package nju.edu.express.businesslogic.businessbl.stub;

import nju.edu.express.PO.DriverPO;
import nju.edu.express.VO.DriverVO;
import nju.edu.express.businesserblservice.DriverBlService;
import nju.edu.express.businesserdata.stub.DriverDataImpl_stub;
import nju.edu.express.businesserdataservice.DriverDataService;

public class DriverBlImpl_stub implements DriverBlService {
	
	DriverDataService driver;
	DriverPO[] driverpo;
	DriverVO[] drivervo;

	public DriverVO getDriver(String driverID) {
		// TODO Auto-generated method stub
		return null;
	}

	public DriverVO[] getDriverList(String businessID) {
		// TODO Auto-generated method stub
		driver=new DriverDataImpl_stub();
		driverpo=driver.getDriverList("001");
		transform(driverpo);
		return drivervo;
	}

	public void transform(DriverPO[] driverpo){
		String id =driverpo[0].getID();
		drivervo=new DriverVO[driverpo.length];
		drivervo[0]=new DriverVO();
		drivervo[0].setID(id);
	}
	public void addDriver(DriverVO vo) {
		// TODO Auto-generated method stub

	}

	public void delDriver(String driverID) {
		// TODO Auto-generated method stub

	}

	public void endDriver(DriverVO vo) {
		// TODO Auto-generated method stub

	}

}
