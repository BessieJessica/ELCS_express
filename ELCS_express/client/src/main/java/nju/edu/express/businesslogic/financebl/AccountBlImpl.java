package nju.edu.express.businesslogic.financebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import nju.edu.express.PO.AccountPO;
import nju.edu.express.VO.AccountVO;
import nju.edu.express.VO.BalanceVO;
import nju.edu.express.VO.PaymentVO;
import nju.edu.express.financeblservice.AccountBlService;
import nju.edu.express.financedataservice.AccountDataService;

public class AccountBlImpl implements AccountBlService {

	AccountDataService accountData;

	public AccountBlImpl() {

		try {
			accountData = (AccountDataService) Naming
					.lookup("rmi://127.0.0.1:6600/AccountData");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

	AccountPO[] accountPOList = null;
	AccountVO[] accountVOList = null;

	@Override
	public AccountVO[] getAccountList() {

		try {
			accountPOList = accountData.getAccountList();
			accountVOList = new AccountVO[accountPOList.length];
			for (int i = 0; i < accountVOList.length; i++) {
				accountVOList[i] = transformP2V(accountPOList[i]);
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return accountVOList;
	}

	AccountVO accountVO = null;

	@Override
	public AccountVO getAccount(String accountID) {

		try {
			accountVO = transformP2V(accountData.getAccount(accountID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return accountVO;
	}

	@Override
	public boolean addAccount(AccountVO vo) {

		try {
			return accountData.insertAccount(transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delAccount(String[] accountID) {

		try {
			return accountData.deleteAccount(accountID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean endAccount(String accountID, AccountVO vo) {

		try {
			return accountData.updateAccount(accountID, transformV2P(vo));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateBalanceIncome(String businessID, BalanceVO vo) {
		// 根据businessID来判断收款单来自哪一个营业厅并对应哪一个账本
		// 转换balanceVO为AccountVO，即提取其中的总额封装成部分数据为空的AccountVO
		// 调用endAccount方法进行银行账户更新

		return false;
	}

	public boolean updatePaymentOutcome(String accountID, PaymentVO vo) {
		// 对应账本
		// 转换PaymentVO为AccountVO，集体去其中的总额封装成部分数据为空的AccountVO
		// 调用endAccount方法进行银行账户更新

		return false;
	}

	private AccountPO transformV2P(AccountVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	private AccountVO transformP2V(AccountPO accountPO) {
		// TODO Auto-generated method stub
		return null;
	}

}
