import java.util.Date;

public class MainPage {
	private double inflow;
	private double outflow;
	private Date day;
	private double balance;

	public MainPage(double inflow, double outflow, Date day, double balance) {
		this.inflow = inflow;
		this.outflow = outflow;
		this.day = day;
		this.balance = balance;
	}

	public MainPage(double inflow, double outflow, Date day) {
		this.inflow = inflow;
		this.outflow = outflow;
		this.day = day;
	}

	public void add(double amount) {
		inflow = inflow + amount;
		balance = balance + amount;
	}

	public void subtract(double amount) {
		outflow = outflow + amount;
		balance = balance - amount;
	}

	public void setNewDay(double amount) {
		outflow = 0;
		inflow = 0;
	}

}
