package nju.edu.express.financedata.stub;

import nju.edu.express.PO.PaymentPO;
import nju.edu.express.financedataservice.PaymentDataService;

public class PaymentDataImpl_stub implements PaymentDataService {

	@Override
	public PaymentPO[] getPaymentList(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentPO getPayment(String paymentID) {
		PaymentPO po = new PaymentPO(paymentID,"2000元");
		return po;
	}

	@Override
	public void insert(PaymentPO po) {
		// TODO Auto-generated method stub

	}

}
