package postLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import preLoginScreen.homepagezee;
import preLoginScreen.loginzee;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class TranactionDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JRadioButton alltransbtn;
	private JRadioButton depositbtn;
	private JRadioButton withdrawbtn;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TranactionDetails frame = new TranactionDetails();
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
	public TranactionDetails() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton toptab = new JButton("Welcome, "+nameField);
		toptab.setHorizontalAlignment(SwingConstants.RIGHT);
		toptab.setForeground(new Color(0, 0, 128));
		toptab.setBorder(null);
		toptab.setBackground(Color.WHITE);
		toptab.setBounds(779, 6, 310, 31);
		contentPane.add(toptab);
		
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
		logoutbtn.setForeground(new Color(0, 0, 128));
		logoutbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		logoutbtn.setBackground(new Color(0, 0, 128));
		logoutbtn.setBounds(1034, 32, 55, 24);
		contentPane.add(logoutbtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(6, 62, 1089, 31);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(6, 92, 232, 481);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(6, 25, 207, 31);
		panel_2.add(textField);
		
		JLabel namefi = new JLabel(nameField);
		namefi.setOpaque(true);
		namefi.setForeground(Color.BLACK);
		namefi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		namefi.setBackground(Color.WHITE);
		namefi.setBounds(6, 67, 207, 31);
		panel_2.add(namefi);
		
		textField_1 = new JTextField();
		textField_1.setText("Account Number");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(6, 116, 207, 31);
		panel_2.add(textField_1);
		
		JLabel accountfi = new JLabel(accountField);
		accountfi.setOpaque(true);
		accountfi.setForeground(Color.BLACK);
		accountfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		accountfi.setBackground(Color.WHITE);
		accountfi.setBounds(6, 158, 207, 32);
		panel_2.add(accountfi);
		
		textField_2 = new JTextField();
		textField_2.setText("Email Address");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setBounds(6, 215, 207, 31);
		panel_2.add(textField_2);
		
		JLabel emailfi = new JLabel(emailField);
		emailfi.setOpaque(true);
		emailfi.setForeground(Color.BLACK);
		emailfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		emailfi.setBackground(Color.WHITE);
		emailfi.setBounds(6, 257, 207, 31);
		panel_2.add(emailfi);
		
		textField_3 = new JTextField();
		textField_3.setText("Mobile Number");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(0, 0, 128));
		textField_3.setBounds(6, 312, 207, 31);
		panel_2.add(textField_3);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(6, 354, 207, 31);
		panel_2.add(mobfi);
		
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
		switchacntbtn.setBounds(105, 444, 121, 31);
		panel_2.add(switchacntbtn);
		
		JButton dashboardbtn = new JButton("DASHBOARD");
		dashboardbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		dashboardbtn.setFont(new Font("Arial", Font.PLAIN, 9));
		dashboardbtn.setBorder(null);
		dashboardbtn.setBackground(new Color(30, 144, 255));
		dashboardbtn.setBounds(250, 105, 65, 23);
		contentPane.add(dashboardbtn);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(317, 105, 16, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_5_1 = new JButton("TRANSACTION HISTORY");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(331, 105, 104, 23);
		contentPane.add(btnNewButton_5_1);
		
		JButton backbtn = new JButton("back");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backbtn.setBackground(new Color(0, 0, 128));
		backbtn.setBounds(985, 540, 104, 33);
		contentPane.add(backbtn);
		
		alltransbtn = new JRadioButton("All Transactions");
		alltransbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdrawbtn.setSelected(false);
				depositbtn.setSelected(false);
				showdata();
			}
		});
		alltransbtn.setBounds(307, 184, 141, 23);
		contentPane.add(alltransbtn);
		
		withdrawbtn = new JRadioButton("Withdrawals");
		withdrawbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				depositbtn.setSelected(false);
				alltransbtn.setSelected(false);
				showwithdrawdata();
			}
		});
		withdrawbtn.setHorizontalAlignment(SwingConstants.TRAILING);
		withdrawbtn.setBounds(840, 184, 141, 23);
		contentPane.add(withdrawbtn);
		
		depositbtn = new JRadioButton("Deposits");
		depositbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alltransbtn.setSelected(false);
				withdrawbtn.setSelected(false);
				showdepositdata();
			}
		});
		depositbtn.setHorizontalAlignment(SwingConstants.CENTER);
		depositbtn.setBounds(563, 184, 141, 23);
		contentPane.add(depositbtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(317, 231, 665, 279);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	public JRadioButton getAlltransbtn() {
		return alltransbtn;
	}
	public JRadioButton getDepositbtn() {
		return depositbtn;
	}
	public JRadioButton getWithdrawbtn() {
		return withdrawbtn;
	}
	private void showdata() {
		try {
			Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
			if(con!=null) {
				System.out.println("Connected");
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Transaction ID");
				model.addColumn("Transaction Type");
				model.addColumn("Transaction Date");
				model.addColumn("Transaction Amount");
				String qr = "SELECT * from transactiondetails where accountnumber=? order by dateoftransaction";
				PreparedStatement st = con.prepareStatement(qr);
				st.setString(1, accountField);
				ResultSet rs = st.executeQuery();
				while(rs.next()) {
					model.addRow(new Object[] {
							rs.getString("transactionid"),
							rs.getString("typeoftransaction"),
							rs.getDate("dateoftransaction"),
							rs.getString("transactionamount"),
					});
				}
				rs.close();
				st.close();
				table.setModel(model);
				table.setAutoResizeMode(1);
				table.getColumnModel().getColumn(0).setPreferredWidth(100);
				table.getColumnModel().getColumn(1).setPreferredWidth(100);
				table.getColumnModel().getColumn(2).setPreferredWidth(100);
				table.getColumnModel().getColumn(3).setPreferredWidth(100);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	private void showdepositdata() {
		try {
			Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
			if(con!=null) {
				System.out.println("Connected");
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Transaction ID");
				model.addColumn("Transaction Type");
				model.addColumn("Transaction Date");
				model.addColumn("Transaction Amount");
				String qr = "SELECT * from transactiondetails where typeoftransaction = \"Deposit\" and accountnumber=? order by dateoftransaction";
				PreparedStatement st = con.prepareStatement(qr);
				st.setString(1, accountField);
				ResultSet rs = st.executeQuery();
				while(rs.next()) {
					model.addRow(new Object[] {
							rs.getString("transactionid"),
							rs.getString("typeoftransaction"),
							rs.getDate("dateoftransaction"),
							rs.getString("transactionamount"),
					});
				}
				rs.close();
				st.close();
				table.setModel(model);
				table.setAutoResizeMode(1);
				table.getColumnModel().getColumn(0).setPreferredWidth(100);
				table.getColumnModel().getColumn(1).setPreferredWidth(100);
				table.getColumnModel().getColumn(2).setPreferredWidth(100);
				table.getColumnModel().getColumn(3).setPreferredWidth(100);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	private void showwithdrawdata() {
		try {
			Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
			if(con!=null) {
				System.out.println("Connected");
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Transaction ID");
				model.addColumn("Transaction Type");
				model.addColumn("Transaction Date");
				model.addColumn("Transaction Amount");
				String qr = "SELECT * from transactiondetails where typeoftransaction = \"Withdraw\" and accountnumber=? order by dateoftransaction";
				PreparedStatement st = con.prepareStatement(qr);
				st.setString(1, accountField);
				ResultSet rs = st.executeQuery();
				while(rs.next()) {
					model.addRow(new Object[] {
							rs.getString("transactionid"),
							rs.getString("typeoftransaction"),
							rs.getDate("dateoftransaction"),
							rs.getString("transactionamount"),
					});
				}
				rs.close();
				st.close();
				table.setModel(model);
				table.setAutoResizeMode(1);
				table.getColumnModel().getColumn(0).setPreferredWidth(100);
				table.getColumnModel().getColumn(1).setPreferredWidth(100);
				table.getColumnModel().getColumn(2).setPreferredWidth(100);
				table.getColumnModel().getColumn(3).setPreferredWidth(100);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
