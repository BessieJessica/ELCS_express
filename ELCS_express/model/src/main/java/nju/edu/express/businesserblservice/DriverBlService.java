package nju.edu.express.businesserblservice;

import nju.edu.express.VO.DriverVO;

public interface DriverBlService {

	/**
	 * 查看已在系统中的司机信息
	 */
	public DriverVO getDriver(String driverID);
	
	/**
	 * 根据营业厅ID查看司机信息列表
	 */
	public DriverVO[] getDriverList(String businessID);
	
	/**
	 * 添加司机信息
	 */
	public void addDriver(DriverVO vo);
	
	/**
	 * 删除司机信息
	 */
	public void delDriver(String driverID);
	
	/**
	 * 更新修改过后的司机信息
	 */
	public void endDriver(DriverVO vo);
}
