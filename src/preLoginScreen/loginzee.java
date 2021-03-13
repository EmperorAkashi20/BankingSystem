	package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class loginzee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginzee frame = new loginzee();
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
	public loginzee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnForgotPassword = new JButton("Forgot Password ?");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		btnForgotPassword.setForeground(new Color(0, 0, 128));
		btnForgotPassword.setFont(new Font("Arial", Font.BOLD, 10));
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBackground(new Color(255, 255, 255));
		btnForgotPassword.setBounds(222, 383, 171, 28);
		contentPane.add(btnForgotPassword);
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				createaccountzee createAccountPage = new createaccountzee();
				createAccountPage.setVisible(true);
			}
		});
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setFont(new Font("Arial", Font.BOLD, 10));
		btnCreateAccount.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCreateAccount.setBackground(new Color(0, 0, 128));
		btnCreateAccount.setBounds(241, 444, 138, 28);
		contentPane.add(btnCreateAccount);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Dont Have An Account?");
		lblNewLabel_1_1_2.setBounds(106, 444, 138, 28);
		contentPane.add(lblNewLabel_1_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(74, 276, 319, 37);
		contentPane.add(passwordField);
		
		JButton buuuuttttt = new JButton("LOGIN");
		buuuuttttt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				String pswd = passwordField.getText().toString();
				if(user != null && pswd != null) {
					try {
						Connection con = null;
						con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
						if(con!=null) {
							System.out.println("Connected");
							PreparedStatement st = con.prepareStatement("Select email, password from accountHolder where email=? and password=?");
							System.out.println(st);
							st.setString(1, user);
							st.setString(2, pswd);
							 ResultSet rs = st.executeQuery();
							if(rs.next()) {
								dispose();
								homepagezee homePage = new homepagezee();
								homePage.setVisible(true);
								JFrame f=new JFrame();  
							    JOptionPane.showMessageDialog(f,"Successfully Loggedin");  
							} else {
								JFrame f=new JFrame();  
							    JOptionPane.showMessageDialog(f,"Entered email or password is incorrect"); 
							}
						}
					} catch(Exception loginException) {
						System.out.println(loginException);
					}
				}
			}
		});
		buuuuttttt.setForeground(Color.WHITE);
		buuuuttttt.setFont(new Font("Arial", Font.BOLD, 18));
		buuuuttttt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buuuuttttt.setBackground(new Color(0, 0, 128));
		buuuuttttt.setBounds(74, 341, 319, 37);
		contentPane.add(buuuuttttt);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1_1.setBounds(74, 246, 111, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("EMAIL");
		lblNewLabel_1_1.setBounds(74, 155, 111, 28);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setColumns(10);
		textField.setBounds(74, 184, 319, 37);
		contentPane.add(textField);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(loginzee.class.getResource("/images/small logo2.png")));
		logo.setBounds(192, 101, 167, 49);
		contentPane.add(logo);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(128, 128, 128), null));
		panel_1_1.setBounds(43, 76, 455, 422);
		contentPane.add(panel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 553, 563);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(loginzee.class.getResource("/images/3967030.jpg")));
		lblNewLabel.setBounds(0, 0, 1079, 563);
		contentPane.add(lblNewLabel);
	}
}
