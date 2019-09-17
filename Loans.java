
public class Loans {
	private double creditBalance;
	private double interestRate;
	private int periodOfLoan;

	public Loans(double creditBalance, double interestRate, int periodOfLoan) {
		super();
		this.creditBalance = creditBalance;
		this.interestRate = interestRate;
		this.periodOfLoan = periodOfLoan;
	}

	private double getcreditBalance() {
		return creditBalance;
	}

	private double getinterestRate() {
		return interestRate;
	}

	private int getperiodOfLoan() {
		return periodOfLoan;
	}
}
