package nju.edu.express.financedata.stub;

import nju.edu.express.PO.AccountPO;
import nju.edu.express.financedataservice.AccountDataService;

public class AccountDataImpl_stub implements AccountDataService{

	@Override
	public AccountPO[] getAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPO getAccount(String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAccount(AccountPO po) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String[] accountID) {
		for(int i=0;i<accountID.length;i++){
			System.out.println(accountID[i]+" 已删除");
		}
	}

	@Override
	public void updateAccount(AccountPO po) {
		// TODO Auto-generated method stub
		
	}

}
