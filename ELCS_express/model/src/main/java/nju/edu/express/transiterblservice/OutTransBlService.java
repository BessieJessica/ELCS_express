package nju.edu.express.transiterblservice;

import nju.edu.express.VO.OutTransVO;

public interface OutTransBlService {

	/**
	 * 根据transitID获得中转中心装车单列表
	 */
	public OutTransVO[] getOutTransList(String trasitID);
	
	/**
	 * 根据outTransID获得中转中心装车单信息
	 */
	public OutTransVO getOutTrans(String outTransID);
	
	/**
	 * 新增中转中心装车单信息
	 */
	public boolean addOutTrans(OutTransVO vo);
	
}
