package nju.edu.express.businesslogic.businessbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.InArrivalPO;
import nju.edu.express.VO.InArrivalVO;
import nju.edu.express.businesserblservice.InArrivalBlService;
import nju.edu.express.businesserdataservice.InArrivalDataService;

public class InArrivalBlImpl implements InArrivalBlService {

	InArrivalDataService inArrivalData;

	public InArrivalBlImpl() {

		try {
			inArrivalData = (InArrivalDataService) Naming
					.lookup("rmi://127.0.0.1:6600/InArrivalData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}

	}

	InArrivalVO[] inArrivalVOList = null;
	InArrivalPO[] inArrivalPOList = null;

	@Override
	public InArrivalVO[] getInArrivalList(String businessID) {

		try {
			inArrivalPOList = inArrivalData.getInArrivalList(businessID);
			inArrivalVOList = new InArrivalVO[inArrivalPOList.length];
			for (int i = 0; i < inArrivalVOList.length; i++) {
				inArrivalVOList[i] = transformP2V(inArrivalPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return inArrivalVOList;
	}

	InArrivalVO inArrivalVO = null;

	@Override
	public InArrivalVO getInArrival(String inArrivalID) {

		try {
			inArrivalVO = transformP2V(inArrivalData.getInArrival(inArrivalID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return inArrivalVO;
	}

	@Override
	public boolean addInArrival(InArrivalVO vo) {

		try {
			return inArrivalData.insertInArrival(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private InArrivalVO transformP2V(InArrivalPO inArrivalPO) {
		// TODO Auto-generated method stub
		return null;
	}

	private InArrivalPO transformV2P(InArrivalVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
