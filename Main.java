import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import javax.swing.event.*;

public class Main extends MouseInputAdapter implements ActionListener {
	public static void main(String[] args) {
		Main gui = new Main();

	}

	private static final int FRAME_HEIGHT = 500;
	private static final int FRAME_WIDTH = 800;
	private static final Color baseColor = Color.GRAY;
	private static final Color extraColor = Color.DARK_GRAY;

	private JFrame frame;
	private Font fontTitle;
	private Font fontContent;

	private JTextField fillUser;
	private JTextField fillPass;

	private JButton signUp;
	private JButton signIn;
	private JButton fillSignUp;
	private JButton forgotPass;
	private JButton checkEmail;

	private JLabel title;
	private JLabel userCheck;

	private JTextField newUser;
	private JTextField newPass;
	private JTextField newFirst;
	private JTextField newLast;
	private JTextField newEmail;

	private static Map<Customer, Person> database;

	// constructor
	public Main() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Money Planner");

		frame.setLayout(new BorderLayout());
		frame.add(northPanel(), BorderLayout.NORTH);
		frame.add(centerPanel(), BorderLayout.CENTER);

		database = new HashMap<>();

		frame.setVisible(true);
	}

	// title of the app
	public JPanel northPanel() {
		JPanel northPanel = new JPanel(new FlowLayout());
		northPanel.setBackground(baseColor);
		Font font = new Font("SansSerif", Font.BOLD, 30);
		title = new JLabel("Welcome to Money Planner");
		title.setFont(font);
		northPanel.add(title);

		fontTitle = new Font("SansSerif", Font.BOLD, 25);
		fontContent = new Font("SansSerif", Font.BOLD, 20);

		return northPanel;
	}

	// sign in part
	public JPanel centerPanel() {
		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground(extraColor);

		JPanel label = new JPanel();

		JLabel title = new JLabel("Log In Here");
		title.setFont(fontTitle);
		label.add(title);

		JPanel signInPanel = new JPanel(new BorderLayout());
		JPanel fillIn = new JPanel(new GridLayout(5, 1));
		JLabel user = new JLabel("Username");
		user.setFont(fontContent);
		fillUser = new JTextField(15);
		fillUser.setText("");
		fillUser.setFont(fontContent);
		JLabel pass = new JLabel("Password");
		pass.setFont(fontContent);
		fillPass = new JTextField(15);
		fillPass.setText("");
		fillPass.setFont(fontContent);
		signIn = new JButton("Log In");
		signIn.setFont(fontContent);
		fillIn.add(user);
		fillIn.add(fillUser);
		fillIn.add(pass);
		fillIn.add(fillPass);
		fillIn.add(signIn);
		signInPanel.add(fillIn, BorderLayout.CENTER);

		JPanel signUpPanel = new JPanel(new FlowLayout());
		signUp = new JButton("Sign Up");
		signUp.setFont(fontContent);
		signUpPanel.add(signUp);
		forgotPass = new JButton("Forgot your password?");
		forgotPass.setFont(fontContent);
		signUpPanel.add(forgotPass);
		signInPanel.add(signUpPanel, BorderLayout.SOUTH);

		JPanel userPanel = new JPanel(new FlowLayout());
		userCheck = new JLabel("Credit to Trang, Iris, Ruhee, Kirubel");
		userCheck.setFont(fontContent);
		userPanel.add(userCheck);
		frame.add(userPanel, BorderLayout.SOUTH);

		signIn.addActionListener(this);
		signUp.addActionListener(this);
		forgotPass.addActionListener(this);

		centerPanel.add(label, BorderLayout.NORTH);
		centerPanel.add(signInPanel, BorderLayout.CENTER);

		return centerPanel;
	}

	// check mouse click
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();

		if (source == signIn) {
			signIn();
		} else if (source == signUp) {
			signUp();
		} else if (source == fillSignUp) {
			assign();
		} else if (source == forgotPass) {
			forgot();
		} else if (source == checkEmail) {

		}
	}

	// sign in details
	public void signIn() {
		if (fillUser.getText().isEmpty() || fillPass.getText().isEmpty()) {
			userCheck.setText("Please type your username and password");
		} else {
			String temPass = fillPass.getText();
			String temUser = fillUser.getText();
			Customer tem = new Customer(temUser, temPass);
			if (!tem.signIn(temUser, temPass)) {
				userCheck.setText("Your username and password may wrong. Please type again.");
			} else {
				main();
			}

		}
	}

	// sign up
	public void signUp() {
		frame.getContentPane().removeAll();
		frame.revalidate();
		frame.repaint();

		JPanel signUpPanel = new JPanel(new BorderLayout());
		JLabel label = new JLabel("Sign Up Here");
		label.setFont(fontContent);
		signUpPanel.add(label, BorderLayout.NORTH);
		signUpPanel.add(southPanel(), BorderLayout.CENTER);
		frame.add(signUpPanel);
		frame.setContentPane(signUpPanel);
		frame.setVisible(true);

	}

	// when press button
	public void assign() {
		Person newPer = new Person(newUser.getText(), newPass.getText());
		Customer newCus = new Customer(newUser.getText(), newPass.getText());
		database.put(newCus, newPer);
		System.out.println(newPer.toString());
		System.out.println(newCus.toString());

	}

	// fill in details
	public JPanel southPanel() {
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.setBackground(extraColor);
		JPanel fillIn = new JPanel(new GridLayout(12, 1));

		JLabel user = new JLabel("Username");
		user.setFont(fontContent);
		newUser = new JTextField(20);
		newUser.setText("");
		JLabel first = new JLabel("First Name");
		first.setFont(fontContent);
		newFirst = new JTextField(20);
		newFirst.setText("");
		JLabel last = new JLabel("Last Name");
		last.setFont(fontContent);
		newLast = new JTextField(20);
		newLast.setText("");
		JLabel email = new JLabel("Email");
		email.setFont(fontContent);
		newEmail = new JTextField(20);
		newEmail.setText("");
		newEmail.setFont(fontContent);
		JLabel pass = new JLabel("Password");
		pass.setFont(fontContent);
		newPass = new JTextField(20);
		newPass.setText("");
		fillSignUp = new JButton("Sign Up");
		fillSignUp.setFont(fontContent);

		fillIn.add(user);
		fillIn.add(newUser);
		fillIn.add(pass);
		fillIn.add(newPass);
		fillIn.add(first);
		fillIn.add(newFirst);
		fillIn.add(last);
		fillIn.add(newLast);
		fillIn.add(email);
		fillIn.add(newEmail);
		fillIn.add(fillSignUp);

		southPanel.add(fillIn);
		fillSignUp.addActionListener(this);
		return southPanel;

	}

	public void forgot() {
		frame.getContentPane().removeAll();
		frame.revalidate();
		frame.repaint();

		JPanel forgot = new JPanel(new GridLayout(5, 1));
		JLabel inform1 = new JLabel("Please type our email below.");
		inform1.setFont(fontContent);
		JLabel inform2 = new JLabel("We will send you an email to recover your password.");
		inform2.setFont(fontContent);
		JLabel email = new JLabel("Email");
		email.setFont(fontContent);
		JTextField fillForgotEmail = new JTextField("");
		fillForgotEmail.setFont(fontContent);
		checkEmail = new JButton("Send");
		checkEmail.setFont(fontContent);

		forgot.add(inform1);
		forgot.add(inform2);
		forgot.add(email);
		forgot.add(fillForgotEmail);
		forgot.add(checkEmail);

		checkEmail.addActionListener(this);
		frame.add(forgot);
		frame.setContentPane(forgot);
		frame.setVisible(true);

	}

	// main page
	public void main() {

	}
}
