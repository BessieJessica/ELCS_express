package nju.edu.express.managerblservice;

import nju.edu.express.VO.StuffVO;

public interface StuffBlService {

	/**
	 * 获得公司员工列表
	 */
	public StuffVO[] getStuffList();
	
	/**
	 * 新增员工信息
	 */
	public void addStuff(StuffVO vo);
	
	/**
	 * 根据stuffID删除相应的员工信息
	 */
	public void delStuff(String[] stuffID);
}
