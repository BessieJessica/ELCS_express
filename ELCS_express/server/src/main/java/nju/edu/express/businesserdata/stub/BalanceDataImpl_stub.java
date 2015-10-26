package nju.edu.express.businesserdata.stub;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.PO.OrderPO;
import nju.edu.express.businesserdataservice.BalanceDataService;

public class BalanceDataImpl_stub implements BalanceDataService {
	BalancePO[] balancepoList;

	@Override
	public void insertBalance(OrderPO orderPO) {
		// TODO Auto-generated method stub

	}

	@Override
	public BalancePO[] getBalanceList(String BusinessId, String date) {
		// TODO Auto-generated method stub
		balancepoList=new BalancePO[1];
		balancepoList[0]=new BalancePO("10000");
		return balancepoList;
	}

	@Override
	public BalancePO getBalance(String BalanceID) {
		// TODO Auto-generated method stub
		return null;
	}

}
