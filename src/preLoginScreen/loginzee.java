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
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
	
	public static String user;
	public static String pswd;
	public static String name;
	public static String email;
	public static String phone;
	public static String account;
	public static String encryptedpswd;
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
    {  
        // Static getInstance method is called with hashing SHA  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
  
        // digest() method called  
        // to calculate message digest of an input  
        // and return array of byte 
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    } 
    
    public static String toHexString(byte[] hash) 
    { 
        // Convert byte array into signum representation  
        BigInteger number = new BigInteger(1, hash);  
  
        // Convert message digest into hex value  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        // Pad with leading zeros 
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
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
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				createaccountzee createAccountPage = new createaccountzee();
				createAccountPage.setVisible(true);
			}
		});
		btnCreateAccount.setForeground(Color.BLACK);
		btnCreateAccount.setFont(new Font("Arial", Font.BOLD, 10));
		btnCreateAccount.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCreateAccount.setBackground(new Color(0, 0, 128));
		btnCreateAccount.setBounds(241, 444, 138, 28);
		contentPane.add(btnCreateAccount);
		btnForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		btnForgotPassword.setForeground(new Color(0, 0, 128));
		btnForgotPassword.setFont(new Font("Arial", Font.BOLD, 10));
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBackground(new Color(255, 255, 255));
		btnForgotPassword.setBounds(222, 383, 171, 28);
		contentPane.add(btnForgotPassword);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Dont Have An Account?");
		lblNewLabel_1_1_2.setBounds(89, 444, 155, 28);
		contentPane.add(lblNewLabel_1_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(74, 276, 319, 37);
		contentPane.add(passwordField);
		
		JButton buuuuttttt = new JButton("LOGIN");
		buuuuttttt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				account = textField.getText();
				pswd = passwordField.getText().toString();
				try {
					encryptedpswd = toHexString(getSHA(pswd));
					
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(account != null && pswd != null) {
					try {
						Connection con = null;
						con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
						if(con!=null) {
							System.out.println("Connected");
							PreparedStatement st = con.prepareStatement("Select accountnumber, password from accountHolder where accountnumber=? and password=?");
							st.setString(1, account);
							st.setString(2, encryptedpswd);
							 ResultSet rs = st.executeQuery();
							PreparedStatement rst = con.prepareStatement("SELECT * FROM accountHolder Where accountnumber=?");		
							rst.setString(1, account);
							System.out.println(rst);
							    ResultSet rst1 = rst.executeQuery();
							    while(rst1.next()) {
							    	String data1 = rst1.getString(1);
							    	String data2 = rst1.getString(2);
							    	String data3 = rst1.getString(3);
							    	String data4 = rst1.getString(4);
							    	String data5 = rst1.getString(5);
							    	name = data2;
							    	account = data1;
							    	phone = data3;
							    	email = data4;
							    	pswd = data5;
							    }
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
		buuuuttttt.setForeground(new Color(0, 0, 0));
		buuuuttttt.setFont(new Font("Arial", Font.BOLD, 18));
		buuuuttttt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buuuuttttt.setBackground(new Color(0, 0, 128));
		buuuuttttt.setBounds(74, 341, 319, 37);
		contentPane.add(buuuuttttt);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1_1.setBounds(74, 246, 111, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ACCOUNT NUMBER");
		lblNewLabel_1_1.setBounds(74, 155, 170, 28);
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
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setIcon(new ImageIcon(loginzee.class.getResource("/images/3967030.jpg")));
		lblNewLabel.setBounds(0, 0, 1079, 563);
		contentPane.add(lblNewLabel);
	}
}
