package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstScreenWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstScreenWindow frame = new FirstScreenWindow();
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
	public FirstScreenWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 580);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeText = new JLabel("Welcome To RSYZ Corp.");
		welcomeText.setForeground(Color.GRAY);
		welcomeText.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		welcomeText.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeText.setBounds(6, 64, 768, 59);
		contentPane.add(welcomeText);
		
		JButton existingUserBtn = new JButton("Existing User");
		existingUserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginScreen login = new LoginScreen();
				login.setVisible(true);
			}
		});
		existingUserBtn.setBounds(243, 293, 117, 29);
		contentPane.add(existingUserBtn);
		
		JButton newUserBtn = new JButton("New User");
		newUserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccountScreen newUser = new CreateAccountScreen();
				newUser.setVisible(true);
			}
		});
		newUserBtn.setBounds(411, 293, 117, 29);
		contentPane.add(newUserBtn);
	}

}
