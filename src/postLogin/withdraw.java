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

public class withdraw extends JFrame {

	private JPanel contentPane;
	private JLabel labell_2;
	private JTextField text_2;
	private JTextField text1;
	private JTextField text;
	private JTextField textField;
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
		
		JLabel lblNewLabel_5_1_2 = new JLabel("09330946879");
		lblNewLabel_5_1_2.setOpaque(true);
		lblNewLabel_5_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_5_1_2.setBackground(Color.WHITE);
		lblNewLabel_5_1_2.setBounds(10, 432, 207, 31);
		contentPane.add(lblNewLabel_5_1_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Mobile Number");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(0, 0, 128));
		textField_1.setBounds(10, 390, 207, 31);
		contentPane.add(textField_1);
		
		JButton btnNewButton_3 = new JButton("Switch Account");
		btnNewButton_3.setBounds(96, 526, 121, 31);
		contentPane.add(btnNewButton_3);
		
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
		
		JButton btnNewButton_4 = new JButton("back");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_4.setBackground(new Color(0, 0, 128));
		btnNewButton_4.setBounds(611, 280, 104, 33);
		panel_3.add(btnNewButton_4);
		
		JLabel lab2 = new JLabel("Enter Your Amount :");
		lab2.setBounds(37, 90, 213, 31);
		panel_3.add(lab2);
		lab2.setFont(new Font("Arial", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(260, 90, 213, 31);
		panel_3.add(textField);
		
		JButton buuuuttttt = new JButton("Withdraw");
		buuuuttttt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buuuuttttt.setForeground(new Color(255, 255, 255));
		buuuuttttt.setBackground(new Color(0, 0, 128));
		buuuuttttt.setBounds(287, 155, 170, 31);
		panel_3.add(buuuuttttt);
		buuuuttttt.setFont(new Font("Arial", Font.BOLD, 18));
		
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
		
		JLabel Label_3 = new JLabel("89283983748925656784");
		Label_3.setOpaque(true);
		Label_3.setForeground(new Color(0, 0, 0));
		Label_3.setBackground(Color.WHITE);
		Label_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Label_3.setBounds(10, 236, 207, 32);
		contentPane.add(Label_3);
		
		JLabel label_2 = new JLabel("Zeenat_Siddique");
		label_2.setOpaque(true);
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_2.setBackground(new Color(255, 255, 255));
		label_2.setBounds(10, 145, 207, 31);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("work.zeenat@gmail.com");
		label_1.setOpaque(true);
		label_1.setForeground(Color.BLACK);
		label_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setBounds(10, 335, 207, 31);
		contentPane.add(label_1);
		
		JButton button = new JButton("Welcome, Zeenat Taj Siddique");
		button.setBorder(null);
		button.setForeground(new Color(0, 0, 128));
		button.setBackground(new Color(255, 255, 255));
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setBounds(759, 0, 310, 31);
		contentPane.add(button);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(0, 87, 232, 481);
		contentPane.add(panel_2);
		
		JButton button_2 = new JButton("logout");
		button_2.setBounds(1016, 30, 55, 24);
		contentPane.add(button_2);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
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