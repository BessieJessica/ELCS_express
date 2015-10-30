package nju.edu.express.PO;

import java.util.ArrayList;

/**
 * 经营情况表——一段时间内的全部收款单balanceList和付款单paymentList的罗列
 * 	ArrayList<PaymentPO> paymentList;
 * 	ArrayList<BalancePO> balanceList;
 * 
 * @author asd
 *
 */
public class BusinessConPO {
	ArrayList<PaymentPO> paymentList;
	ArrayList<BalancePO> balanceList;
	String id;
	
	/**
	 * @param paymentList
	 * @param balanceList
	 */
	public BusinessConPO(ArrayList<PaymentPO> paymentList,
			ArrayList<BalancePO> balanceList) {
		super();
		this.paymentList = paymentList;
		this.balanceList = balanceList;
	}

	public ArrayList<PaymentPO> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(ArrayList<PaymentPO> paymentList) {
		this.paymentList = paymentList;
	}

	public ArrayList<BalancePO> getBalanceList() {
		return balanceList;
	}

	public void setBalanceList(ArrayList<BalancePO> balanceList) {
		this.balanceList = balanceList;
	}



	public BusinessConPO(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
