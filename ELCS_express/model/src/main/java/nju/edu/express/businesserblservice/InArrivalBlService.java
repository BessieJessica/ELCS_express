package nju.edu.express.businesserblservice;

import nju.edu.express.VO.InArrivalVO;

public interface InArrivalBlService {

	/**
	 * 根据businessID获得相应到达单信息列表
	 */
	public InArrivalVO[] getInArrivalList(String businessID);
	
	/**
	 * 根据inArrivalID获得相应到达单信息
	 */
	public InArrivalVO getInArrival(String inArrivalID);
	
	/**
	 * 添加新的到达单
	 * @param inArrivalVO
	 * @return
	 */
	public boolean addInArrival(InArrivalVO inArrivalVO);
}
