package nju.edu.express.transiterblservice;

import nju.edu.express.VO.DispatchVO;

public interface DispatchBlService {

	/**
	 * 根据transitID获得中转单列表
	 */
	public DispatchVO[] getDispatchList(String trasitID);
	
	/**
	 * 根据dispatchID获得中转单信息
	 */
	public DispatchVO getDispatch (String dispatchID);
	
	/**
	 * 新增中转单信息
	 */
	public boolean addDispatch (DispatchVO vo);
	
}
