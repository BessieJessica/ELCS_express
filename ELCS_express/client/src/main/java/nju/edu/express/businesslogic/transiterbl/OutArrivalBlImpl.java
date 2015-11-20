package nju.edu.express.businesslogic.transiterbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.OutArrivalPO;
import nju.edu.express.VO.OutArrivalVO;
import nju.edu.express.transiterblservice.OutArrivalBlService;
import nju.edu.express.transiterdataservice.OutArrivalDataService;

public class OutArrivalBlImpl implements OutArrivalBlService {

	OutArrivalDataService outArrivalData;

	public OutArrivalBlImpl() {

		try {
			outArrivalData = (OutArrivalDataService) Naming
					.lookup("rmi://127.0.0.1:6600/OutArrivalData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	OutArrivalVO[] outArrivalVOList = null;
	OutArrivalPO[] outArrivalPOList = null;

	@Override
	public OutArrivalVO[] getOutArrivalList(String trasitID) {

		try {
			outArrivalPOList = outArrivalData.getOutArrivalList(trasitID);
			outArrivalVOList = new OutArrivalVO[outArrivalPOList.length];
			for (int i = 0; i < outArrivalVOList.length; i++) {
				outArrivalVOList[i] = transformP2V(outArrivalPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return outArrivalVOList;
	}

	OutArrivalVO outArrivalVO = null;

	@Override
	public OutArrivalVO getOutArrival(String outArrivalID) {

		try {
			outArrivalVO = transformP2V(outArrivalData
					.getOutArrival(outArrivalID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return outArrivalVO;
	}

	@Override
	public boolean addOutArrival(OutArrivalVO vo) {

		try {
			return outArrivalData.insertOutArrival(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private OutArrivalVO transformP2V(OutArrivalPO outArrivalPO) {
		// TODO Auto-generated method stub
		return null;
	}

	private OutArrivalPO transformV2P(OutArrivalVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
