package nju.edu.express.businesserdata.stub;

import nju.edu.express.PO.CarPO;
import nju.edu.express.businesserdataservice.CarDataService;

public class CarDataImpl_stub implements CarDataService {

	CarPO[] carInfo = new CarPO[1];
	@Override
	public CarPO[] getCarList(String bussinessID) {
		CarPO car1 = new CarPO("10000");
		carInfo[0] = car1;
		return carInfo;
	}

	@Override
	public CarPO getCar(String CarID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCar(CarPO po) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCar(String CarID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCar(CarPO po) {
		// TODO Auto-generated method stub

	}

}
