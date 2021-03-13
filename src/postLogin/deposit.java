package postLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;

public class deposit extends JFrame {

	private JPanel contentPane;
	private JTextField text_2;
	private JTextField text1;
	private JTextField text;
	private JTextField txt;
	private JTextField text2;
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

	/**
	 * Create the frame.
	 */
	public deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1095, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JLabel lblWorkzeenatgmailcom = new JLabel("work.zeenat@gmail.com");
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
		btnNewButton_3.setBounds(96, 526, 121, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("09330946879");
		lblNewLabel_5_1_2.setOpaque(true);
		lblNewLabel_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_2.setBackground(Color.WHITE);
		lblNewLabel_5_1_2.setBounds(10, 441, 207, 31);
		contentPane.add(lblNewLabel_5_1_2);
		
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
		
		text2 = new JTextField();
		text2.setBounds(275, 48, 213, 31);
		panel_3.add(text2);
		text2.setColumns(10);
		
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
		radio1.setBounds(160, 159, 239, 38);
		panel_3.add(radio1);
		radio1.setOpaque(false);
		radio1.setBackground(new Color(204, 255, 255));
		radio1.setFont(new Font("Arial", Font.BOLD, 18));
		
		JRadioButton radio2 = new JRadioButton("UPI");
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
		
		JLabel Label_3 = new JLabel("89283983748925656784");
		Label_3.setBounds(10, 236, 207, 32);
		Label_3.setOpaque(true);
		Label_3.setForeground(new Color(0, 0, 0));
		Label_3.setBackground(Color.WHITE);
		Label_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(Label_3);
		
		JLabel label_2 = new JLabel("Zeenat_Siddique");
		label_2.setBounds(10, 145, 207, 31);
		label_2.setOpaque(true);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_2.setBackground(new Color(255, 255, 255));
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("work.zeenat@gmail.com");
		label_1.setBounds(10, 335, 207, 31);
		label_1.setOpaque(true);
		label_1.setForeground(Color.BLACK);
		label_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_1.setBackground(new Color(255, 255, 255));
		contentPane.add(label_1);
		
		JButton button = new JButton("Welcome, Zeenat Taj Siddique");
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
		button_2.setBounds(1016, 30, 53, 19);
		contentPane.add(button_2);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JLabel logo = new JLabel("");
		logo.setBounds(10, 0, 121, 47);
		logo.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\small logo2.png"));
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\BankingSystem\\images\\3967030.jpg"));
		lblNewLabel.setBounds(0, 0, 1079, 568);
		contentPane.add(lblNewLabel);
	}
}