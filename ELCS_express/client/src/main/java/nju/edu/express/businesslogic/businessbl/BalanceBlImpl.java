package nju.edu.express.businesslogic.businessbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.PO.OrderPO;
import nju.edu.express.VO.BalanceVO;
import nju.edu.express.businesserblservice.BalanceBlService;
import nju.edu.express.businesserdataservice.BalanceDataService;
import nju.edu.express.businesslogic.financebl.AccountBlImpl;
import nju.edu.express.financeblservice.AccountBlService;

public class BalanceBlImpl implements BalanceBlService {

	BalanceDataService balanceData;

	public BalanceBlImpl() {
		try {
			balanceData = (BalanceDataService) Naming
					.lookup("rmi://127.0.0.1:6600/BusinessBalanceData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	BalanceVO[] balanceVOList = null;
	BalancePO[] balancePOList = null;

	@Override
	public BalanceVO[] getBalanceList(String businessID, String date) {
		try {
			balancePOList = balanceData.getBalanceList(businessID, date);
			balanceVOList = new BalanceVO[balancePOList.length];
			for (int i = 0; i < balancePOList.length; i++) {
				balanceVOList[i] = transformP2V(balancePOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return balanceVOList;
	}

	BalanceVO balanceVO = null;

	@Override
	public BalanceVO getBalance(String balanceID) {
		try {
			balanceVO = transformP2V(balanceData.getBalance(balanceID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return balanceVO;
	}

	@Override
	public boolean addBalance(String businessID, BalanceVO vo) {

		try {
			// 向收款单数据库中添加数据
			return balanceData.insertBalance(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	private OrderPO transformV2P(BalanceVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private BalanceVO transformP2V(BalancePO balancePO) {
		// TODO Auto-generated method stub
		return null;
	}

}
