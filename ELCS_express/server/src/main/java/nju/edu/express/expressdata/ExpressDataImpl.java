package nju.edu.express.expressdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.OrderPO;
import nju.edu.express.expressdataservice.ExpressDataService;

public class ExpressDataImpl extends UnicastRemoteObject implements ExpressDataService{

	public ExpressDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public OrderPO[] getOrderList(String expressID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPO getOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertOrder(OrderPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(String[] orderID) {
		// TODO Auto-generated method stub
		return false;
	}


}
