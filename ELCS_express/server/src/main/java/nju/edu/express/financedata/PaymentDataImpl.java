package nju.edu.express.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.PaymentPO;
import nju.edu.express.financedataservice.PaymentDataService;

public class PaymentDataImpl extends UnicastRemoteObject implements PaymentDataService {

	public PaymentDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public PaymentPO[] getPaymentList(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentPO getPayment(String paymentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(PaymentPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
