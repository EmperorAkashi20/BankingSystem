package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class settings extends JFrame {

	private JPanel contentPane;
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
					settings frame = new settings();
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
	public settings() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\small logo2.png"));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton_3.setBounds(93, 526, 127, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 434, 210, 31);
		contentPane.add(mobfi);
		
		JLabel emailfi = new JLabel(emailField);
		emailfi.setOpaque(true);
		emailfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		emailfi.setBackground(Color.WHITE);
		emailfi.setBounds(10, 331, 210, 31);
		contentPane.add(emailfi);
		
		JLabel acntfi = new JLabel(accountField);
		acntfi.setOpaque(true);
		acntfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		acntfi.setBackground(Color.WHITE);
		acntfi.setBounds(10, 232, 210, 32);
		contentPane.add(acntfi);
		
		JLabel namefi = new JLabel(nameField);
		namefi.setOpaque(true);
		namefi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		namefi.setBackground(Color.WHITE);
		namefi.setBounds(10, 141, 210, 31);
		contentPane.add(namefi);
		
		textField_1 = new JTextField();
		textField_1.setText("Email Address");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(10, 289, 210, 31);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setText("Mobile Number");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(10, 391, 210, 31);
		contentPane.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setText("Account Number");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setBounds(10, 190, 210, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Username");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(0, 0, 128));
		textField_3.setBounds(10, 99, 210, 31);
		contentPane.add(textField_3);
		
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
		logoutbtn.setForeground(new Color(0, 0, 128));
		logoutbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		logoutbtn.setBackground(new Color(0, 0, 128));
		logoutbtn.setBounds(1015, 31, 54, 19);
		contentPane.add(logoutbtn);
		
		JButton topbar = new JButton("Welcome, "+nameField);
		topbar.setHorizontalAlignment(SwingConstants.RIGHT);
		topbar.setForeground(new Color(0, 0, 128));
		topbar.setBorder(null);
		topbar.setBackground(Color.WHITE);
		topbar.setBounds(759, 0, 310, 31);
		contentPane.add(topbar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(settings.class.getResource("/images/small logo2.png")));
		lblNewLabel.setBounds(10, 0, 107, 53);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1079, 59);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(0, 57, 1079, 31);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(0, 87, 232, 481);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(283, 155, 746, 366);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(24, 96, 467, 43);
		panel_3.add(panel_4);
		
		JButton changepswdbtn = new JButton("CHANGE PASSWORD");
		panel_4.add(changepswdbtn);
		changepswdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Changepassword changepswd = new Changepassword();
				changepswd.setVisible(true);
			}
		});
		changepswdbtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		changepswdbtn.setForeground(new Color(0, 0, 0));
		changepswdbtn.setFont(new Font("Arial", Font.BOLD, 10));
		changepswdbtn.setBorder(null);
		changepswdbtn.setBackground(new Color(255, 255, 255));
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBounds(24, 166, 467, 43);
		panel_3.add(panel_4_2);
		
		JButton changephonebtn = new JButton("CHANGE PHONE NUMBER");
		panel_4_2.add(changephonebtn);
		changephonebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ChangePhoneNumber changenumber = new ChangePhoneNumber();
				changenumber.setVisible(true);
			}
		});
		changephonebtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		changephonebtn.setForeground(Color.BLACK);
		changephonebtn.setFont(new Font("Arial", Font.BOLD, 10));
		changephonebtn.setBorder(null);
		changephonebtn.setBackground(Color.WHITE);
		
		JButton backbtn = new JButton("back");
		backbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backbtn.setBackground(new Color(0, 0, 128));
		backbtn.setForeground(new Color(0, 0, 0));
		backbtn.setBounds(611, 280, 104, 33);
		panel_3.add(backbtn);
		
		JLabel lblNewLabel_1 = new JLabel("SETTINGS");
		lblNewLabel_1.setBounds(253, 22, 198, 31);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(0, 0, 128));
		
		JButton dashboardbtn = new JButton("DASHBOARD");
		dashboardbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		dashboardbtn.setBackground(new Color(30, 144, 255));
		dashboardbtn.setFont(new Font("Arial", Font.PLAIN, 9));
		dashboardbtn.setBorder(null);
		dashboardbtn.setBounds(243, 99, 65, 23);
		contentPane.add(dashboardbtn);
		
		JButton btnNewButton_5_1 = new JButton("SETTINGS");
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(320, 99, 65, 23);
		contentPane.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(310, 99, 16, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(settings.class.getResource("/images/3967030.jpg")));
		lblNewLabel_3.setBounds(0, -32, 1079, 600);
		contentPane.add(lblNewLabel_3);
	}
}
