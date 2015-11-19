package nju.edu.express.businesserdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.CarPO;
import nju.edu.express.businesserdataservice.CarDataService;

public class CarDataImpl extends UnicastRemoteObject implements CarDataService {

	public CarDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CarPO[] getCarList(String businessID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarPO getCar(String carID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCar(CarPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCar(String carID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCar(CarPO po) {
		// TODO Auto-generated method stub
		return false;
	}



}
