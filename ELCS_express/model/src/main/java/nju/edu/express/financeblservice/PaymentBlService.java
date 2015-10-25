package nju.edu.express.financeblservice;

import nju.edu.express.VO.PaymentVO;

public interface PaymentBlService {

	/**
	 * 查看付款单列表
	 */
	public PaymentVO[] getPaymentList();
	
	/**
	 * 根据paymentID来查看付款单信息
	 */
	public PaymentVO getPayment(String paymentID);
	
	/**
	 * 新增付款单信息
	 */
	public void addPayment(PaymentVO vo);
	
}
