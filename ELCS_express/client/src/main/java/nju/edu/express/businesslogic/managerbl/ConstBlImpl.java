package nju.edu.express.businesslogic.managerbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.ConstPO;
import nju.edu.express.VO.ConstVO;
import nju.edu.express.managerblservice.ConstBlService;
import nju.edu.express.managerdataservice.ConstDataService;

public class ConstBlImpl implements ConstBlService {

	ConstDataService constData;

	public ConstBlImpl() {

		try {
			constData = (ConstDataService) Naming
					.lookup("rmi://127.0.0.1:6600/ConstData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	ConstVO[] constVOList = null;
	ConstPO[] constPOList = null;

	public ConstVO[] getConstList() {

		try {
			constPOList = constData.getConstList();
			constVOList = new ConstVO[constPOList.length];
			for (int i = 0; i < constVOList.length; i++) {
				constVOList[i] = transformP2V(constPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean endConst(ConstVO[] vo) {

		ConstPO[] po = new ConstPO[vo.length];
		for (int i = 0; i < vo.length; i++) {
			po[i] = transformV2P(vo[i]);
		}
		try {
			return constData.updateConst(po);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private ConstPO transformV2P(ConstVO constVO) {
		// TODO Auto-generated method stub
		return null;
	}

	private ConstVO transformP2V(ConstPO constPO) {
		// TODO Auto-generated method stub
		return null;
	}

}
