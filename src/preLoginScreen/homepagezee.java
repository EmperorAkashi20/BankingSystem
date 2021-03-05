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

public class homepagezee extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;

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
		
		JButton btnNewButton_2_5 = new JButton("DEPOSIT");
		btnNewButton_2_5.setForeground(Color.WHITE);
		btnNewButton_2_5.setFont(new Font("Segoe Print", Font.BOLD, 10));
		btnNewButton_2_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_5.setBackground(new Color(0, 102, 255));
		btnNewButton_2_5.setBounds(896, 475, 89, 27);
		contentPane.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_4 = new JButton("DEPOSIT");
		btnNewButton_2_4.setForeground(Color.WHITE);
		btnNewButton_2_4.setFont(new Font("Segoe Print", Font.BOLD, 10));
		btnNewButton_2_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_4.setBackground(new Color(0, 102, 255));
		btnNewButton_2_4.setBounds(622, 475, 89, 27);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_3 = new JButton("DEPOSIT");
		btnNewButton_2_3.setForeground(Color.WHITE);
		btnNewButton_2_3.setFont(new Font("Segoe Print", Font.BOLD, 10));
		btnNewButton_2_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_3.setBackground(new Color(0, 102, 255));
		btnNewButton_2_3.setBounds(362, 473, 89, 27);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_2 = new JButton("DEPOSIT");
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Segoe Print", Font.BOLD, 10));
		btnNewButton_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_2.setBackground(new Color(0, 102, 255));
		btnNewButton_2_2.setBounds(896, 241, 89, 27);
		contentPane.add(btnNewButton_2_2);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(255, 255, 255));
		panel_3_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3_2.setBounds(848, 114, 200, 167);
		contentPane.add(panel_3_2);
		
		JButton btnNewButton_2_1 = new JButton("DEPOSIT");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Segoe Print", Font.BOLD, 10));
		btnNewButton_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_1.setBackground(new Color(0, 102, 255));
		btnNewButton_2_1.setBounds(622, 241, 89, 27);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\wit.png"));
		lblNewLabel_1.setBounds(606, 115, 121, 115);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("DEPOSIT");
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 102, 255));
		btnNewButton_2.setFont(new Font("Segoe Print", Font.BOLD, 10));
		btnNewButton_2.setBounds(362, 241, 89, 27);
		contentPane.add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(10, 288, 217, 227);
		contentPane.add(textField_3);
		btnNewButton.setBounds(1015, 31, 54, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\small logo2.png"));
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 61, 1079, 31);
		contentPane.add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_1.setBounds(10, 114, 217, 47);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 172, 217, 47);
		contentPane.add(textField_2);
		
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
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField.setBounds(10, 230, 217, 47);
		contentPane.add(textField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 255));
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(0, 92, 230, 434);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\deposit (1).png"));
		lblNewLabel_2.setBounds(340, 125, 121, 105);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(51, 0, 204), null));
		panel_3.setBounds(306, 115, 200, 167);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\blurred-abstract-background-interior-view-looking-out-toward-empty-office-lobby-entrance-doors-glass-curtain-wall-with-frame.jpg"));
		lblNewLabel_3.setBounds(0, 11, 1079, 557);
		contentPane.add(lblNewLabel_3);
	}
}
