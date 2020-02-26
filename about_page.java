import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;

public class about_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about_page frame = new about_page();
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
	public about_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 430, 377);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 102, 153), 2, true));
		panel_1.setBounds(74, 77, 267, 245);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 15, 255, 224);
		panel_1.add(scrollPane);
		
		JTextPane txtpnThisIsA = new JTextPane();
		scrollPane.setViewportView(txtpnThisIsA);
		txtpnThisIsA.setText(" This is a SuperMarket Managment System.\r\nThere are Two Types of Users who can acces this Software\r\n  1.Administrator\r\n  2.Cashier\r\n\r\n1).Functionalities Provided to Administrator:\r\n\r\na) USER\r\n  \t1.Add Cashier Account\r\n  \t2.Remove Cashier Account\r\n \t3.View Cashier Details\r\n\t4.View User Logs\r\n  \t5.Log Out\r\n\r\nb) INVENTORY\r\n\t1.Add Product \r\n\t2.Remove Product\r\n\t3.Delete Product\r\n\t4.Modify Product Details\r\n      5.Open Inventory\r\n\r\nc) PURCHASE\r\n\t1.Generate Bill\r\n\t2.Sales Logs\r\n\t3.Customer Information\r\n\r\nd) TAX \r\n\t1.Tax Details\r\n\t2Update Tax Details\r\n\r\ne) ABOUT\r\n\r\n2).Functionalities Given to the Cashier:\r\n\r\na) USER\r\n  \t1.LOG OUT\r\n  \t\t\r\nb) INVENTORY\r\n\t1.Add Product \r\n\t2.Remove Product\r\n\t3.Delete Product\r\n\t4.Modify Product Details\r\n     \t5.Open Inventory\r\n\r\nc) PURCHASE\r\n\t1.Generate Bill\r\n\t2.Customer Information\r\n\r\nd) ABOUT\r\n\r\nDeveloped By Shivansh Singh Bhadouria.\r\nB-Tech CS(Hons)");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 102, 153), 2, true));
		panel.setBounds(171, 15, 64, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT");
		lblNewLabel.setBounds(10, 0, 52, 35);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
	}
}
