package nju.edu.express.transiterblservice;

import nju.edu.express.VO.OutArrivalVO;

public interface OutArrivalBlService {

	/**
	 * 根据transitID获得中转中心到达单列表
	 */
	public OutArrivalVO[] getOutArrivalList(String trasitID);
	
	/**
	 * 根据outArrivalID获得中转中心到达单信息
	 */
	public OutArrivalVO getOutArrival(String outArrivalID);
	
	/**
	 * 新增中转中心到达单信息
	 */
	public void addOutArrival(OutArrivalVO vo);
}
