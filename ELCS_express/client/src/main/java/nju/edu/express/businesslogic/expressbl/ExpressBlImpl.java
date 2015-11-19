package nju.edu.express.businesslogic.expressbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.OrderPO;
import nju.edu.express.VO.ConstVO;
import nju.edu.express.VO.OrderVO;
import nju.edu.express.businesslogic.managerbl.ConstBlImpl;
import nju.edu.express.expressblservice.ExpressBlService;
import nju.edu.express.expressdataservice.ExpressDataService;
import nju.edu.express.managerblservice.ConstBlService;

public class ExpressBlImpl implements ExpressBlService {

	ExpressDataService expressData;
	ConstBlService constBl;

	public ExpressBlImpl() {
		try {
			expressData = (ExpressDataService) Naming
					.lookup("rmi://127.0.0.1:6600/ExpressService");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		constBl = new ConstBlImpl();
	}

	OrderPO[] orderPoList;

	public OrderVO[] getOrderList(String expressID) {
		try {
			orderPoList = expressData.getOrderList(expressID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OrderVO[] vo = new OrderVO[orderPoList.length];
		for (int i = 0; i < vo.length; i++) {
			vo[i] = transformP2V(orderPoList[i]);
		}
		return vo;
	}

	OrderPO po;

	public OrderVO getOrder(String orderID) {
		try {
			po = expressData.getOrder(orderID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transformP2V(po);
	}

	public boolean addOrder(OrderVO vo) {
		try {
			return expressData.insertOrder(transformV2P(vo));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean endOrder(String[] orderID) {
		try {
			return expressData.updateOrder(orderID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	ConstVO[] constVOList;
	@Override
	public double getFare(OrderVO vo) {
		constVOList = constBl.getConstList();
		
		//todo orderVO和constVO的对应
		return 0;
	}

	@Override
	public double getTime(OrderVO vo) {
		constVOList = constBl.getConstList();
		
		//todo oderVO和constVO的对应
		return 0;
	}

	private OrderVO transformP2V(OrderPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	private OrderPO transformV2P(OrderVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
