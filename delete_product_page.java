import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;

public class delete_product_page extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_product_page frame = new delete_product_page();
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
	public delete_product_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 279);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 102, 153));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Product Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_2.setBounds(29, 22, 307, 142);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name:");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBounds(10, 41, 105, 22);
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(114, 35, 163, 40);
		panel_2.add(panel);
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 140, 19);
		panel.add(textField);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID:");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setBounds(10, 96, 94, 29);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(SystemColor.activeCaptionText);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBounds(114, 85, 116, 40);
		panel_2.add(panel_1);
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel_1.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 96, 19);
		panel_1.add(textField_1);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 102, 153));
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(93, 174, 159, 42);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Delete Product");
		btnNewButton.setForeground(SystemColor.inactiveCaptionText);
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 10, 140, 21);
		panel_3.add(btnNewButton);
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				int pi;
				pi=Integer.parseInt(textField_1.getText());
				insertdataindb delete = new insertdataindb();
				delete.delete(pi);
				JOptionPane.showMessageDialog(null,"PRODUCT DELETED");
				textField.setText(null);
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
			}
		});
	}
}
