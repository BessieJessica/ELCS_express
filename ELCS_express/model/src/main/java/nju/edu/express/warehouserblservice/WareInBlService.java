package nju.edu.express.warehouserblservice;

import nju.edu.express.VO.WareInVO;

public interface WareInBlService {

	/**
	 * 根据wareID获得相应的入库单列表
	 */
	public WareInVO[] getWareOutList(String wareID);
	
	/**
	 * 根据wareInID获得相应入库单信息
	 */
	public WareInVO getWareIn(String wareInID);
	
	/**
	 * 新增入库单信息
	 */
	public void addWareIn(WareInVO vo);
}
