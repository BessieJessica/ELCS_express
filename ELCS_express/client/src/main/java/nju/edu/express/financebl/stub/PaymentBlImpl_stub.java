package nju.edu.express.financebl.stub;

import nju.edu.express.PO.PaymentPO;
import nju.edu.express.VO.PaymentVO;
import nju.edu.express.financeblservice.PaymentBlService;
import nju.edu.express.financedata.stub.PaymentDataImpl_stub;
import nju.edu.express.financedataservice.PaymentDataService;

public class PaymentBlImpl_stub implements PaymentBlService{

	PaymentDataService payment;
	PaymentPO po;
	PaymentVO vo;
	@Override
	public PaymentVO[] getPaymentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentVO getPayment(String paymentID) {
		payment = new PaymentDataImpl_stub();
		po = payment.getPayment(paymentID);
		vo = new PaymentVO(po.getId(), po.getCost());
		return vo;
	}

	@Override
	public void addPayment(PaymentVO vo) {
		// TODO Auto-generated method stub
		
	}

}
