import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class update_tax_details_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_tax_details_page frame = new update_tax_details_page();
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
	public update_tax_details_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 246, 304);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64)), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Update Tax Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel.setBounds(20, 20, 193, 175);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SGST:");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 10));
		lblNewLabel.setBounds(20, 35, 65, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(81, 30, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CGST:");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(20, 69, 65, 13);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 64, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("GST:");
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(20, 103, 45, 13);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 98, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("GSTIN No.");
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setBackground(SystemColor.menu);
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(20, 137, 58, 13);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 132, 96, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 102, 153), 2, true));
		panel_1.setBounds(47, 215, 139, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Update Details");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setBounds(10, 10, 120, 21);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int sgst=Integer.parseInt(textField.getText());
				int cgst=Integer.parseInt(textField_1.getText());
				int gst=Integer.parseInt(textField_2.getText());
				String gstin_no = textField_3.getText();
				insertdataindb update_tax_details = new insertdataindb();
				update_tax_details.update_tax_details(sgst, cgst, gst,gstin_no);
				JOptionPane.showMessageDialog(null,"Details Updated");
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
				
			}
		});
	}
}
