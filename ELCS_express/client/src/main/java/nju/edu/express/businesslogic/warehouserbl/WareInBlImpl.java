package nju.edu.express.businesslogic.warehouserbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.WareInPO;
import nju.edu.express.VO.WareInVO;
import nju.edu.express.transiterdataservice.DispatchDataService;
import nju.edu.express.transiterdataservice.WareInDataService;
import nju.edu.express.warehouserblservice.WareInBlService;

public class WareInBlImpl implements WareInBlService {

	WareInDataService wareInData;

	public WareInBlImpl() {

		try {
			wareInData = (WareInDataService) Naming
					.lookup("rmi://127.0.0.1:6600/WareInData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	WareInVO[] wareInVOList = null;
	WareInPO[] wareInPOList = null;

	@Override
	public WareInVO[] getWareOutList(String wareID) {

		try {
			wareInPOList = wareInData.getWareInList(wareID);
			wareInVOList = new WareInVO[wareInPOList.length];
			for (int i = 0; i < wareInVOList.length; i++) {
				wareInVOList[i] = transformP2V(wareInPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return wareInVOList;
	}


	WareInVO wareInVO = null;
	@Override
	public WareInVO getWareIn(String wareInID) {

		try {
			wareInVO = transformP2V(wareInData.getWareIn(wareInID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return wareInVO;
	}

	@Override
	public boolean addWareIn(WareInVO vo) {

		try {
			return wareInData.insertWareIn(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private WareInPO transformV2P(WareInVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private WareInVO transformP2V(WareInPO wareInPO) {
		// TODO Auto-generated method stub
		return null;
	}

}
