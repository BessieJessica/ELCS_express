package nju.edu.express.businesslogic.warehouserbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.OrderPO;
import nju.edu.express.VO.OrderVO;
import nju.edu.express.transiterdataservice.WareDataService;
import nju.edu.express.warehouserblservice.WareBlService;

public class WareBlImpl implements WareBlService {

	WareDataService wareData;

	public WareBlImpl() {

		try {
			wareData = (WareDataService) Naming
					.lookup("rmi://127.0.0.1:6600/WareData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	OrderVO[] orderVOList = null;
	OrderPO[] orderPOList = null;

	@Override
	public OrderVO[] getOrderList(String wareID) {

		try {
			orderPOList = wareData.getOrderList(wareID);
			orderVOList = new OrderVO[orderPOList.length];
			for (int i = 0; i < orderVOList.length; i++) {
				orderVOList[i] = transformP2V(orderPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return orderVOList;
	}

	@Override
	public boolean endOrder(String orderID) {

		try {
			return wareData.insertOrder(orderID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private OrderVO transformP2V(OrderPO orderPO) {
		// TODO Auto-generated method stub
		return null;
	}
}
