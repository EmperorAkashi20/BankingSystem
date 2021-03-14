package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;

import postLogin.availablebalance;
import postLogin.deposit;
import postLogin.withdraw;

import javax.swing.UIManager;
import java.awt.Toolkit;

public class homepagezee extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtAccountNumber;
	private JTextField txtEmailId;
	private JTextField txtMobileNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepagezee frame = new homepagezee();
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
	/**
	 * Create the frame.
	 */
	public homepagezee() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\small logo2.png"));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("logout");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Logged Out Successfully"); 
			}
		});
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon(homepagezee.class.getResource("/images/pnghut_brand-web-crawler-logo-service-purple-compare-icon.png")));
		lblNewLabel_2_1_2.setBounds(606, 368, 121, 105);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 442, 207, 31);
		contentPane.add(mobfi);
		
		JLabel accfi = new JLabel(accountField);
		accfi.setOpaque(true);
		accfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		accfi.setBackground(Color.WHITE);
		accfi.setBounds(10, 236, 207, 32);
		contentPane.add(accfi);
		
		JLabel namefi = new JLabel(nameField);
		namefi.setOpaque(true);
		namefi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		namefi.setBackground(Color.WHITE);
		namefi.setBounds(10, 145, 207, 31);
		contentPane.add(namefi);
		
		JLabel emailfi = new JLabel(emailField);
		emailfi.setOpaque(true);
		emailfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		emailfi.setBackground(new Color(255, 255, 255));
		emailfi.setBounds(10, 335, 207, 31);
		contentPane.add(emailfi);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(homepagezee.class.getResource("/images/u.png")));
		lblNewLabel_2_1_1.setBounds(884, 368, 117, 105);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(homepagezee.class.getResource("/images/UPL.png")));
		lblNewLabel_2_1.setBounds(340, 368, 117, 105);
		contentPane.add(lblNewLabel_2_1);
		
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
		btnNewButton_3.setBounds(88, 526, 129, 31);
		contentPane.add(btnNewButton_3);
		
		txtMobileNumber = new JTextField();
		txtMobileNumber.setText("Mobile Number");
		txtMobileNumber.setForeground(Color.WHITE);
		txtMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtMobileNumber.setColumns(10);
		txtMobileNumber.setBorder(null);
		txtMobileNumber.setBackground(new Color(0, 0, 128));
		txtMobileNumber.setBounds(10, 403, 207, 31);
		contentPane.add(txtMobileNumber);
		
		txtEmailId = new JTextField();
		txtEmailId.setText("Email Address");
		txtEmailId.setForeground(Color.WHITE);
		txtEmailId.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtEmailId.setColumns(10);
		txtEmailId.setBorder(null);
		txtEmailId.setBackground(new Color(0, 0, 128));
		txtEmailId.setBounds(10, 293, 207, 31);
		contentPane.add(txtEmailId);
		
		txtAccountNumber = new JTextField();
		txtAccountNumber.setText("Account Number");
		txtAccountNumber.setForeground(Color.WHITE);
		txtAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAccountNumber.setColumns(10);
		txtAccountNumber.setBorder(null);
		txtAccountNumber.setBackground(new Color(0, 0, 128));
		txtAccountNumber.setBounds(10, 194, 207, 31);
		contentPane.add(txtAccountNumber);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(0, 57, 1079, 31);
		contentPane.add(panel_1);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(new Color(0, 0, 128));
		txtUsername.setBounds(10, 103, 207, 31);
		contentPane.add(txtUsername);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(homepagezee.class.getResource("/images/t.png")));
		lblNewLabel_4.setBounds(890, 125, 129, 105);
		contentPane.add(lblNewLabel_4);
		
		JButton settingbtn = new JButton("SETTINGS");
		settingbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				settings settingsPage = new settings();
				settingsPage.setVisible(true);
			}
		});
		settingbtn.setForeground(Color.WHITE);
		settingbtn.setFont(new Font("Arial", Font.BOLD, 10));
		settingbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		settingbtn.setBackground(new Color(0, 102, 255));
		settingbtn.setBounds(890, 484, 121, 27);
		contentPane.add(settingbtn);
		
		JButton otherservicesbtn = new JButton("OTHER SERVICES");
		otherservicesbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		otherservicesbtn.setForeground(Color.WHITE);
		otherservicesbtn.setFont(new Font("Arial", Font.BOLD, 10));
		otherservicesbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		otherservicesbtn.setBackground(new Color(0, 102, 255));
		otherservicesbtn.setBounds(606, 484, 121, 27);
		contentPane.add(otherservicesbtn);
		
		JButton checkbalbtn = new JButton("CHECK BALANCE");
		checkbalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				availablebalance avlbal = new availablebalance();
				avlbal.setVisible(true);
			}
		});
		checkbalbtn.setForeground(Color.WHITE);
		checkbalbtn.setFont(new Font("Arial", Font.BOLD, 10));
		checkbalbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		checkbalbtn.setBackground(new Color(0, 102, 255));
		checkbalbtn.setBounds(340, 484, 121, 27);
		contentPane.add(checkbalbtn);
		
		JButton transactionhistorybtn = new JButton("TRANSACTION \r\nHISTORY");
		transactionhistorybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		transactionhistorybtn.setForeground(Color.WHITE);
		transactionhistorybtn.setFont(new Font("Arial", Font.BOLD, 10));
		transactionhistorybtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		transactionhistorybtn.setBackground(new Color(0, 102, 255));
		transactionhistorybtn.setBounds(871, 241, 162, 27);
		contentPane.add(transactionhistorybtn);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(255, 255, 255));
		panel_3_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_2.setBounds(848, 114, 200, 167);
		contentPane.add(panel_3_2);
		
		JButton withdrawbtn = new JButton("WITHDRAW");
		withdrawbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				withdraw withdrawPage = new withdraw();
				withdrawPage.setVisible(true);
			}
		});
		withdrawbtn.setForeground(Color.WHITE);
		withdrawbtn.setFont(new Font("Ariel", Font.BOLD, 10));
		withdrawbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		withdrawbtn.setBackground(new Color(0, 102, 255));
		withdrawbtn.setBounds(606, 241, 121, 27);
		contentPane.add(withdrawbtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(homepagezee.class.getResource("/images/wit.png")));
		lblNewLabel_1.setBounds(606, 115, 121, 115);
		contentPane.add(lblNewLabel_1);
		
		JButton depositbtn = new JButton("DEPOSIT");
		depositbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				deposit depositPage = new deposit();
				depositPage.setVisible(true);
			}
		});
		depositbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		depositbtn.setForeground(new Color(255, 255, 255));
		depositbtn.setBackground(new Color(0, 102, 255));
		depositbtn.setFont(new Font("Ariel", Font.BOLD, 10));
		depositbtn.setBounds(340, 241, 121, 27);
		contentPane.add(depositbtn);
		btnNewButton.setBounds(1015, 31, 54, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(homepagezee.class.getResource("/images/small logo2.png")));
		lblNewLabel.setBounds(10, 0, 121, 47);
		contentPane.add(lblNewLabel);
		
		JButton topbar = new JButton("Welcome, "+nameField);
		topbar.setHorizontalAlignment(SwingConstants.RIGHT);
		topbar.setBorder(null);
		topbar.setForeground(new Color(0, 0, 128));
		topbar.setBackground(new Color(255, 255, 255));
		topbar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		topbar.setBounds(759, 0, 310, 31);
		contentPane.add(topbar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1079, 59);
		contentPane.add(panel);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_1.setBackground(new Color(255, 255, 255));
		panel_3_1.setBounds(575, 115, 200, 167);
		contentPane.add(panel_3_1);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(new Color(255, 255, 255));
		panel_3_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_3.setBounds(306, 359, 200, 167);
		contentPane.add(panel_3_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_4.setBackground(new Color(255, 255, 255));
		panel_3_4.setBounds(575, 359, 200, 167);
		contentPane.add(panel_3_4);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBackground(new Color(255, 255, 255));
		panel_3_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_5.setBounds(848, 359, 200, 167);
		contentPane.add(panel_3_5);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(homepagezee.class.getResource("/images/deposit (1).png")));
		lblNewLabel_2.setBounds(340, 125, 121, 105);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(51, 0, 204), null));
		panel_3.setBounds(306, 115, 200, 167);
		contentPane.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(0, 87, 232, 481);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(homepagezee.class.getResource("/images/3967030.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1079, 568);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(740, 263, 121, 115);
		contentPane.add(lblNewLabel_1_1);
	}
}
