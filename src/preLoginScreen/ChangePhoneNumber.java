package preLoginScreen;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ChangePhoneNumber extends JFrame {

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
					ChangePhoneNumber frame = new ChangePhoneNumber();
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
	private JTextField phonefield1;
	private JTextField phonefield2;
	public static String oldPhone;
	public static String newPhone;
	public static String currentPhone;
	
	/**
	 * Create the frame.
	 */
	public ChangePhoneNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 607);
		contentPane = new JPanel();
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
		btnNewButton_3.setBounds(84, 528, 135, 29);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setText("Mobile Number");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(0, 0, 128));
		textField.setBounds(10, 386, 209, 31);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Email Address");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(10, 289, 209, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Account Number");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setBounds(10, 187, 209, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Username");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(0, 0, 128));
		textField_3.setBounds(10, 100, 209, 31);
		contentPane.add(textField_3);
		
		JLabel namefi = new JLabel(nameField);
		namefi.setOpaque(true);
		namefi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		namefi.setBackground(Color.WHITE);
		namefi.setBounds(10, 138, 209, 31);
		contentPane.add(namefi);
		
		JLabel accountfi = new JLabel(accountField);
		accountfi.setOpaque(true);
		accountfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		accountfi.setBackground(Color.WHITE);
		accountfi.setBounds(10, 229, 209, 31);
		contentPane.add(accountfi);
		
		JLabel mobfi = new JLabel(phoneField);
		mobfi.setOpaque(true);
		mobfi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mobfi.setBackground(Color.WHITE);
		mobfi.setBounds(10, 428, 209, 31);
		contentPane.add(mobfi);
		
		JButton btnNewButton_5_1_1 = new JButton("CHANGE PHONE NUMBER");
		btnNewButton_5_1_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1_1.setBorder(null);
		btnNewButton_5_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1_1.setBounds(384, 100, 124, 23);
		contentPane.add(btnNewButton_5_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<");
		lblNewLabel_2_1.setBounds(374, 103, 15, 19);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_5_1 = new JButton("SETTINGS");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				settings settingsPage = new settings();
				settingsPage.setVisible(true);
			}
		});
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(315, 100, 65, 23);
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
		btnNewButton_5.setBounds(240, 100, 65, 23);
		contentPane.add(btnNewButton_5);
		
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
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBounds(1007, 29, 53, 18);
		contentPane.add(button_2);
		
		JButton button = new JButton("Welcome, "+nameField);
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(new Color(0, 0, 128));
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(759, 0, 301, 31);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ChangePhoneNumber.class.getResource("/images/small logo2.png")));
		lblNewLabel.setBounds(10, 11, 147, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(278, 164, 746, 366);
		contentPane.add(panel_3);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				homepagezee dashboard = new homepagezee();
				dashboard.setVisible(true);
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_4.setBackground(new Color(0, 0, 128));
		btnNewButton_4.setBounds(611, 280, 104, 33);
		panel_3.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("CHANGE PHONE NUMBER");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1_1.setBounds(253, 22, 198, 31);
		panel_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Your Current Phone Number");
		lblNewLabel_1_1_1.setBounds(45, 71, 243, 28);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("New Phone Number");
		lblNewLabel_1_1_2.setBounds(45, 156, 170, 28);
		panel_3.add(lblNewLabel_1_1_2);
		
		JButton btnChangeNumber = new JButton("CHANGE NUMBER");
		btnChangeNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oldPhone = phonefield1.getText();
				newPhone = phonefield2.getText();
				Connection con = null;
				if(oldPhone.isEmpty() || newPhone.isEmpty()) {
					System.out.println("No field can be empty");
				} else {
				try {
					con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDetails", "root", "\"NewPassword@2018\"");
					if(con!=null) {
						System.out.println("Connected");
						PreparedStatement rst = con.prepareStatement("select * from accountholder where accountnumber="+accountField);
						ResultSet rst1 = rst.executeQuery();
						while(rst1.next()) {
							System.out.println(rst1);
							currentPhone = rst1.getString(3);
						}
						System.out.println(currentPhone);
						if(oldPhone != currentPhone) {
							System.out.println("Same number");
							PreparedStatement st = con.prepareStatement("update accountholder set phonenumber=? where accountnumber="+accountField);
							st.setString(1, newPhone);
							st.execute();
							JFrame f=new JFrame();  
						    JOptionPane.showMessageDialog(f,"Phone Number successfully updated successfully"); 
						} else {
							System.out.println("Phone number doesnt match");
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
		});
		btnChangeNumber.setForeground(new Color(0, 0, 128));
		btnChangeNumber.setFont(new Font("Arial", Font.BOLD, 18));
		btnChangeNumber.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnChangeNumber.setBackground(new Color(0, 0, 128));
		btnChangeNumber.setBounds(45, 252, 170, 31);
		panel_3.add(btnChangeNumber);
		
		phonefield1 = new JTextField();
		phonefield1.setColumns(10);
		phonefield1.setBounds(45, 98, 319, 44);
		panel_3.add(phonefield1);
		
		phonefield2 = new JTextField();
		phonefield2.setToolTipText("");
		phonefield2.setColumns(10);
		phonefield2.setBounds(45, 183, 319, 44);
		panel_3.add(phonefield2);
		
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
		lblNewLabel_3.setIcon(new ImageIcon(ChangePhoneNumber.class.getResource("/images/3967030.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1069, 662);
		contentPane.add(lblNewLabel_3);
	}

}
