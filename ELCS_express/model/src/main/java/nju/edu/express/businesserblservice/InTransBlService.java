package nju.edu.express.businesserblservice;

import nju.edu.express.VO.InTransVO;

public interface InTransBlService {

	/**
	 * 根据businessID获得相应装车单信息列表
	 */
	public InTransVO[] getInTransList(String businessID);
	
	/**
	 * 根据inTransID获得相应装车单信息
	 */
	public InTransVO getInTrans(String inTransID);
	
	/**
	 * 添加新的装车单
	 * @param intransVO
	 * @return
	 */
	public boolean addInTrans(InTransVO intransVO);
}
