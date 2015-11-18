package nju.edu.express.businesslogic.businessbl.stub;

import nju.edu.express.PO.BalancePO;
import nju.edu.express.VO.BalanceVO;
import nju.edu.express.businesserblservice.BalanceBlService;
import nju.edu.express.businesserdata.stub.BalanceDataImpl_stub;
import nju.edu.express.businesserdataservice.BalanceDataService;

public class BalanceBlImpl_stub implements BalanceBlService {
	
	BalanceDataService balance;
	BalancePO[] balancepolist;
	BalanceVO[] balancevolist;

	public BalanceVO[] getBalanceList(String businessID) {
		// TODO Auto-generated method stub
		balance=new BalanceDataImpl_stub();
		balancepolist=balance.getBalanceList(businessID, "20151026");
		transform(balancepolist);
		return balancevolist;
	}
	
	public void transform(BalancePO[] poList){
		String id=poList[0].getID();
		balancevolist=new BalanceVO[balancepolist.length];
		balancevolist[0]=new BalanceVO(id);
	}
	public BalanceVO getBalance(String balanceID) {
		// TODO Auto-generated method stub
		return null;
	}

}