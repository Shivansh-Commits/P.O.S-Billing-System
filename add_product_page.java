import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class add_product_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_product_page frame = new add_product_page();
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
	public add_product_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 670, 311);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Product Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_1.setBounds(21, 10, 611, 172);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name:");
		lblNewLabel.setBounds(21, 15, 96, 32);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBackground(SystemColor.textText);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField = new JTextField();
		textField.setBounds(112, 22, 96, 19);
		panel_1.add(textField);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID:");
		lblNewLabel_1.setBounds(21, 57, 83, 24);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(SystemColor.activeCaptionText);
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 60, 96, 19);
		panel_1.add(textField_1);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Product MRP:");
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setBounds(21, 93, 83, 24);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(SystemColor.activeCaptionText);
		lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 96, 96, 19);
		panel_1.add(textField_2);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Product Quantity:");
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setBounds(21, 127, 111, 24);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(SystemColor.activeCaptionText);
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_3 = new JTextField();
		textField_3.setBounds(112, 130, 96, 19);
		panel_1.add(textField_3);
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		comboBox.setBounds(404, 95, 96, 21);
		panel_1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"S(Small)", "M(Medium)", "L(Large)", "N(Normal)"}));
		
		JLabel lblNewLabel_4 = new JLabel("Product Purchase Cost:");
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setBounds(263, 26, 131, 21);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_4 = new JTextField();
		textField_4.setBounds(404, 23, 111, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Expiry Date:");
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setBounds(322, 63, 72, 13);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_5 = new JTextField();
		textField_5.setBounds(404, 57, 111, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Product Size:");
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setBounds(322, 98, 83, 13);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Salt:");
		lblNewLabel_7.setForeground(SystemColor.menu);
		lblNewLabel_7.setBounds(366, 132, 30, 13);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		textField_6 = new JTextField();
		textField_6.setBounds(404, 130, 96, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("( DD.MM.YYYY )");
		lblNewLabel_8.setBounds(525, 58, 90, 19);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setForeground(SystemColor.menu);
		lblNewLabel_8.setBackground(SystemColor.menu);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setBounds(251, 222, 131, 42);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Product");
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 10, 111, 21);
		panel.add(btnNewButton);
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try
				{
					String pn=textField.getText();
					int pi=Integer.parseInt(textField_1.getText());
					int pc=Integer.parseInt(textField_2.getText());
					int pq=Integer.parseInt(textField_3.getText());
					int ppc=Integer.parseInt(textField_4.getText());
					String pexp=textField_5.getText();
					String psalt=textField_6.getText();
					String ps=(String)comboBox.getSelectedItem();
					
					insertdataindb insert=new insertdataindb();
					insert.insert(pn, pi, pc, pq ,ppc,ps,pexp,psalt);
					JOptionPane.showMessageDialog(null,"Product Added");
					  			
				}
				catch(Exception e5)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
			}
		});
	}
}
