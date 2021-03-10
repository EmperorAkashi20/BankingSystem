package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
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
		btnNewButton_3.setBounds(93, 526, 127, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("09330946879");
		lblNewLabel_5_1_2.setOpaque(true);
		lblNewLabel_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_2.setBackground(Color.WHITE);
		lblNewLabel_5_1_2.setBounds(10, 441, 210, 31);
		contentPane.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("work.zeenat@gmail.com");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 331, 210, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("892839837489253656784");
		lblNewLabel_5_1_1.setOpaque(true);
		lblNewLabel_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(10, 232, 210, 32);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Zeenat_Siddique");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(10, 141, 210, 31);
		contentPane.add(lblNewLabel_5_1);
		
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
		textField.setBounds(10, 399, 210, 31);
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
		
		JButton btnNewButton = new JButton("logout");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(1015, 27, 54, 19);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Welcome, Zeenat Taj Siddique");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(759, 0, 310, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\small logo2.png"));
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
		
		JButton btnNewButton_2_1_1 = new JButton("CHANGE PHONE NUMBER");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_2_1_1.setForeground(Color.BLACK);
		btnNewButton_2_1_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2_1_1.setBorder(null);
		btnNewButton_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1.setBounds(24, 241, 205, 19);
		panel_3.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1 = new JButton("ADD ACCOUNT");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(24, 169, 205, 19);
		panel_3.add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("CHANGE PASSWORD");
		btnNewButton_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(24, 96, 205, 24);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(24, 96, 467, 43);
		panel_3.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(24, 164, 467, 43);
		panel_3.add(panel_4_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBounds(24, 233, 467, 43);
		panel_3.add(panel_4_2);
		
		JButton btnNewButton_4 = new JButton("back");
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_4.setBackground(new Color(0, 0, 128));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(611, 280, 104, 33);
		panel_3.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("SETTINGS");
		lblNewLabel_1.setBounds(253, 22, 198, 31);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(0, 0, 128));
		
		JButton btnNewButton_5 = new JButton("DASHBOARD");
		btnNewButton_5.setBackground(new Color(30, 144, 255));
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBounds(243, 99, 65, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("SETTINGS");
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(318, 99, 65, 23);
		contentPane.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_2 = new JLabel("<");
		lblNewLabel_2.setBounds(310, 99, 16, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\3967030.jpg"));
		lblNewLabel_3.setBounds(0, -32, 1079, 600);
		contentPane.add(lblNewLabel_3);
	}
}
