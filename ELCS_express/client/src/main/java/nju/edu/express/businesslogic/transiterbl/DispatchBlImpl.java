package nju.edu.express.businesslogic.transiterbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.DispatchPO;
import nju.edu.express.VO.DispatchVO;
import nju.edu.express.transiterblservice.DispatchBlService;
import nju.edu.express.transiterdataservice.DispatchDataService;

public class DispatchBlImpl implements DispatchBlService {

	DispatchDataService dispatchData;

	public DispatchBlImpl() {
		try {
			dispatchData = (DispatchDataService) Naming
					.lookup("rmi://127.0.0.1:6600/DispatchData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	DispatchVO[] dispatchVOList = null;
	DispatchPO[] dispatchPOList = null;

	@Override
	public DispatchVO[] getDispatchList(String trasitID) {

		try {
			dispatchPOList = dispatchData.getDispatchList(trasitID);
			dispatchVOList = new DispatchVO[dispatchPOList.length];
			for (int i = 0; i < dispatchVOList.length; i++) {
				dispatchVOList[i] = transformP2V(dispatchPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return dispatchVOList;
	}

	DispatchVO dispatchVO = null;

	@Override
	public DispatchVO getDispatch(String dispatchID) {

		try {
			dispatchVO = transformP2V(dispatchData.getDispatch(dispatchID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return dispatchVO;
	}

	@Override
	public boolean addDispatch(DispatchVO vo) {

		try {
			return dispatchData.insertDispatch(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private DispatchVO transformP2V(DispatchPO dispatchPO) {
		// TODO Auto-generated method stub
		return null;
	}

	private DispatchPO transformV2P(DispatchVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
