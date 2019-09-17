import javax.swing.event.MouseInputAdapter;

public class Person {
	private String lastName;
	private String firstName;
	private String email;
	private double balance;
	private String userName;
	private String passWord;

	public Person(String user, String pass) {
		this.userName=user;
		this.passWord=pass;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.balance = balance;
	}

	public void setLastN(String last) {
		lastName = last;
	}

	public void setFirstN(String first) {
		firstName = first;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastN() {
		return lastName;
	}

	public String getFirstN() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return "Username: " + userName + "Password: " + passWord; 
	}
}
