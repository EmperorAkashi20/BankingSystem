package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;

import postLogin.deposit;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.awt.event.ActionEvent;

public class createaccountzee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createaccountzee frame = new createaccountzee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
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
	public createaccountzee() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 607
				);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField_1.setBounds(589, 431, 336, 37);
		contentPane.add(passwordField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(589, 357, 336, 37);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login?");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
			}
		});
		btnLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLogin.setForeground(new Color(0, 0, 128));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 10));
		btnLogin.setBorder(null);
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(932, 476, 56, 34);
		contentPane.add(btnLogin);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String phone = textField_1.getText();
				String email = textField_2.getText();
				String pswd = passwordField.getText().toString();
				String confpswd = passwordField_1.getText().toString();
				String currentbal = "0";
					try {
						encryptedpswd = toHexString(getSHA(pswd));
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				if(name !=null && phone != null && email !=null && pswd !=null && confpswd !=null & pswd.length()>=8) {
					if(!confpswd .equals(pswd)) {
						JFrame f=new JFrame();  
					    JOptionPane.showMessageDialog(f,"Password Mismatch. Please check if password and confirm password are same.");  
					} else {
						System.out.println("Match");
						Connection con = null;
						try {
							con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
							if(con!=null) {
								System.out.println("Connected");
								Random rand = new Random();
								long drand = (long)((rand.nextDouble()*10000000000L));
								String accountNumber = Long.toString(drand);
								System.out.println(drand);
								String sqli = "insert into accountHolder(accountnumber, name, phonenumber, email, password, currentbalance)" + "VALUES(?,?,?,?,?,?)";
								PreparedStatement st = con.prepareStatement(sqli);
								ResultSet rs = st.executeQuery("Show tables");
							      System.out.println("Tables in the current database: ");
							      while(rs.next()) {
							         System.out.print(rs.getString(1));
							         System.out.println();
							      }
								System.out.println(st);
								st.setString(1, accountNumber);
								st.setString(2, name);
								st.setString(3, phone);
								st.setString(4, email);
								st.setString(5, encryptedpswd);
								st.setString(6, currentbal);
								st.execute();
								System.out.println("INSERTED");
								dispose();
								loginzee loginScreen = new loginzee();
								loginScreen.setVisible(true);
								JFrame f=new JFrame();  
							    JOptionPane.showMessageDialog(f,"Account creation successful. Please take note of the following: \n 1. Keep your account number: " +accountNumber+ " and password safe \n 2. Deposit a minimum of INR 1000 as soon as possible. \n Please login to continue.");  
								
							}
						} catch (Exception notConnected) {
							System.out.println(notConnected);
						}
					}
				}	
			}
		});
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setFont(new Font("Arial", Font.BOLD, 18));
		btnCreateAccount.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCreateAccount.setBackground(new Color(0, 0, 128));
		btnCreateAccount.setBounds(589, 476, 333, 37);
		contentPane.add(btnCreateAccount);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_1_1_1_1.setBounds(589, 402, 200, 34);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1_1_1.setBounds(589, 331, 170, 26);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email ID");
		lblNewLabel_1_1_1_1.setBounds(589, 244, 170, 34);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone Number");
		lblNewLabel_1_1_1.setBounds(589, 177, 181, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(589, 277, 336, 43);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(589, 202, 336, 34);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(589, 138, 336, 34);
		contentPane.add(textField);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(createaccountzee.class.getResource("/images/small logo2.png")));
		logo.setBounds(735, 62, 122, 34);
		contentPane.add(logo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setBounds(589, 107, 181, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(128, 128, 128), null));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(552, 36, 478, 495);
		contentPane.add(panel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(516, 0, 553, 574);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(createaccountzee.class.getResource("/images/3967030.jpg")));
		lblNewLabel.setBounds(0, 0, 1069, 574);
		contentPane.add(lblNewLabel);
	}

}
