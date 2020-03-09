import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class modify_product_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modify_product_page frame = new modify_product_page();
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
	public modify_product_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 670, 316);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Product Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_1.setBounds(16, 10, 628, 199);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Product ID");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 18, 132, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		
		textField = new JTextField();
		textField.setBounds(126, 18, 122, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New Product_ID:");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 50, 132, 19);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(SystemColor.activeCaptionText);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 47, 122, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New Product Name:");
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 73, 132, 31);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(SystemColor.activeCaptionText);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 76, 122, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New Product MRP:");
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(10, 106, 142, 24);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(SystemColor.activeCaptionText);
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 105, 122, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New Product Quantity:");
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(10, 136, 153, 24);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setBackground(SystemColor.activeCaptionText);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.menu);
		comboBox.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		comboBox.setBounds(463, 46, 96, 21);
		panel_1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"S(Small)", "M(Medium)", "L(Large)", "N)(Normal)"}));
		
		textField_4 = new JTextField();
		textField_4.setBounds(152, 138, 96, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New Product Expiry:");
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(305, 21, 148, 13);
		panel_1.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(463, 18, 96, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New Product Size:");
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(305, 50, 122, 13);
		panel_1.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("New Product Purchase Cost:");
		lblNewLabel_7.setForeground(SystemColor.menu);
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(305, 79, 166, 13);
		panel_1.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(481, 76, 78, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New Product Salt:");
		lblNewLabel_8.setForeground(SystemColor.menu);
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(305, 109, 103, 13);
		panel_1.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(418, 106, 141, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("(Only For Pharmacies)");
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(428, 133, 208, 13);
		panel_1.add(lblNewLabel_9);
		lblNewLabel_9.setForeground(SystemColor.menu);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new LineBorder(SystemColor.activeCaptionText, 1, true));
		panel.setBounds(256, 227, 111, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 10, 93, 21);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int cpi=Integer.parseInt(textField.getText());;
				int pi=Integer.parseInt(textField_1.getText());
				int pc=Integer.parseInt(textField_3.getText());
				int pq=Integer.parseInt(textField_4.getText());
				int ppc=Integer.parseInt(textField_6.getText());
				String pn=textField_2.getText();
			    String ps=(String)comboBox.getSelectedItem();
			    String psalt=textField_7.getText();
				String pexp=textField_5.getText();
				
				insertdataindb modify = new insertdataindb();
				modify.modify(cpi,pn, pi, pc, pq,ppc,ps,pexp,psalt);
				JOptionPane.showMessageDialog(null, "Modified Successfully");
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
			}
		});
		btnNewButton.setForeground(SystemColor.activeCaptionText);
	}
}
