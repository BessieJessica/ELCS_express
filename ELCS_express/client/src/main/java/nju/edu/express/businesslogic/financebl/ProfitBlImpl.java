package nju.edu.express.businesslogic.financebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.ProfitPO;
import nju.edu.express.VO.ProfitVO;
import nju.edu.express.financeblservice.ProfitBlService;
import nju.edu.express.financedataservice.ProfitDataService;

public class ProfitBlImpl implements ProfitBlService {

	ProfitDataService profitData;

	public ProfitBlImpl() {

		try {
			profitData = (ProfitDataService) Naming
					.lookup("rmi://127.0.0.1:6600/ProfitData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	ProfitVO profitVO = null;
	@Override
	public ProfitVO getProfitChart() {

		try {
			profitVO = transformP2V(profitData.getProfitChart());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return profitVO;
	}
	private ProfitVO transformP2V(ProfitPO profitChart) {
		// TODO Auto-generated method stub
		return null;
	}

}
