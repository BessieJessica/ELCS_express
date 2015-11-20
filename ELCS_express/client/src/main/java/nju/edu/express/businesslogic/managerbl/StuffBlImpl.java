package nju.edu.express.businesslogic.managerbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.StuffPO;
import nju.edu.express.VO.StuffVO;
import nju.edu.express.managerblservice.StuffBlService;
import nju.edu.express.managerdataservice.StuffDataService;

public class StuffBlImpl implements StuffBlService {

	StuffDataService stuffData;

	public StuffBlImpl() {
		try {
			stuffData = (StuffDataService) Naming
					.lookup("rmi://127.0.0.1:6600/StuffData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public StuffVO[] getStuffList() {
		StuffPO[] stuffPOList = null;
		StuffVO[] stuffVOList = null;
		try {
			stuffPOList = stuffData.getStuffList();
			stuffVOList = new StuffVO[stuffPOList.length];
			for (int i = 0; i < stuffVOList.length; i++)
				stuffVOList[i] = transformP2V(stuffPOList[i]);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return stuffVOList;
	}



	@Override
	public boolean addStuff(StuffVO vo) {

		try {
			return stuffData.insertStuff(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}



	@Override
	public boolean delStuff(String[] stuffID) {

		try {
			return stuffData.deleteStuff(stuffID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private StuffVO transformP2V(StuffPO stuffPO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private StuffPO transformV2P(StuffVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
