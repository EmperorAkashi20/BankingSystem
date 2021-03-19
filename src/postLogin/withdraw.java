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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class withdraw extends JFrame {

	private JPanel contentPane;
	private JLabel labell_2;
	private JTextField text_2;
	private JTextField text1;
	private JTextField text;
	private JTextField withdrawfi;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					withdraw frame = new withdraw();
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
	public static String withdrawamtfi;
	public static ResultSet rst1;
	public static long num,num2;
	public static String finalbalance;
	public static String transactionidw;
	public static LocalDateTime withdrawdate;

	/**
	 * Create the frame.
	 */
	public withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWorkzeenatgmailcom = new JLabel("work.zeenat@gmail.com");
		lblWorkzeenatgmailcom.setBackground(new Color(255, 255, 255));
		lblWorkzeenatgmailcom.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblWorkzeenatgmailcom.setBounds(10,335,207,31);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 432, 207, 31);
		contentPane.add(mobfi);
		
		textField_1 = new JTextField();
		textField_1.setText("Mobile Number");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(10, 390, 207, 31);
		contentPane.add(textField_1);
		
		JButton switchacntbtn = new JButton("Switch Account");
		switchacntbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Please enter account credentials"); 
			}
		});
		switchacntbtn.setBounds(96, 526, 121, 31);
		contentPane.add(switchacntbtn);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(308, 103, 16, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_5_1 = new JButton("WITHDRAW");
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(322, 103, 65, 23);
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
		btnNewButton_5.setBounds(241, 103, 65, 23);
		contentPane.add(btnNewButton_5);
		
		text1 = new JTextField();
		text1.setBorder(null);
		text1.setForeground(Color.WHITE);
		text1.setBackground(new Color(0, 0, 128));
		text1.setFont(new Font("Tahoma", Font.BOLD, 17));
		text1.setText("Account Number");
		text1.setBounds(10, 194, 207, 31);
		contentPane.add(text1);
		text1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(296, 145, 746, 366);
		contentPane.add(panel_3);
		
		JButton backbtn = new JButton("back");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		backbtn.setForeground(new Color(0, 0, 0));
		backbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backbtn.setBackground(new Color(0, 0, 128));
		backbtn.setBounds(611, 280, 104, 33);
		panel_3.add(backbtn);
		
		JLabel lab2 = new JLabel("Enter Your Amount :");
		lab2.setBounds(37, 90, 213, 31);
		panel_3.add(lab2);
		lab2.setFont(new Font("Arial", Font.BOLD, 20));
		
		withdrawfi = new JTextField();
		withdrawfi.setColumns(10);
		withdrawfi.setBounds(260, 90, 213, 31);
		panel_3.add(withdrawfi);
		
		JButton withdrawamt = new JButton("Withdraw");
		withdrawamt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawamtfi = withdrawfi.getText();
				num = Long.parseLong(withdrawamtfi);
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
						finalbalance = String.valueOf(num2-num);
						st.setString(1, finalbalance);
						st.execute();
						JFrame f=new JFrame();  
					    JOptionPane.showMessageDialog(f,"Successfully Withdrew INR "+withdrawamtfi+" Your updated balance is INR "+finalbalance);
					    PreparedStatement tr = con.prepareStatement("insert into transactiondetails(transactionid, accountnumber, typeoftransaction, dateoftransaction, transactionamount)"+"VALUES(?,?,?,?,?)");
					    Random rand = new Random();
						long drand = (long)((rand.nextDouble()*10000000000000L));
						transactionidw = Long.toString(drand);
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
						withdrawdate = LocalDateTime.now();  
						dtf.format(withdrawdate);
					    tr.setString(1, transactionidw);
					    tr.setString(2, accountField);
					    tr.setString(3, "DEBIT");
					    tr.setString(4, dtf.format(withdrawdate));
					    tr.setString(5, withdrawamtfi);
					    tr.execute();
					    System.out.println(tr);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		withdrawamt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		withdrawamt.setForeground(new Color(0, 0, 128));
		withdrawamt.setBackground(new Color(0, 0, 128));
		withdrawamt.setBounds(287, 155, 170, 31);
		panel_3.add(withdrawamt);
		withdrawamt.setFont(new Font("Arial", Font.BOLD, 18));
		
		text = new JTextField();
		text.setBorder(null);
		text.setForeground(Color.WHITE);
		text.setBackground(new Color(0, 0, 128));
		text.setFont(new Font("Tahoma", Font.BOLD, 17));
		text.setText("Email Address");
		text.setBounds(10, 293, 207, 31);
		contentPane.add(text);
		text.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setBorder(null);
		text_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		text_2.setBackground(new Color(0, 0, 128));
		text_2.setForeground(new Color(255, 255, 255));
		text_2.setText("Username");
		text_2.setBounds(10, 103, 207, 31);
		contentPane.add(text_2);
		text_2.setColumns(10);
		
		JLabel accountfi = new JLabel(accountField);
		accountfi.setOpaque(true);
		accountfi.setForeground(new Color(0, 0, 0));
		accountfi.setBackground(Color.WHITE);
		accountfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		accountfi.setBounds(10, 236, 207, 32);
		contentPane.add(accountfi);
		
		JLabel namefi = new JLabel(nameField);
		namefi.setOpaque(true);
		namefi.setForeground(new Color(0, 0, 0));
		namefi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		namefi.setBackground(new Color(255, 255, 255));
		namefi.setBounds(10, 145, 207, 31);
		contentPane.add(namefi);
		
		JLabel emailfi = new JLabel(emailField);
		emailfi.setOpaque(true);
		emailfi.setForeground(Color.BLACK);
		emailfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		emailfi.setBackground(new Color(255, 255, 255));
		emailfi.setBounds(10, 335, 207, 31);
		contentPane.add(emailfi);
		
		JButton toptab = new JButton("Welcome, "+nameField);
		toptab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toptab.setBorder(null);
		toptab.setForeground(new Color(0, 0, 128));
		toptab.setBackground(new Color(255, 255, 255));
		toptab.setHorizontalAlignment(SwingConstants.RIGHT);
		toptab.setBounds(759, 0, 310, 31);
		contentPane.add(toptab);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(0, 87, 232, 481);
		contentPane.add(panel_2);
		
		JButton logoutbtn = new JButton("logout");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginScreen = new loginzee();
				loginScreen.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Logged Out Successfully"); 
			}
		});
		logoutbtn.setBounds(1016, 30, 55, 24);
		contentPane.add(logoutbtn);
		logoutbtn.setForeground(new Color(0, 0, 128));
		logoutbtn.setBackground(new Color(0, 0, 128));
		logoutbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\small logo2.png"));
		logo.setBounds(10, 0, 121, 47);
		contentPane.add(logo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(0, 57, 1079, 31);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1079, 59);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		labell_2 = new JLabel("New label");
		labell_2.setBounds(0, 0, 1081,568);
		labell_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\3967030.jpg"));
		contentPane.add(labell_2);
	}
}