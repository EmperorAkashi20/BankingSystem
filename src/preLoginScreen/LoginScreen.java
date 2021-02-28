package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import postLogin.PostLoginPage;

import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 580);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backButton = new JButton("<<Go Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstScreenWindow firstScreen = new FirstScreenWindow();
				firstScreen.setVisible(true);
			}
		});
		backButton.setBounds(6, 17, 117, 29);
		contentPane.add(backButton);
		
		JLabel pleaseEnterText = new JLabel("Please Enter Your Id and Password (Case Sensitive)");
		pleaseEnterText.setHorizontalAlignment(SwingConstants.CENTER);
		pleaseEnterText.setBounds(6, 76, 768, 16);
		contentPane.add(pleaseEnterText);
		
		JLabel idLabel = new JLabel("User Id");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(274, 230, 61, 16);
		contentPane.add(idLabel);
		
		JLabel pswdLabel = new JLabel("Password");
		pswdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pswdLabel.setBounds(274, 270, 61, 16);
		contentPane.add(pswdLabel);
		
		textField = new JTextField();
		textField.setBounds(347, 225, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(347, 265, 130, 26);
		contentPane.add(textField_1);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PostLoginPage postLogin = new PostLoginPage();
				postLogin.setVisible(true);
			}
		});
		loginBtn.setBounds(657, 495, 117, 29);
		contentPane.add(loginBtn);
		
		JButton signUpBtnOnLoginScreen = new JButton("Sign Up");
		signUpBtnOnLoginScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccountScreen newUser = new CreateAccountScreen();
				newUser.setVisible(true);
			}
		});
		signUpBtnOnLoginScreen.setBounds(6, 495, 117, 29);
		contentPane.add(signUpBtnOnLoginScreen);
		
		JLabel noAccountText = new JLabel("Not Yet Registered?");
		noAccountText.setBounds(6, 477, 143, 16);
		contentPane.add(noAccountText);
	}
}
