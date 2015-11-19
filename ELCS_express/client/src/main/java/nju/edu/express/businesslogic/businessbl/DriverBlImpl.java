package nju.edu.express.businesslogic.businessbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.DriverPO;
import nju.edu.express.VO.DriverVO;
import nju.edu.express.businesserblservice.DriverBlService;
import nju.edu.express.businesserdataservice.DriverDataService;

public class DriverBlImpl implements DriverBlService {

	DriverDataService driverData;

	public DriverBlImpl() {

		try {
			driverData = (DriverDataService) Naming
					.lookup("rmi://127.0.0.1:6600/DriverData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	DriverVO driverVO = null;

	@Override
	public DriverVO getDriver(String driverID) {

		try {
			driverVO = transformP2V(driverData.getDriver(driverID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return driverVO;
	}

	DriverPO[] driverPOList = null;
	DriverVO[] driverVOList = null;

	@Override
	public DriverVO[] getDriverList(String businessID) {

		try {
			driverPOList = driverData.getDriverList(businessID);
			driverVOList = new DriverVO[driverPOList.length];
			for (int i = 0; i < driverVOList.length; i++) {
				driverVOList[i] = transformP2V(driverPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return driverVOList;
	}

	@Override
	public boolean addDriver(DriverVO vo) {

		try {
			return driverData.insertDriver(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delDriver(String driverID) {

		try {
			return driverData.deleteDriver(driverID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean endDriver(DriverVO vo) {

		try {
			return driverData.updateDriver(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private DriverVO transformP2V(DriverPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	private DriverPO transformV2P(DriverVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
