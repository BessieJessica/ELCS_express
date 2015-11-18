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

	/**
	 * 添加新的派件单
	 * @param distributeVO
	 * @return
	 */
	public boolean addDistribute(DistributeVO distributeVO);
}
