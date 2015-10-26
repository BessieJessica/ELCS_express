package nju.edu.express.businessbl.stub;

import nju.edu.express.PO.CarPO;
import nju.edu.express.VO.CarVO;
import nju.edu.express.businesserblservice.CarBlService;
import nju.edu.express.businesserdata.stub.CarDataImpl_stub;
import nju.edu.express.businesserdataservice.CarDataService;

public class CarBlImpl_stub implements CarBlService{

	CarDataService car;
	CarPO[] carPO;
	CarVO[] carVO;
	public CarVO getCar(String carID) {
		// TODO Auto-generated method stub
		return null;
	}

	public CarVO[] getCarList(String businessID) {
		car = new CarDataImpl_stub();
		carPO = car.getCarList(businessID);
		transform(carPO);
		
		return carVO;
	}

	private void transform(CarPO[] carInfo2) {
		String id = carInfo2[0].getID();
		carVO = new CarVO[carInfo2.length];
		carVO[0]=new CarVO();
		carVO[0].setID(id);
	}

	public void addCar(CarVO vo) {
		// TODO Auto-generated method stub
		
	}

	public void delCar(String carID) {
		// TODO Auto-generated method stub
		
	}

	public void endCar(CarVO vo) {
		// TODO Auto-generated method stub
		
	}

}
