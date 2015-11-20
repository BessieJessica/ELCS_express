package nju.edu.express.businesslogic.transiterbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.OutTransPO;
import nju.edu.express.VO.OutTransVO;
import nju.edu.express.transiterblservice.OutTransBlService;
import nju.edu.express.transiterdataservice.OutTransDataService;

public class OutTransBlImpl implements OutTransBlService {

	OutTransDataService outTransData;

	public OutTransBlImpl() {

		try {
			outTransData = (OutTransDataService) Naming
					.lookup("rmi://127.0.0.1:6600/OutTransData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	OutTransPO[] outTransPOList = null;
	OutTransVO[] outTransVOList = null;

	@Override
	public OutTransVO[] getOutTransList(String trasitID) {

		try {
			outTransPOList = outTransData.getOutTransList(trasitID);
			outTransVOList = new OutTransVO[outTransPOList.length];
			for (int i = 0; i < outTransVOList.length; i++) {
				outTransVOList[i] = transformP2V(outTransPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return outTransVOList;
	}

	OutTransVO outTransVO = null;

	@Override
	public OutTransVO getOutTrans(String outTransID) {

		try {
			outTransVO = transformP2V(outTransData.getOutTrans(outTransID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return outTransVO;
	}

	@Override
	public boolean addOutTrans(OutTransVO vo) {

		try {
			return outTransData.insertOutTrans(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private OutTransVO transformP2V(OutTransPO outTransPO) {
		// TODO Auto-generated method stub
		return null;
	}

	private OutTransPO transformV2P(OutTransVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
