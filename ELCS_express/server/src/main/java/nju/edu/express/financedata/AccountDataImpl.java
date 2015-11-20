package nju.edu.express.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.express.PO.AccountPO;
import nju.edu.express.financedataservice.AccountDataService;

public class AccountDataImpl extends UnicastRemoteObject implements
		AccountDataService {

	public AccountDataImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public boolean insertAccount(AccountPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(String[] accountID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount(String accountID, AccountPO po) {
		// TODO Auto-generated method stub
		return false;
	}

}
