package nju.edu.express.businesserblservice;

import nju.edu.express.VO.DistributeVO;

public interface DistributeBlService {

	/**
	 * 根据businessID获得相应的派件单列表信息
	 */
	public DistributeVO[] getDistributeList(String businessID);
	
	/**
	 * 根据distributeID获得相应的派件单信息
	 */
	public DistributeVO getDistribute(String distributeID);
	
}
