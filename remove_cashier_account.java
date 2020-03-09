import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class remove_cashier_account extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					remove_cashier_account frame = new remove_cashier_account();
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
	public remove_cashier_account() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 322, 210);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cashier Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_1.setBounds(34, 10, 236, 88);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cahiser Name:");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBounds(21, 18, 94, 13);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		
		textField = new JTextField();
		textField.setBounds(110, 15, 109, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cashier ID No.");
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setBounds(21, 54, 94, 13);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 51, 109, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(114, 121, 103, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 10, 83, 21);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String name;
				name=textField.getText();
				int Choice = JOptionPane.showConfirmDialog(getParent(), "Are You Sure" ,"Alert!" , JOptionPane.YES_NO_OPTION);
				if(Choice== JOptionPane.YES_OPTION)
				{
					insertdataindb remove = new insertdataindb();
					remove.remove_cashier_account(name);
					
				}
				
				textField.setText(null);
				textField_1.setText(null);
				}
				catch(Exception e_1)
				{
					JOptionPane.showMessageDialog(null,"ERROR : Invalid Input");
				}
			}
		});
	}
}
