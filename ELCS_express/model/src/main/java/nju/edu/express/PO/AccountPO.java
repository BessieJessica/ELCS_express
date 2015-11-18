package nju.edu.express.PO;
/**
 * 银行账户－包括帐户ID-accountID，帐户密码-password，帐户余额-balanceOfAccount
 * @author asd
 *
 */
	
public class AccountPO {
	
	String accountID;
	String password;
	Double balanceOfAccount;
	/**
	 * @param accountID
	 * @param password
	 * @param balanceOfAccount
	 */
	public AccountPO(String accountID, String password, Double balanceOfAccount) {
		super();
		this.accountID = accountID;
		this.password = password;
		this.balanceOfAccount = balanceOfAccount;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalanceOfAccount() {
		return balanceOfAccount;
	}
	public void setBalanceOfAccount(Double balanceOfAccount) {
		this.balanceOfAccount = balanceOfAccount;
	}

}
