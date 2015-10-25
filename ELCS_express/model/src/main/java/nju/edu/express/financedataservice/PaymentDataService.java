package nju.edu.express.financedataservice;

import nju.edu.express.PO.PaymentPO;

public interface PaymentDataService {

	/**
	 * 从数据库中查询需要的付款单列表
	 */
	public PaymentPO[] getPaymentList(String date);
	
	/**
	 * 从数据库中根据付款单ID查询需要的付款单的具体内容
	 */
	public PaymentPO getPayment(String paymentID);
	
	/**
	 * 在数据库中插入新建的付款单
	 */
	public void insert(PaymentPO po);
}
