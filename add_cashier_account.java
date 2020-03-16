import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

public class add_cashier_account extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_cashier_account frame = new add_cashier_account();
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
	public add_cashier_account() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 590, 326);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(255, 200, 0), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cashier Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_1.setBounds(22, 9, 531, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBounds(10, 15, 79, 27);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField = new JTextField();
		textField.setBounds(94, 20, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setBounds(10, 60, 62, 13);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 57, 96, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cashier Name:");
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setBounds(10, 92, 79, 19);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 93, 96, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cashier Age:");
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setBounds(10, 124, 79, 27);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_3 = new JTextField();
		textField_3.setBounds(94, 129, 96, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cashier ID No:");
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setBounds(10, 161, 79, 27);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 166, 96, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Cashier E-mail ID:");
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setBounds(300, 23, 96, 19);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_5 = new JTextField();
		textField_5.setBounds(408, 20, 96, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Cashier Address:");
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setBounds(300, 53, 96, 27);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_6 = new JTextField();
		textField_6.setBounds(408, 58, 96, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Cashier Salary:");
		lblNewLabel_7.setForeground(SystemColor.menu);
		lblNewLabel_7.setBounds(300, 88, 96, 27);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_7 = new JTextField();
		textField_7.setBounds(408, 93, 96, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Cashier Contact No:");
		lblNewLabel_8.setForeground(SystemColor.menu);
		lblNewLabel_8.setBounds(300, 124, 96, 27);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_8 = new JTextField();
		textField_8.setBounds(408, 129, 96, 19);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		comboBox.setBounds(408, 165, 96, 21);
		panel_1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		
		JLabel lblNewLabel_9 = new JLabel("Gender:");
		lblNewLabel_9.setForeground(SystemColor.menu);
		lblNewLabel_9.setBounds(310, 161, 66, 27);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(218, 238, 129, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Account");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 10, 109, 21);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String username=textField.getText();
				String password=textField_1.getText();
				String name=textField_2.getText();
				String email_id=textField_5.getText();
				String add=textField_6.getText();
				String gender=(String)comboBox.getSelectedItem();
				int age=Integer.parseInt(textField_3.getText());
				int id_no=Integer.parseInt(textField_4.getText());
				int salary=Integer.parseInt(textField_7.getText());
				int contact=Integer.parseInt(textField_8.getText());
				
				insertdataindb add_cashier = new insertdataindb();
				add_cashier.add_cashier_account(username, password, name, email_id, add, gender, age, id_no, salary, contact);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);  
				textField_7.setText(null);
				textField_8.setText(null);  
				
				JOptionPane.showMessageDialog(null, "Cashier Account Added");
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
				
			}
		});
	}
}
