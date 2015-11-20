package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.OrderPO;
import nju.edu.express.transiterdataservice.OrderDataService;

public class OrderDataImpl extends UnicastRemoteObject implements OrderDataService {

	public OrderDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public OrderPO[] getOrderList(String TransitID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertOrder(String OrderID) {
		// TODO Auto-generated method stub
		return false;
	}

}
