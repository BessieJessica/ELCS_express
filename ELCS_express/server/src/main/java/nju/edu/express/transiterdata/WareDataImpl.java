
package nju.edu.express.transiterdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.OrderPO;
import nju.edu.express.transiterdataservice.WareDataService;

public class WareDataImpl extends UnicastRemoteObject implements WareDataService {

	public WareDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insertOrder(String orderID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderPO[] getOrderList(String wareID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
