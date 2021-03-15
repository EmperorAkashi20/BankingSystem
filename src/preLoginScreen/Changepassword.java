package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
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
import java.awt.event.ActionEvent;

public class Changepassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Changepassword frame = new Changepassword();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	String nameField=loginzee.name;
	String emailField=loginzee.email;
	String phoneField=loginzee.phone;
	String accountField=loginzee.account;
	
	public static ResultSet rst1;
	
	public static String oldPass;
	public static String newPass;
	public static String encryptedpass;
	public static String encryptednewpass;
	public static String currentpass;
	
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
	public Changepassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1086, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("DASHBOARD");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Switch Account");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Please enter account credentials"); 
			}
		});
		btnNewButton_3.setBounds(84, 528, 135, 29);
		contentPane.add(btnNewButton_3);
		
		textField_3 = new JTextField();
		textField_3.setText("Mobile Number");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(0, 0, 128));
		textField_3.setBounds(10, 386, 209, 31);
		contentPane.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setText("Email Address");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setBounds(10, 289, 209, 31);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Account Number");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(10, 187, 209, 31);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(10, 100, 209, 31);
		contentPane.add(textField);
		
		JLabel namefi = new JLabel(nameField);
		namefi.setOpaque(true);
		namefi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		namefi.setBackground(Color.WHITE);
		namefi.setBounds(10, 138, 209, 31);
		contentPane.add(namefi);
		
		JLabel acntfi = new JLabel(accountField);
		acntfi.setOpaque(true);
		acntfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		acntfi.setBackground(Color.WHITE);
		acntfi.setBounds(10, 229, 209, 31);
		contentPane.add(acntfi);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 428, 209, 31);
		contentPane.add(mobfi);
		
		JButton btnNewButton_5_1_1 = new JButton("CHANGE PASSWORD");
		btnNewButton_5_1_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1_1.setBorder(null);
		btnNewButton_5_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1_1.setBounds(384, 100, 104, 23);
		contentPane.add(btnNewButton_5_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<");
		lblNewLabel_2_1.setBounds(374, 103, 15, 19);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_5_1 = new JButton("SETTINGS");
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(315, 100, 65, 23);
		contentPane.add(btnNewButton_5_1);
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(30, 144, 255));
		btnNewButton_5.setBounds(240, 100, 65, 23);
		contentPane.add(btnNewButton_5);
		
		JButton logoutbtn = new JButton("logout");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Logged Out Successfully");
			}
		});
		logoutbtn.setForeground(Color.WHITE);
		logoutbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		logoutbtn.setBackground(new Color(0, 0, 128));
		logoutbtn.setBounds(1007, 29, 53, 18);
		contentPane.add(logoutbtn);
		
		JButton button = new JButton("Welcome, "+nameField);
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(new Color(0, 0, 128));
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(759, 0, 301, 31);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Changepassword.class.getResource("/images/small logo2.png")));
		lblNewLabel.setBounds(10, 11, 147, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(278, 164, 746, 366);
		contentPane.add(panel_3);
		
		JButton backbtn = new JButton("back");
		backbtn.setForeground(Color.WHITE);
		backbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backbtn.setBackground(new Color(0, 0, 128));
		backbtn.setBounds(611, 280, 104, 33);
		panel_3.add(backbtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("CHANGE PASSWORD");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1_1.setBounds(253, 22, 198, 31);
		panel_3.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(45, 98, 319, 37);
		panel_3.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField_1.setBounds(45, 182, 319, 37);
		panel_3.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField_2.setBounds(45, 264, 319, 37);
		panel_3.add(passwordField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Your Current Password");
		lblNewLabel_1_1_1.setBounds(45, 71, 243, 28);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("New Password");
		lblNewLabel_1_1_2.setBounds(45, 156, 111, 28);
		panel_3.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Confirm Password");
		lblNewLabel_1_1_3.setBounds(45, 240, 111, 28);
		panel_3.add(lblNewLabel_1_1_3);
		
		JButton changepassbtn = new JButton("Confirm Change");
		changepassbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oldPass = passwordField.getText().toString();
				try {
					encryptedpass = toHexString(getSHA(oldPass));
				} catch (NoSuchAlgorithmException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				newPass = passwordField_1.getText().toString();
				try {
					encryptednewpass=toHexString(getSHA(newPass));
				} catch (NoSuchAlgorithmException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				Connection con = null;
				try {
					con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
					if(con!=null) {
						System.out.println("Connected");
						PreparedStatement rst = con.prepareStatement("select * from accountholder where accountnumber="+accountField);
						rst1 = rst.executeQuery();
						while(rst1.next()) {
							currentpass=rst1.getString(5);
//							System.out.println(currentpass);
//							System.out.println(encryptedpass);
							if(currentpass!=encryptedpass) {
								System.out.println("ok");
								PreparedStatement st = con.prepareStatement("update accountholder set password=? where accountnumber="+accountField);
								st.setString(1, encryptednewpass);
								st.execute();
								JFrame f=new JFrame();  
							    JOptionPane.showMessageDialog(f,"Password changed successfully"); 
							} else {
								System.out.println("not ok");
							}
						}
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		changepassbtn.setBounds(45, 313, 319, 29);
		panel_3.add(changepassbtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(0, 58, 1079, 31);
		contentPane.add(panel_1);
		
		JLabel emailfi = new JLabel(emailField);
		emailfi.setOpaque(true);
		emailfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		emailfi.setBackground(Color.WHITE);
		emailfi.setBounds(10, 331, 209, 31);
		contentPane.add(emailfi);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(0, 87, 232, 481);
		contentPane.add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1069, 59);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(304, 101, 15, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Changepassword.class.getResource("/images/3967030.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1069, 662);
		contentPane.add(lblNewLabel_3);
	}
}
