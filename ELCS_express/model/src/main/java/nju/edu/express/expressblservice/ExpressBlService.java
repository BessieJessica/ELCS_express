package nju.edu.express.expressblservice;

import nju.edu.express.VO.OrderVO;

public interface ExpressBlService {

	/**
	 * 根据快递员的ID查看订单列表信息
	 */
	public OrderVO[] getOrderList(String expressID);

	/**
	 * 根据orderID查看订单信息
	 */
	public OrderVO getOrder(String orderID);

	/**
	 * 确认输入订单信息，更新服务端数据
	 */
	public boolean addOrder(OrderVO vo);

	/**
	 * 确认货物到达目的地，结束该订单，更新服务端数据
	 */
	public boolean endOrder(String[] orderID);

	/**
	 * 计算总价
	 * 
	 * @param vo
	 * @return
	 */
	public double getFare(OrderVO vo);

	/**
	 * 计算时间
	 * 
	 * @param vo
	 * @return
	 */
	public double getTime(OrderVO vo);

}
