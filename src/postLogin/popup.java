package postLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
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
import javax.swing.AbstractAction;
import javax.swing.Action;

public class popup extends JFrame {

	private JPanel contentPane;
	private JTextField text_2;
	private JTextField text1;
	private JTextField text;
	private JTextField txt;
	private JTextField txti;
	private final Action action = new SwingAction();

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
	public popup() {
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
		
		JRadioButton radio1 = new JRadioButton("Credit/Debit Card");
		radio1.setBounds(386, 340, 213, 47);
		radio1.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		contentPane.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("UPI");
		radio2.setBounds(675, 340, 178, 47);
		radio2.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		radio2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(radio2);
		
		
	
		
			
		txti = new JTextField();
		txti.setBounds(512, 127, 273, 67);
		txti.setBorder(null);
		txti.setOpaque(false);
		txti.setHorizontalAlignment(SwingConstants.CENTER);
		txti.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		txti.setText("Deposit Page");
		contentPane.add(txti);
		txti.setColumns(10);
		
		txt = new JTextField();
		txt.setBounds(327, 243, 197, 47);
		txt.setHorizontalAlignment(SwingConstants.LEFT);
		txt.setBorder(null);
		txt.setOpaque(false);
		txt.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		txt.setText("Choose the way -");
		contentPane.add(txt);
		txt.setColumns(10);
		
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
		button_2.setBounds(958, 30, 113, 29);
		contentPane.add(button_2);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBackground(new Color(0, 0, 128));
		button_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(10, 0, 121, 47);
		logo.setIcon(new ImageIcon("C:\\Users\\Rahul\\Downloads\\small logo2.png"));
		contentPane.add(logo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 57, 1079, 31);
		panel_1.setBackground(new Color(0, 0, 139));
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 0, 1079, 59);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rahul\\Desktop\\3967030.jpg"));
		lblNewLabel.setBounds(100, 90, 979, 478);
		contentPane.add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}