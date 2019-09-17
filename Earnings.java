
public class Earnings {
	private double monthlyIncome;
	private double monthlyInvest;

	public Earnings(double monthlyIncome, double monthlyInvest) {
		super();
		this.monthlyIncome = monthlyIncome;
		this.monthlyInvest = monthlyInvest;
	}

	private double getmonthlyIncome() {
		return monthlyIncome;
	}

	private double getmonthlyInvest() {
		return monthlyInvest;
	}

	private void setmonthlyIncome() {
		this.monthlyIncome = monthlyIncome;
	}

	private void setmonthlyInvest() {
		this.monthlyInvest = monthlyInvest;
	}
}
