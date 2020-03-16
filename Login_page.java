import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Login_page extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JPanel panel;
	private JPanel panel_1;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page frame = new Login_page();
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

	public Login_page() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Pics\\folder.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 416);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setForeground(new Color(102, 51, 0));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(148, 153, 106, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setForeground(new Color(102, 51, 51));
		lblNewLabel.setFont(new Font("Microsoft JhengHei Light", Font.PLAIN, 15));
		lblNewLabel.setBounds(148, 100, 106, 21);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 127, 80));
		panel.setBorder(new LineBorder(new Color(64, 64, 64), 2, true));
		panel.setBounds(241, 90, 132, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 112, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 127, 80));
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		panel_1.setBounds(241, 143, 132, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBounds(10, 10, 112, 19);
		panel_1.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(102, 51, 0));
		comboBox.setBackground(new Color(255, 127, 80));
		comboBox.setBounds(263, 193, 87, 21);
		contentPane.add(comboBox);
		comboBox.setFont(new Font("MV Boli", Font.PLAIN, 10));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Cashier"}));
		
		btnNewButton = new JButton("Login ");
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		btnNewButton.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Log.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String value = (String)comboBox.getSelectedItem();
				String user = textField.getText();
				String pass =String.valueOf(passwordField.getPassword());
				
			    insertdataindb login= new insertdataindb();
			    login.login(user,pass,value);
			    
				dispose();
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
			    
			}
		});
		btnNewButton.setBounds(274, 308, 99, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Login As:");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(207, 193, 70, 21);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\cup-of-coffee-1280537_640.jpg"));
		lblNewLabel_3.setBounds(0, 0, 640, 433);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
