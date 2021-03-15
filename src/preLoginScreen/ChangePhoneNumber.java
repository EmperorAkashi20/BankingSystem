package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;

public class ChangePhoneNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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
		
		JLabel lblNewLabel_5_1 = new JLabel("Zeenat_Siddique");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(10, 138, 209, 31);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("892839837489253656784");
		lblNewLabel_5_1_1.setOpaque(true);
		lblNewLabel_5_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(10, 229, 209, 31);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("09330946879");
		lblNewLabel_5_1_2.setOpaque(true);
		lblNewLabel_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_2.setBackground(Color.WHITE);
		lblNewLabel_5_1_2.setBounds(10, 428, 209, 31);
		contentPane.add(lblNewLabel_5_1_2);
		
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
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5_1.setBorder(null);
		btnNewButton_5_1.setBackground(new Color(30, 144, 255));
		btnNewButton_5_1.setBounds(315, 100, 65, 23);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5 = new JButton("DASHBOARD");
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 9));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(30, 144, 255));
		btnNewButton_5.setBounds(240, 100, 65, 23);
		contentPane.add(btnNewButton_5);
		
		JButton button_2 = new JButton("logout");
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBounds(1007, 29, 53, 18);
		contentPane.add(button_2);
		
		JButton button = new JButton("Welcome, Zeenat Taj Siddique");
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
		
		JButton btnNewButton_4 = new JButton("back");
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
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(45, 98, 319, 37);
		panel_3.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField_1.setBounds(45, 182, 319, 37);
		panel_3.add(passwordField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Your Current Phone Number");
		lblNewLabel_1_1_1.setBounds(45, 71, 243, 28);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("New Phone Number");
		lblNewLabel_1_1_2.setBounds(45, 156, 111, 28);
		panel_3.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Done");
		lblNewLabel_1_1_4.setOpaque(true);
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1_4.setBounds(45, 251, 319, 33);
		panel_3.add(lblNewLabel_1_1_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(0, 58, 1079, 31);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("work.zeenat@gmail.com");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 331, 209, 31);
		contentPane.add(lblNewLabel_5);
		
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
