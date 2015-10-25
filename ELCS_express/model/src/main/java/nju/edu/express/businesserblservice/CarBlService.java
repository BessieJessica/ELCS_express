package nju.edu.express.businesserblservice;

import nju.edu.express.VO.CarVO;

public interface CarBlService {

	/**
	 * 查看已在系统中的车辆信息
	 */
	public CarVO getCar(String carID);
	
	/**
	 * 根据营业厅ID查看车辆信息列表
	 */
	public CarVO[] getCarList(String businessID);
	
	/**
	 * 添加车辆信息
	 */
	public void addCar(CarVO vo);
	
	/**
	 * 删除车辆信息
	 */
	public void delCar(String carID);
	
	/**
	 * 更新修改过后的车辆信息
	 */
	public void endCar(CarVO vo);
}