package nju.edu.express.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import nju.edu.express.PO.PaymentPO;

public interface PaymentDataService extends Remote{

	/**
	 * 从数据库中查询需要的付款单列表
	 */
	public PaymentPO[] getPaymentList(String date)throws RemoteException;
	
	/**
	 * 从数据库中根据付款单ID查询需要的付款单的具体内容
	 */
	public PaymentPO getPayment(String paymentID)throws RemoteException;
	
	/**
	 * 在数据库中插入新建的付款单
	 */
	public boolean insert(PaymentPO po)throws RemoteException;
}
