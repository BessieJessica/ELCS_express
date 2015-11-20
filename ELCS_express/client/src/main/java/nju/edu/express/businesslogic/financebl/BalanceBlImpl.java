package nju.edu.express.businesslogic.financebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.VO.BalanceVO;
import nju.edu.express.businesserdataservice.BalanceDataService;
import nju.edu.express.financeblservice.AccountBlService;
import nju.edu.express.financeblservice.BalanceBlService;

public class BalanceBlImpl implements BalanceBlService {

	BalanceDataService balanceData;
	AccountBlService accountBl;

	public BalanceBlImpl() {

		try {
			balanceData = (BalanceDataService) Naming
					.lookup("rmi://127.0.0.1:6600/BusinessBalanceData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		accountBl = new AccountBlImpl();

	}

	BalanceVO[] balanceVOList = null;
	BalancePO[] balancePOList = null;

	@Override
	public BalanceVO[] getBalanceList(String businessID, String date) {

		try {
			balancePOList = balanceData.getBalanceList(businessID, date);
			balanceVOList = new BalanceVO[balancePOList.length];
			for (int i = 0; i < balanceVOList.length; i++) {
				balanceVOList[i] = transformP2V(balancePOList[i]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return balanceVOList;
	}

	@Override
	public boolean updateBalanceToAccount(String businessID, BalanceVO vo) {
		// 更新银行账户金额
		return accountBl.updateBalanceIncome(businessID, vo);

	}

	private BalanceVO transformP2V(BalancePO balancePO) {
		// TODO Auto-generated method stub
		return null;
	}

}
