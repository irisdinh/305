
public class Expense {
	private double amount;
	private String name;
	private String catagory;

	public Expense(double amount, String name, String catagory) {
		super();
		this.amount = amount;
		this.name = name;
		this.catagory = catagory;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
}
