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


public class availablebalance extends JFrame {

	private JPanel contentPane;
	private JLabel labell_2;
	private JTextField text_2;
	private JTextField text1;
	private JTextField text;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					availablebalance frame = new availablebalance();
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
	
	public static String balance;
	public static ResultSet rs;

	/**
	 * Create the frame.
	 */
	public availablebalance() {
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
		
		JButton btnNewButton_5_1 = new JButton("AVAILABLE BALANCE");
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(317, 103, 103, 23);
		contentPane.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(306, 103, 16, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton dashboardfi = new JButton("DASHBOARD");
		dashboardfi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		dashboardfi.setFont(new Font("Arial", Font.PLAIN, 9));
		dashboardfi.setBorder(null);
		dashboardfi.setBackground(new Color(30, 144, 255));
		dashboardfi.setBounds(242, 103, 65, 23);
		contentPane.add(dashboardfi);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(285, 155, 746, 366);
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
		
		JLabel lblNewLabel_1 = new JLabel("AVAILABLE BALANCE IN YOUR ACCOUNT :");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(21, 83, 365, 31);
		panel_3.add(lblNewLabel_1);
		
		Connection con = null;
		try {
			con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
			if(con!=null) {
				System.out.println("Connected");
				PreparedStatement st = con.prepareStatement("Select * from accountholder where accountnumber="+accountField);
				rs = st.executeQuery();
				System.out.println(rs);
				while(rs.next()) {
					balance = rs.getString(6);
					System.out.println(balance);
				} 
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel checkfi = new JLabel(balance);
		checkfi.setOpaque(true);
		checkfi.setHorizontalAlignment(SwingConstants.CENTER);
		checkfi.setForeground(Color.BLACK);
		checkfi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		checkfi.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		checkfi.setBackground(Color.WHITE);
		checkfi.setBounds(255, 155, 220, 31);
		panel_3.add(checkfi);
		
		JButton switchfi = new JButton("Switch Account");
		switchfi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Please enter account credentials"); 
			}
		});
		switchfi.setBounds(96, 526, 121, 31);
		contentPane.add(switchfi);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 442, 207, 31);
		contentPane.add(mobfi);
		
		textField = new JTextField();
		textField.setText("Mobile Number");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(10, 400, 207, 31);
		contentPane.add(textField);
		
		text = new JTextField();
		text.setBorder(null);
		text.setForeground(Color.WHITE);
		text.setBackground(new Color(0, 0, 128));
		text.setFont(new Font("Tahoma", Font.BOLD, 17));
		text.setText("Email Address");
		text.setBounds(10, 293, 207, 31);
		contentPane.add(text);
		text.setColumns(10);
		
		text1 = new JTextField();
		text1.setBorder(null);
		text1.setForeground(Color.WHITE);
		text1.setBackground(new Color(0, 0, 128));
		text1.setFont(new Font("Tahoma", Font.BOLD, 17));
		text1.setText("Account Number");
		text1.setBounds(10, 194, 207, 31);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setBorder(null);
		text_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		text_2.setBackground(new Color(0, 0, 128));
		text_2.setForeground(new Color(255, 255, 255));
		text_2.setText("Username");
		text_2.setBounds(10, 103, 207, 31);
		contentPane.add(text_2);
		text_2.setColumns(10);
		
		JLabel accfi = new JLabel(accountField);
		accfi.setOpaque(true);
		accfi.setForeground(new Color(0, 0, 0));
		accfi.setBackground(Color.WHITE);
		accfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		accfi.setBounds(10, 236, 207, 32);
		contentPane.add(accfi);
		
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
		
		JButton topbar = new JButton("Welcome, "+nameField);
		topbar.setBorder(null);
		topbar.setForeground(new Color(0, 0, 128));
		topbar.setBackground(new Color(255, 255, 255));
		topbar.setHorizontalAlignment(SwingConstants.RIGHT);
		topbar.setBounds(759, 0, 320, 25);
		contentPane.add(topbar);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(0, 87, 232, 481);
		contentPane.add(panel_2);
		
		JButton button_2 = new JButton("logout");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				loginzee loginPage = new loginzee();
				loginPage.setVisible(true);
				JFrame f=new JFrame();  
			    JOptionPane.showMessageDialog(f,"Logged Out Successfully");
			}
		});
		button_2.setBounds(1017, 28, 54, 19);
		contentPane.add(button_2);
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(availablebalance.class.getResource("/images/small logo2.png")));
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
		
		labell_2 = new JLabel("");
		labell_2.setBounds(227, 87, 852,481);
		labell_2.setIcon(new ImageIcon(availablebalance.class.getResource("/images/3967030.jpg")));
		contentPane.add(labell_2);
	}
}