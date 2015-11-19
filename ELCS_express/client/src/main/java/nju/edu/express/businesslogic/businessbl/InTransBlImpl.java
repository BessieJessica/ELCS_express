package nju.edu.express.businesslogic.businessbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.InTransPO;
import nju.edu.express.VO.InTransVO;
import nju.edu.express.businesserblservice.InTransBlService;
import nju.edu.express.businesserdataservice.InTransDataService;

public class InTransBlImpl implements InTransBlService{

	InTransDataService inTransData;
	
	public InTransBlImpl() {

		try {
			inTransData = (InTransDataService) Naming
					.lookup("rmi://127.0.0.1:6600/InTransData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	InTransVO[] inTransVOList = null;
	InTransPO[] inTransPOList = null;
	
	@Override
	public InTransVO[] getInTransList(String businessID) {

		try {
			inTransPOList = inTransData.getInTransList(businessID);
			inTransVOList = new InTransVO[inTransPOList.length];
			for(int i=0;i<inTransVOList.length;i++){
				inTransVOList[i] = transformP2V(inTransPOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}



	@Override
	public InTransVO getInTrans(String inTransID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addInTrans(InTransVO intransVO) {
		// TODO Auto-generated method stub
		return false;
	}

	private InTransVO transformP2V(InTransPO inTransPO) {
		// TODO Auto-generated method stub
		return null;
	}
}
