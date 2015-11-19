package nju.edu.express.businesserdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.CarPO;

public interface CarDataService extends Remote{

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public CarPO[] getCarList (String businessID)throws RemoteException;
	
	/**
	 * 根据CarID 查找单一持久化对象
	 */
	public CarPO getCar(String carID)throws RemoteException;
	
	/**
	 * 增加一个持久化对象
	 */
	public boolean insertCar(CarPO po)throws RemoteException;
	
	/**
	 * 删除一个持久化对象
	 */
	public boolean deleteCar(String carID)throws RemoteException;
	
	/**
	 * 更改一个持久化对象
	 */
	public boolean updateCar(CarPO po)throws RemoteException;
}
