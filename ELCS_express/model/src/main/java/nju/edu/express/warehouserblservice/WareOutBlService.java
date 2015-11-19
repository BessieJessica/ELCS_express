package nju.edu.express.warehouserblservice;

import nju.edu.express.VO.WareOutVO;

public interface WareOutBlService {

	/**
	 * 根据wareID获得相应的出库单列表
	 */
	public WareOutVO[] getWareOutList(String wareID);
	
	/**
	 * 根据wareOutID获得相应的出库单信息
	 */
	public WareOutVO getWareOut(String wareOutID);
	
	/**
	 * 新增出库单信息
	 */
	public boolean addWareOut(WareOutVO vo);
}
