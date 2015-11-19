package nju.edu.express.businesslogic.businessbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.CarPO;
import nju.edu.express.VO.CarVO;
import nju.edu.express.businesserblservice.CarBlService;
import nju.edu.express.businesserdataservice.CarDataService;

public class CarBlImpl implements CarBlService {

	CarDataService carData;

	public CarBlImpl() {
		try {
			carData = (CarDataService) Naming
					.lookup("rmi://127.0.0.1:6600/CarData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	CarVO carVO = null;

	@Override
	public CarVO getCar(String carID) {

		try {
			carVO = transformP2V(carData.getCar(carID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return carVO;
	}

	CarVO[] carVOList = null;
	CarPO[] carPOList = null;

	@Override
	public CarVO[] getCarList(String businessID) {

		try {
			carPOList = carData.getCarList(businessID);
			carVOList = new CarVO[carPOList.length];
			for (int i = 0; i < carVOList.length; i++) {
				carVOList[i] = transformP2V(carPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return carVOList;
	}

	@Override
	public boolean addCar(CarVO vo) {
		try {
			return carData.insertCar(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delCar(String carID) {

		try {
			return carData.deleteCar(carID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean endCar(CarVO vo) {

		try {
			return carData.updateCar(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private CarVO transformP2V(CarPO car) {
		// TODO Auto-generated method stub
		return null;
	}

	private CarPO transformV2P(CarVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
