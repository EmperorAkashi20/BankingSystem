package preLoginScreen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import postLogin.PostLoginPage;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.JFormattedTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class ykLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ykLogin frame = new ykLogin();
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
	public ykLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BckGrnd = new JPanel();
		BckGrnd.setBackground(Color.WHITE);
		BckGrnd.setBounds(0, 0, 780, 580);
		contentPane.add(BckGrnd);
		BckGrnd.setLayout(null);
		ImageIcon icon =new ImageIcon(this.getClass().getResource("/aaa.jpg"));
		
		JButton button2 = new JButton("SIGN UP");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			loginpagezee preLoginScreen = new loginpagezee();
				preLoginScreen.setVisible(true);
			}
		});
		JLabel label4 = new JLabel("(Enter Your Password)");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.LIGHT_GRAY);
		label4.setFont(new Font("Comic Sans MS", Font.BOLD, 9));
		label4.setBounds(455, 365, 202, 14);
		BckGrnd.add(label4);
		
		JLabel label3 = new JLabel("(Enter Your Name)");
		label3.setForeground(Color.LIGHT_GRAY);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Comic Sans MS", Font.BOLD, 9));
		label3.setBounds(455, 268, 202, 14);
		BckGrnd.add(label3);
		
		JButton button3 = new JButton("Login");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PostLoginPage postLogin = new PostLoginPage();
				postLogin.setVisible(true);
			}
		});
		button3.setForeground(Color.BLACK);
		button3.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		button3.setBackground(new Color(255, 255, 255));
		button3.setBounds(568, 390, 89, 23);
		BckGrnd.add(button3);
		
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pwdPassword.setBackground(new Color(204, 255, 255));
		pwdPassword.setBounds(455, 327, 202, 32);
		BckGrnd.add(pwdPassword);
		
		JLabel label2 = new JLabel("Password");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Lucida Handwriting", Font.BOLD, 15));
		label2.setBorder(null);
		label2.setBackground(Color.WHITE);
		label2.setAlignmentX(0.5f);
		label2.setBounds(455, 293, 202, 23);
		BckGrnd.add(label2);
		
		JFormattedTextField textfld1 = new JFormattedTextField();
		textfld1.setToolTipText("Enter Your User Name\r\n");
		textfld1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textfld1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textfld1.setBackground(new Color(204, 255, 255));
		textfld1.setBounds(455, 235, 202, 32);
		BckGrnd.add(textfld1);
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button2.setBackground(Color.WHITE);
		button2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		button2.setBounds(568, 154, 89, 23);
		BckGrnd.add(button2);
		
		JButton button1 = new JButton("LOGIN");
		button1.setForeground(Color.BLUE);
		button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, new Color(0, 0, 0), Color.BLACK));
		button1.setBackground(Color.WHITE);
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button1.setSelected(true);
		button1.setBounds(455, 154, 89, 23);
		BckGrnd.add(button1);
		
		JLabel label1 = new JLabel("User Name");
		label1.setBorder(null);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Lucida Handwriting", Font.BOLD, 15));
		label1.setAlignmentX(Component.CENTER_ALIGNMENT);
		label1.setBackground(Color.GRAY);
		label1.setForeground(Color.WHITE);
		label1.setBounds(455, 201, 202, 23);
		BckGrnd.add(label1);
		
		JLabel bg = new JLabel("");
		bg.setBackground(Color.WHITE);
		bg.setMaximumSize(new Dimension(780, 580));
		bg.setHorizontalAlignment(SwingConstants.LEFT);
		bg.setLabelFor(bg);
		bg.setBounds(0, -33, 868, 644);
		bg.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\BankingSystem\\pics\\bg login 3.jpg"));
		BckGrnd.add(bg);
	}

	protected loginpagezee loginpagezee() {
		// TODO Auto-generated method stub
		return null;
	}
}
