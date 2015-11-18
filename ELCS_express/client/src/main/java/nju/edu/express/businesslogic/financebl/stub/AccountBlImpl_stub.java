package nju.edu.express.businesslogic.financebl.stub;

import nju.edu.express.VO.AccountVO;
import nju.edu.express.financeblservice.AccountBlService;
import nju.edu.express.financedata.stub.AccountDataImpl_stub;
import nju.edu.express.financedataservice.AccountDataService;

public class AccountBlImpl_stub implements AccountBlService{

	AccountDataService account;
	@Override
	public AccountVO[] getAccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountVO getAccount(String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAccount(AccountVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delAccount(String[] accountID) {
		account = new AccountDataImpl_stub();
		account.deleteAccount(accountID);
		
	}

}
