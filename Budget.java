
public class Budget{
	private double cashBalance;
	private double checkingAccount;
	private double savingAccount;
	
	public Budget(double cashBalance, double checkingAccount, double savingAccount) {
		super();
		this.cashBalance = cashBalance;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}
	
	private double getsavingAccount() {
		return savingAccount;
	}
	private double getcheckingAccount() {
		return checkingAccount;
	}
	private double getcashBalance() {
		return cashBalance;
	}
	private double getEarnings() {
		return cashBalance;
	}
}
