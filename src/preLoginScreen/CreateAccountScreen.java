package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;

public class CreateAccountScreen extends JFrame {

	private JPanel contentPane;
	private JTextField confPswdField;
	private JTextField txtDd;
	private JTextField confirmEmailField;
	private JTextField lastNameField;
	private JTextField pswdField;
	private JTextField phoneField;
	private JTextField emailField;
	private JTextField firstNameField;
	private JTextField txtMm;
	private JTextField txtYyyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccountScreen frame = new CreateAccountScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateAccountScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 580);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton goBack = new JButton("<<Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstScreenWindow firstScreen = new FirstScreenWindow();
				firstScreen.setVisible(true);
			}
		});
		goBack.setBounds(6, 17, 117, 29);
		contentPane.add(goBack);
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(6, 119, 78, 16);
		contentPane.add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email ID");
		emailLabel.setBounds(6, 162, 61, 16);
		contentPane.add(emailLabel);
		
		JLabel phoneNumberLabel = new JLabel("Phone Number");
		phoneNumberLabel.setBounds(6, 214, 105, 16);
		contentPane.add(phoneNumberLabel);
		
		JLabel pswdLabel = new JLabel("Password");
		pswdLabel.setBounds(6, 269, 61, 16);
		contentPane.add(pswdLabel);
		
		JLabel registerWithUsText = new JLabel("Not a member Yet? Register Now!");
		registerWithUsText.setHorizontalAlignment(SwingConstants.CENTER);
		registerWithUsText.setBounds(6, 63, 768, 16);
		contentPane.add(registerWithUsText);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(432, 119, 78, 16);
		contentPane.add(lastNameLabel);
		
		JLabel confirmEmailLabel = new JLabel("Confirm Email");
		confirmEmailLabel.setBounds(432, 162, 100, 16);
		contentPane.add(confirmEmailLabel);
		
		JLabel dobLabel = new JLabel("D.O.B");
		dobLabel.setBounds(432, 214, 61, 16);
		contentPane.add(dobLabel);
		
		JLabel confPswdLabel = new JLabel("Confirm Password");
		confPswdLabel.setBounds(432, 269, 125, 16);
		contentPane.add(confPswdLabel);
		
		confPswdField = new JTextField();
		confPswdField.setColumns(10);
		confPswdField.setBounds(553, 260, 209, 35);
		contentPane.add(confPswdField);
		
		txtDd = new JTextField();
		txtDd.setForeground(Color.LIGHT_GRAY);
		txtDd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDd.setText("DD");
		txtDd.setColumns(10);
		txtDd.setBounds(553, 205, 61, 35);
		contentPane.add(txtDd);
		
		confirmEmailField = new JTextField();
		confirmEmailField.setText("e.g email@yourname.com");
		confirmEmailField.setForeground(Color.LIGHT_GRAY);
		confirmEmailField.setColumns(10);
		confirmEmailField.setBounds(553, 157, 209, 35);
		contentPane.add(confirmEmailField);
		
		lastNameField = new JTextField();
		lastNameField.setForeground(Color.LIGHT_GRAY);
		lastNameField.setText("e.g Doe");
		lastNameField.setColumns(10);
		lastNameField.setBounds(553, 110, 209, 35);
		contentPane.add(lastNameField);
		
		pswdField = new JTextField();
		pswdField.setColumns(10);
		pswdField.setBounds(102, 260, 209, 35);
		contentPane.add(pswdField);
		
		phoneField = new JTextField();
		phoneField.setText("e.g 99XXX XXXXX");
		phoneField.setForeground(Color.LIGHT_GRAY);
		phoneField.setColumns(10);
		phoneField.setBounds(150, 205, 161, 35);
		contentPane.add(phoneField);
		
		emailField = new JTextField();
		emailField.setForeground(Color.LIGHT_GRAY);
		emailField.setText("e.g email@yourname.com");
		emailField.setColumns(10);
		emailField.setBounds(102, 157, 209, 35);
		contentPane.add(emailField);
		
		firstNameField = new JTextField();
		firstNameField.setForeground(Color.LIGHT_GRAY);
		firstNameField.setText("e.g John");
		firstNameField.setColumns(10);
		firstNameField.setBounds(102, 110, 209, 35);
		contentPane.add(firstNameField);
		
		txtMm = new JTextField();
		txtMm.setForeground(Color.LIGHT_GRAY);
		txtMm.setText("MM");
		txtMm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMm.setColumns(10);
		txtMm.setBounds(626, 205, 61, 35);
		contentPane.add(txtMm);
		
		txtYyyy = new JTextField();
		txtYyyy.setForeground(Color.LIGHT_GRAY);
		txtYyyy.setText("YYYY");
		txtYyyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtYyyy.setColumns(10);
		txtYyyy.setBounds(701, 205, 61, 35);
		contentPane.add(txtYyyy);
		
		JButton signUpBtn = new JButton("Sign Up>>");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signUpBtn.setBounds(657, 495, 117, 29);
		contentPane.add(signUpBtn);
		
		JLabel lblNewLabel = new JLabel("+91");
		lblNewLabel.setBounds(112, 214, 32, 16);
		contentPane.add(lblNewLabel);
		
		JCheckBox iAgreeCheckBox = new JCheckBox("By signing up, I agree to all terms and conditions");
		iAgreeCheckBox.setBounds(6, 496, 360, 23);
		contentPane.add(iAgreeCheckBox);
	}
}
