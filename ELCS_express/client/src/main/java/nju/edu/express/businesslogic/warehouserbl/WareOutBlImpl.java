package nju.edu.express.businesslogic.warehouserbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.WareOutPO;
import nju.edu.express.VO.WareOutVO;
import nju.edu.express.transiterdataservice.WareOutDataService;
import nju.edu.express.warehouserblservice.WareOutBlService;

public class WareOutBlImpl implements WareOutBlService {

	WareOutDataService wareOutData;

	public WareOutBlImpl() {

		try {
			wareOutData = (WareOutDataService) Naming
					.lookup("rmi://127.0.0.1:6600/WareOutData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	WareOutVO[] wareOutVOList = null;
	WareOutPO[] wareOutPOList = null;

	@Override
	public WareOutVO[] getWareOutList(String wareID) {

		try {
			wareOutPOList = wareOutData.getWareOutList(wareID);
			wareOutVOList = new WareOutVO[wareOutPOList.length];
			for (int i = 0; i < wareOutVOList.length; i++) {
				wareOutVOList[i] = transformP2V(wareOutPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return wareOutVOList;
	}


	WareOutVO wareOutVO = null;
	@Override
	public WareOutVO getWareOut(String wareOutID) {

		try {
			wareOutVO = transformP2V(wareOutData.getWareOut(wareOutID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return wareOutVO;
	}

	@Override
	public boolean addWareOut(WareOutVO vo) {

		try {
			return wareOutData.insertWareOut(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private WareOutPO transformV2P(WareOutVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private WareOutVO transformP2V(WareOutPO po) {
		// TODO Auto-generated method stub
		return null;
	}


}
