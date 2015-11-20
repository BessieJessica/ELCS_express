package nju.edu.express.businesslogic.financebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.PaymentPO;
import nju.edu.express.VO.PaymentVO;
import nju.edu.express.financeblservice.AccountBlService;
import nju.edu.express.financeblservice.PaymentBlService;
import nju.edu.express.financedataservice.PaymentDataService;

public class PaymentBlImpl implements PaymentBlService {

	PaymentDataService paymentData;
	AccountBlService accountBl;

	public PaymentBlImpl() {

		try {
			paymentData = (PaymentDataService) Naming
					.lookup("rmi://127.0.0.1:6600/PaymentData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		accountBl = new AccountBlImpl();
	}

	PaymentVO[] paymentVOList = null;
	PaymentPO[] paymentPOList = null;

	@Override
	public PaymentVO[] getPaymentList(String date) {

		try {
			paymentPOList = paymentData.getPaymentList(date);
			paymentVOList = new PaymentVO[paymentPOList.length];
			for (int i = 0; i < paymentVOList.length; i++) {
				paymentVOList[i] = transformP2V(paymentPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return paymentVOList;
	}

	PaymentVO paymentVO = null;

	@Override
	public PaymentVO getPayment(String paymentID) {

		try {
			paymentVO = transformP2V(paymentData.getPayment(paymentID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return paymentVO;
	}

	@Override
	public boolean addPayment(String accountID, PaymentVO vo) {

		try {
			//更新银行金额信息
			accountBl.updatePaymentOutcome(accountID, vo);
			//更新付款单数据
			return paymentData.insert(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private PaymentPO transformV2P(PaymentVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private PaymentVO transformP2V(PaymentPO paymentPO) {
		// TODO Auto-generated method stub
		return null;
	}
}
