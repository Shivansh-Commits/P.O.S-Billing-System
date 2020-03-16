import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

public class search_product_page extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_product_page frame = new search_product_page();
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
	public search_product_page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setForeground(SystemColor.inactiveCaption);
		contentPane.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(43, 100, 569, 195);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 549, 165);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 102, 153));
		panel_2.setBorder(new LineBorder(SystemColor.textText, 2, true));
		panel_2.setBounds(118, 52, 107, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 16, 112, 21);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Product ID", "Product Name", "Product MRP", "Product Purchase Cost", "Expiry Date", "Product Quantity", "Product Size", ""}));

		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(10, 10, 85, 21);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String value = (String)comboBox.getSelectedItem();
				if(value=="Product ID")
				{
					int pi=Integer.parseInt(textField.getText());
					insertdataindb search = new insertdataindb();
					search.searchbyid(table_1,pi);
				}
				else if(value=="Product Name")
				{
					String pn=textField.getText();
					insertdataindb search = new insertdataindb();
					search.searchbyname(table_1,pn);
				}
				else if(value=="Product MRP")
				{
					int pmrp=Integer.parseInt(textField.getText());
					insertdataindb search = new insertdataindb();
					search.searchbymrp(table_1,pmrp);
				}
				else if(value=="Product Purchase Cost")
				{
					int pprcst=Integer.parseInt(textField.getText());
					insertdataindb search = new insertdataindb();
					search.searchbycost(table_1,pprcst);
				}
				else if(value=="Product Quantity")
				{
					int pq=Integer.parseInt(textField.getText());
					insertdataindb search = new insertdataindb();
					search.searchbyquant(table_1,pq);
				}
				else if(value=="Product Size") 
				{
					String ps=textField.getText();
					insertdataindb search = new insertdataindb();
					//JOptionPane.showMessageDialog(null, ps);
					search.searchbysize(table_1,ps);
				}
				else
				{
					String pe=textField.getText();
					insertdataindb search = new insertdataindb();
					search.searchbyexpiry(table_1,pe);
				}
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
			}
		});
		
		lblNewLabel = new JLabel("Search By:");
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel.setBounds(38, 10, 91, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(257, 17, 132, 19);
		contentPane.add(textField);
		textField.setColumns(10);
			}
}
