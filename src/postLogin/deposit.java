package postLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import preLoginScreen.homepagezee;
import preLoginScreen.loginzee;

import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;

public class deposit extends JFrame {

	private JPanel contentPane;
	private JTextField text_2;
	private JTextField text1;
	private JTextField text;
	private JTextField txt;
	private JTextField amtfi;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposit frame = new deposit();
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
	
	public static String currentamt;
	public static String depositamt;
	public static ResultSet rst1;
	public static long num,num2;
	public static String finalbalance;

	/**
	 * Create the frame.
	 */
	public deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JLabel lblWorkzeenatgmailcom = new JLabel(nameField);
		lblWorkzeenatgmailcom.setBackground(new Color(255, 255, 255));
		lblWorkzeenatgmailcom.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblWorkzeenatgmailcom.setBounds(10,335,207,31);
		contentPane.setLayout(null);
		
		JButton btnNewButton_5_1 = new JButton("DEPOSIT");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnNewButton_3.setBounds(96, 526, 121, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 441, 207, 31);
		contentPane.add(mobfi);
		
		textField = new JTextField();
		textField.setText("Mobile Number");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(10, 399, 207, 31);
		contentPane.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(306, 103, 16, 19);
		contentPane.add(lblNewLabel_2);
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(316, 103, 65, 23);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5 = new JButton("DASHBOARD");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(30, 144, 255));
		btnNewButton_5.setBounds(242, 103, 65, 23);
		contentPane.add(btnNewButton_5);
		
		text = new JTextField();
		text.setBounds(10, 293, 207, 31);
		text.setBorder(null);
		text.setForeground(Color.WHITE);
		text.setBackground(new Color(0, 0, 128));
		text.setFont(new Font("Tahoma", Font.BOLD, 17));
		text.setText("Email Address");
		contentPane.add(text);
		text.setColumns(10);
		
		text1 = new JTextField();
		text1.setBounds(10, 194, 207, 31);
		text1.setBorder(null);
		text1.setForeground(Color.WHITE);
		text1.setBackground(new Color(0, 0, 128));
		text1.setFont(new Font("Tahoma", Font.BOLD, 17));
		text1.setText("Account Number");
		contentPane.add(text1);
		text1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(285, 145, 746, 366);
		contentPane.add(panel_3);
		
		JButton btnNewButton_4 = new JButton("back");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_4.setBackground(new Color(0, 0, 128));
		btnNewButton_4.setBounds(611, 280, 104, 33);
		panel_3.add(btnNewButton_4);
		
		JButton btnDone = new JButton("DEPOSIT");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositamt = amtfi.getText();
				num = Long.parseLong(depositamt);
				Connection con = null;
				try {
					con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
					if(con!=null) {
						System.out.println("Connected");
						PreparedStatement rst = con.prepareStatement("select * from accountholder where accountnumber="+accountField);
						rst1 = rst.executeQuery();
						while(rst1.next()) {
							currentamt = rst1.getString(6);
							System.out.println(currentamt);
							num2 = Long.parseLong(currentamt);
							System.out.println(num2);
						}
						PreparedStatement st = con.prepareStatement("update accountholder set currentbalance=? where accountnumber="+accountField);
						finalbalance = String.valueOf(num+num2);
						st.setString(1, finalbalance);
						st.execute();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDone.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDone.setBackground(new Color(0, 0, 128));
		btnDone.setForeground(new Color(255, 255, 255));
		btnDone.setFont(new Font("Arial", Font.BOLD, 18));
		btnDone.setBounds(292, 218, 170, 31);
		panel_3.add(btnDone);
		
		JLabel label1 = new JLabel("Enter Your Amount -");
		label1.setBounds(30, 41, 239, 38);
		panel_3.add(label1);
		label1.setFont(new Font("Arial", Font.BOLD, 20));
		
		amtfi = new JTextField();
		amtfi.setBounds(275, 48, 213, 31);
		panel_3.add(amtfi);
		amtfi.setColumns(10);
		
		txt = new JTextField();
		txt.setBounds(30, 102, 197, 50);
		panel_3.add(txt);
		txt.setHorizontalAlignment(SwingConstants.LEFT);
		txt.setBorder(null);
		txt.setOpaque(false);
		txt.setFont(new Font("Arial", Font.BOLD, 22));
		txt.setText("Choose the way -");
		txt.setColumns(10);
		
		JRadioButton radio1 = new JRadioButton("Credit / Debit Card    ");
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Card Deposit"); 
			    radio1.setSelected(false);
			}
		});
		radio1.setBounds(160, 159, 239, 38);
		panel_3.add(radio1);
		radio1.setOpaque(false);
		radio1.setBackground(new Color(204, 255, 255));
		radio1.setFont(new Font("Arial", Font.BOLD, 18));
		
		JRadioButton radio2 = new JRadioButton("UPI");
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"UPI Deposit"); 
			    radio2.setSelected(false);
			}
		});
		radio2.setBounds(401, 159, 197, 38);
		panel_3.add(radio2);
		radio2.setOpaque(false);
		radio2.setBackground(new Color(204, 255, 255));
		radio2.setFont(new Font("Arial", Font.BOLD, 18));
		radio2.setHorizontalAlignment(SwingConstants.CENTER);
		
		text_2 = new JTextField();
		text_2.setBounds(10, 103, 207, 31);
		text_2.setBorder(null);
		text_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		text_2.setBackground(new Color(0, 0, 128));
		text_2.setForeground(new Color(255, 255, 255));
		text_2.setText("Username");
		contentPane.add(text_2);
		text_2.setColumns(10);
		
		JLabel accountnum = new JLabel(accountField);
		accountnum.setBounds(10, 236, 207, 32);
		accountnum.setOpaque(true);
		accountnum.setForeground(new Color(0, 0, 0));
		accountnum.setBackground(Color.WHITE);
		accountnum.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(accountnum);
		
		JLabel name = new JLabel(nameField);
		name.setBounds(10, 145, 207, 31);
		name.setOpaque(true);
		name.setForeground(new Color(0, 0, 0));
		name.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		name.setBackground(new Color(255, 255, 255));
		contentPane.add(name);
		
		JLabel emailfi = new JLabel(emailField);
		emailfi.setBounds(10, 335, 207, 31);
		emailfi.setOpaque(true);
		emailfi.setForeground(Color.BLACK);
		emailfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		emailfi.setBackground(new Color(255, 255, 255));
		contentPane.add(emailfi);
		
		JButton button = new JButton("Welcome, " +nameField);
		button.setBounds(759, 0, 310, 31);
		button.setBorder(null);
		button.setForeground(new Color(0, 0, 128));
		button.setBackground(new Color(255, 255, 255));
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(button);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 87, 232, 481);
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		contentPane.add(panel_2);
		
		JButton button_2 = new JButton("logout");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginScreen = new loginzee();
				loginScreen.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Logged Out Successfully"); 
			}
		});
		button_2.setBounds(1016, 30, 53, 19);
		contentPane.add(button_2);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JLabel logo = new JLabel("");
		logo.setBounds(10, 0, 121, 47);
		logo.setIcon(new ImageIcon(deposit.class.getResource("/images/small logo2.png")));
		contentPane.add(logo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 57, 1079, 31);
		panel_1.setBackground(new Color(0, 0, 139));
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1079, 59);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 102, 51));
		lblNewLabel.setIcon(new ImageIcon(deposit.class.getResource("/images/3967030.jpg")));
		lblNewLabel.setBounds(0, 0, 1079, 568);
		contentPane.add(lblNewLabel);
	}
}