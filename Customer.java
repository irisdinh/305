
public class Customer extends Person {
	private String userName;
	private String password;
	private double balance;

	public Customer(String user, String pass) {
		super(user, pass);
		userName = user;
		password = pass;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setUser(String userName) {
		this.userName = userName;
	}

	public void setPass(String pass) {
		this.password = pass;
	}

	public double getBalance() {
		return balance;
	}

	public double getBudget() {
		return balance;
	}

	public double getLoans() {
		return balance;
	}

	public double getEarnings() {
		return balance;
	}

//	public boolean signIn(String user, String pass) {
//		if (user.equals(userName) && pass.equals(password)) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	public boolean signIn(Customer name) {
		return this.userName.equals(name.userName) && this.password.equals(name.password);
	}

	public String toString() {
		return "Username: " + userName + "Password: " + password;
	}

}
