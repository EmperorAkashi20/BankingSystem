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
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
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
			}
		});
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon(homepagezee.class.getResource("/images/pnghut_brand-web-crawler-logo-service-purple-compare-icon.png")));
		lblNewLabel_2_1_2.setBounds(606, 368, 121, 105);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("09330946879");
		lblNewLabel_5_1_2.setOpaque(true);
		lblNewLabel_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_2.setBackground(Color.WHITE);
		lblNewLabel_5_1_2.setBounds(10, 442, 207, 31);
		contentPane.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("892839837489253656784");
		lblNewLabel_5_1_1.setOpaque(true);
		lblNewLabel_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(10, 236, 207, 32);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Zeenat_Siddique");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(10, 145, 207, 31);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("work.zeenat@gmail.com");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 335, 207, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(homepagezee.class.getResource("/images/u.png")));
		lblNewLabel_2_1_1.setBounds(884, 368, 117, 105);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(homepagezee.class.getResource("/images/UPL.png")));
		lblNewLabel_2_1.setBounds(340, 368, 117, 105);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_3 = new JButton("Switch Account");
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
		
		JButton btnNewButton_2_5 = new JButton("SETTINGS");
		btnNewButton_2_5.setForeground(Color.WHITE);
		btnNewButton_2_5.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_5.setBackground(new Color(0, 102, 255));
		btnNewButton_2_5.setBounds(890, 484, 121, 27);
		contentPane.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_4 = new JButton("OTHER SERVICES");
		btnNewButton_2_4.setForeground(Color.WHITE);
		btnNewButton_2_4.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_4.setBackground(new Color(0, 102, 255));
		btnNewButton_2_4.setBounds(606, 484, 121, 27);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_3 = new JButton("CHECK BALANCE");
		btnNewButton_2_3.setForeground(Color.WHITE);
		btnNewButton_2_3.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_3.setBackground(new Color(0, 102, 255));
		btnNewButton_2_3.setBounds(340, 484, 121, 27);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_2 = new JButton("TRANSACTION \r\nHISTORY");
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_2.setBackground(new Color(0, 102, 255));
		btnNewButton_2_2.setBounds(871, 241, 162, 27);
		contentPane.add(btnNewButton_2_2);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(255, 255, 255));
		panel_3_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_2.setBounds(848, 114, 200, 167);
		contentPane.add(panel_3_2);
		
		JButton btnNewButton_2_1 = new JButton("WITHDRAW");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Ariel", Font.BOLD, 10));
		btnNewButton_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_1.setBackground(new Color(0, 102, 255));
		btnNewButton_2_1.setBounds(606, 241, 121, 27);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(homepagezee.class.getResource("/images/wit.png")));
		lblNewLabel_1.setBounds(606, 115, 121, 115);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("DEPOSIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 102, 255));
		btnNewButton_2.setFont(new Font("Ariel", Font.BOLD, 10));
		btnNewButton_2.setBounds(340, 241, 121, 27);
		contentPane.add(btnNewButton_2);
		btnNewButton.setBounds(1015, 31, 54, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(homepagezee.class.getResource("/images/small logo2.png")));
		lblNewLabel.setBounds(10, 0, 121, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Welcome, Zeenat Taj Siddique");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(759, 0, 310, 31);
		contentPane.add(btnNewButton_1);
		
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
