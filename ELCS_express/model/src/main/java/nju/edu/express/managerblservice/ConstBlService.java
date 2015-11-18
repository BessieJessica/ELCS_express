package nju.edu.express.managerblservice;

import nju.edu.express.VO.ConstVO;

public interface ConstBlService {

	/**
	 * 获得常量列表
	 */
	public ConstVO[] getConstList();
	
	/**
	 * 更新常量信息
	 */
	public boolean endConst(ConstVO[] vo);
}
