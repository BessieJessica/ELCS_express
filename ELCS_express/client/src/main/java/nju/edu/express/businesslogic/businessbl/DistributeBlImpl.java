package nju.edu.express.businesslogic.businessbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.DistributePO;
import nju.edu.express.VO.DistributeVO;
import nju.edu.express.businesserblservice.DistributeBlService;
import nju.edu.express.businesserdataservice.DistributeDataService;

public class DistributeBlImpl implements DistributeBlService {

	DistributeDataService distributeData;

	public DistributeBlImpl() {
		try {
			distributeData = (DistributeDataService) Naming
					.lookup("rmi://127.0.0.1:6600/DistributeData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	DistributeVO[] distributeVOList = null;
	DistributePO[] distributePOList = null;

	@Override
	public DistributeVO[] getDistributeList(String businessID) {

		try {
			distributePOList = distributeData.getDistributeList(businessID);
			distributeVOList = new DistributeVO[distributePOList.length];
			for (int i = 0; i < distributeVOList.length; i++) {
				distributeVOList[i] = transformP2V(distributePOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return distributeVOList;
	}

	DistributeVO distributeVO = null;

	@Override
	public DistributeVO getDistribute(String distributeID) {

		try {
			distributeVO = transformP2V(distributeData
					.getDistribute(distributeID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return distributeVO;
	}

	@Override
	public boolean addDistribute(DistributeVO vo) {

		try {
			return distributeData.insertDistribute(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}



	private DistributeVO transformP2V(DistributePO po) {
		// TODO Auto-generated method stub
		return null;
	}

	private DistributePO transformV2P(DistributeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
