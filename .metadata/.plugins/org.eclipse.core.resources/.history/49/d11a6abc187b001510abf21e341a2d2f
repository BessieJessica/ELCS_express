package nju.edu.express.businesserdataservice;

import nju.edu.express.PO.CarPO;

public interface CarDataService {

	/**
	 * 根据营业厅ID字段名查找多个持久化对象
	 */
	public CarPO[] getCarList (String bussinessID);
	
	/**
	 * 根据CarID 查找单一持久化对象
	 */
	public CarPO getCar(String CarID);
	
	/**
	 * 增加一个持久化对象
	 */
	public void insertCar(CarPO po);
	
	/**
	 * 删除一个持久化对象
	 */
	public void deleteCar(String CarID);
	
	/**
	 * 更改一个持久化对象
	 */
	public void updateCar(CarPO po);
}
