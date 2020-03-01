import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop.Action;

import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;    

public class generate_bill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generate_bill frame = new generate_bill();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public generate_bill() {
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 999, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Customer Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel.setBounds(10, 10, 283, 212);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 29, 45, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(81, 26, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contact No:");
		lblNewLabel_1.setForeground(SystemColor.menu);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 55, 79, 13);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 52, 114, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Products Purchased:");
		lblNewLabel_2.setForeground(SystemColor.menu);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 114, 123, 18);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 114, 63, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gender:");
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(10, 85, 63, 13);
		panel.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.menu);
		comboBox.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setBounds(81, 81, 114, 21);
		panel.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Email_ID:");
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(10, 142, 63, 19);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 142, 112, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Payment Mode");
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(10, 171, 79, 23);
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(SystemColor.menu);
		comboBox_2.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"BHIM-UPI", "Paytm", "Cash", "Debit Card", "Credit Card"}));
		comboBox_2.setBounds(93, 170, 102, 21);
		panel.add(comboBox_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Products In Bill", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_1.setBounds(303, 10, 672, 212);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(31, 24, 599, 156);
		panel_1.add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 102));
		panel_4.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel_4.setBounds(325, 251, 188, 67);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Save Customer Details");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(10, 10, 168, 47);
		panel_4.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-save-16 (1).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String cust_name = textField.getText();
				String cust_gender=(String)comboBox.getSelectedItem();
				String cust_email_id=textField_3.getText();
				String payment_mode = (String)comboBox_2.getSelectedItem();
				int products_purchased = Integer.parseInt(textField_2.getText());
				int cust_contact_no = Integer.parseInt(textField_1.getText());
				
				insertdataindb save_cust_details = new insertdataindb();
				save_cust_details.add_customer_details(cust_name, cust_gender, cust_email_id, payment_mode, cust_contact_no, products_purchased);
				JOptionPane.showMessageDialog(null,"Customer Details Added");
				}
				catch(Exception e_3)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
			    	e_3.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 153, 204));
		btnNewButton_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 102, 153));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Product Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_2.setBounds(10, 232, 283, 297);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Product Name:");
		lblNewLabel_6.setForeground(SystemColor.menu);
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(10, 23, 87, 19);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Product ID:");
		lblNewLabel_7.setForeground(SystemColor.menu);
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(10, 52, 69, 19);
		panel_2.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(91, 21, 96, 19);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(91, 52, 98, 19);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Product MRP:");
		lblNewLabel_8.setForeground(SystemColor.menu);
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(10, 81, 69, 19);
		panel_2.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(91, 81, 96, 19);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Product Quantity:");
		lblNewLabel_9.setForeground(SystemColor.menu);
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(10, 110, 96, 19);
		panel_2.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		textField_8.setBounds(111, 110, 76, 19);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(SystemColor.menu);
		comboBox_1.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"S(Small)", "M(Medium)", "L(Large)", "N(Normal)"}));
		comboBox_1.setBounds(91, 139, 96, 21);
		panel_2.add(comboBox_1);
		
		
		
		JButton btnNewButton = new JButton(" Add Product");
		btnNewButton.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-plus-math-16.png"));
		btnNewButton.setBounds(67, 197, 154, 30);
		panel_2.add(btnNewButton);
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				String name=textField_5.getText();
				int id=Integer.parseInt(textField_6.getText());
				int mrp=Integer.parseInt(textField_7.getText());
                int quant=Integer.parseInt(textField_8.getText());
                String size=(String)comboBox_1.getSelectedItem();
                insertdataindb ob = new insertdataindb();
                ob.add_to_product_in_bill(name, size, id, mrp, quant);
			    ob.show_products_in_bill(table);  
				}
				catch(Exception e_1)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
			    	e_1.printStackTrace();

				}
			    
				}
		});
		
		
		
		btnNewButton.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_10 = new JLabel("Product Size:");
		lblNewLabel_10.setForeground(SystemColor.menu);
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(10, 139, 96, 19);
		panel_2.add(lblNewLabel_10);
		
		JButton btnNewButton_4 = new JButton("Delete Product");
		btnNewButton_4.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-trash-can-16.png"));
		btnNewButton_4.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				String val=table.getModel().getValueAt(row, 0).toString();
				insertdataindb delete_from_products_in_bill= new insertdataindb();
				delete_from_products_in_bill.delete_from_products_in_bill(val);
			    delete_from_products_in_bill.show_products_in_bill(table);
				
			}
		});
		btnNewButton_4.setBounds(67, 237, 154, 30);
		panel_2.add(btnNewButton_4);
		
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 102, 153));
		JLabel lblNewLabel_17 = new JLabel("Rs.  ");
		lblNewLabel_17.setForeground(SystemColor.menu);
		lblNewLabel_17.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_17.setBounds(297, 51, 72, 19);
		panel_3.add(lblNewLabel_17);
		
		JLabel lblNewLabel_14 = new JLabel();
		lblNewLabel_14.setForeground(Color.BLACK);
		lblNewLabel_14.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_14.setBounds(98, 23, 38, 19);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel();
		lblNewLabel_15.setForeground(Color.BLACK);
		lblNewLabel_15.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_15.setBounds(98, 51, 38, 19);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel();
		lblNewLabel_16.setForeground(Color.BLACK);
		lblNewLabel_16.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_16.setBounds(98, 77, 38, 19);
		panel_3.add(lblNewLabel_16);
		
		JLabel lblNewLabel_21 = new JLabel("Rs.  ");
		lblNewLabel_21.setForeground(SystemColor.menu);
		lblNewLabel_21.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_21.setBounds(297, 23, 72, 18);
		panel_3.add(lblNewLabel_21);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 102));
		panel_5.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel_5.setBounds(325, 347, 188, 67);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setForeground(Color.DARK_GRAY);
		lblNewLabel_27.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblNewLabel_27.setBounds(46, 129, 128, 13);
		panel_3.add(lblNewLabel_27);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setForeground(Color.DARK_GRAY);
		lblNewLabel_25.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblNewLabel_25.setBounds(66, 106, 96, 13);
		panel_3.add(lblNewLabel_25);
		
		
		
		JButton btnNewButton_2 = new JButton("Generate Bill");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(10, 10, 168, 47);
		panel_5.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-receipt-16.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				insertdataindb update_quantity = new insertdataindb();
				update_quantity.update_quantity();
				
				insertdataindb make_zero = new insertdataindb();
			    make_zero.make_zero_if_less_than_zero();
			       
			    double total_ex_tax=0.0;
			    double total_inc_tax=0.0;
			    
				insertdataindb bill_ex_tax = new insertdataindb();
			    total_ex_tax= bill_ex_tax.bill_ex_tax();
				
				insertdataindb bill_inc_tax = new insertdataindb();
			    total_inc_tax= bill_inc_tax.bill_inc_tax();
				
			    lblNewLabel_17.setText("Rs. "+total_inc_tax);
			    lblNewLabel_21.setText("Rs. "+total_ex_tax);
			    
			    double cgst=0;
			    double sgst=0;
			    double gst=0;
			    String gstin_no="";
			    
			    insertdataindb returncgst = new insertdataindb();
			    cgst=returncgst.returncgst();
			    lblNewLabel_14.setText(cgst+"%");
			    
			    insertdataindb returnsgst = new insertdataindb();
			    sgst=returnsgst.returnsgst();   
			    lblNewLabel_15.setText(sgst+"%");
			    
			    insertdataindb returngst = new insertdataindb();
			    gst=returngst.returngst();
			    lblNewLabel_16.setText(gst+"%");
			    
			    insertdataindb returngstin_no = new insertdataindb();
			    gstin_no=returngstin_no.returngstin_no();
			    lblNewLabel_25.setText(gstin_no);
			    
			    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");  
			    LocalDateTime now = LocalDateTime.now();  
			    lblNewLabel_27.setText(dtf.format(now)); 
			    
			    String name=textField_5.getText();
				int id=Integer.parseInt(textField_6.getText());
				int mrp=Integer.parseInt(textField_7.getText());
                int quant=Integer.parseInt(textField_8.getText());
                String size=(String)comboBox_1.getSelectedItem();
			    
			    insertdataindb insert_in_sales_logs = new insertdataindb();
			    insert_in_sales_logs.insert_into_sales_logs(name,size,id,mrp,quant);
			    
			    
				}
				catch(Exception e_2)
				{
			    	JOptionPane.showMessageDialog(null, "ERROR : Invalid Input");
				}
				
			}
		});
		btnNewButton_2.setBackground(new Color(0, 204, 0));
		btnNewButton_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64), 1, true), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Bill", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_3.setBounds(549, 232, 426, 297);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		JLabel lblNewLabel_11 = new JLabel("CGST Applied:");
		lblNewLabel_11.setForeground(SystemColor.menu);
		lblNewLabel_11.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(10, 25, 85, 19);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("SGST Applied:");
		lblNewLabel_12.setForeground(SystemColor.menu);
		lblNewLabel_12.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblNewLabel_12.setBounds(10, 50, 85, 19);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("GST Applied:");
		lblNewLabel_13.setForeground(SystemColor.menu);
		lblNewLabel_13.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblNewLabel_13.setBounds(10, 72, 78, 24);
		panel_3.add(lblNewLabel_13);
		
		
		JLabel lblNewLabel_18 = new JLabel("Total Payable Amount:");
		lblNewLabel_18.setForeground(SystemColor.menu);
		lblNewLabel_18.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_18.setBounds(174, 51, 113, 19);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("(INC TAXES)");
		lblNewLabel_19.setForeground(Color.GRAY);
		lblNewLabel_19.setFont(new Font("Sitka Text", Font.PLAIN, 9));
		lblNewLabel_19.setBounds(174, 65, 85, 18);
		panel_3.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel(" Total Payable Amount:");
		lblNewLabel_20.setForeground(SystemColor.menu);
		lblNewLabel_20.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_20.setBounds(169, 23, 137, 19);
		panel_3.add(lblNewLabel_20);
		
		JLabel lblNewLabel_22 = new JLabel("Terms And Conditions:");
		lblNewLabel_22.setFont(new Font("Sitka Text", Font.ITALIC, 10));
		lblNewLabel_22.setBounds(10, 215, 113, 24);
		panel_3.add(lblNewLabel_22);
		
		JTextArea txtrgoodsOnceSold = new JTextArea();
		txtrgoodsOnceSold.setBackground(new Color(0, 102, 153));
		txtrgoodsOnceSold.setFont(new Font("Sitka Small", Font.PLAIN, 10));
		txtrgoodsOnceSold.setText("1.Goods Once Sold will not be Returned or Exchanged\r\n2.Please Check MRP of the Medecines before leaving the counter\r\n3.All Disputes are subject to City Medicos Lic.\r\n4.All Rights Reserved \u00A9");
		txtrgoodsOnceSold.setBounds(10, 234, 340, 53);
		panel_3.add(txtrgoodsOnceSold);
		
		JLabel lblNewLabel_23 = new JLabel("(EXC TAXES)");
		lblNewLabel_23.setForeground(Color.GRAY);
		lblNewLabel_23.setFont(new Font("Sitka Text", Font.PLAIN, 9));
		lblNewLabel_23.setBounds(174, 39, 55, 19);
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("GSTIN No.");
		lblNewLabel_24.setForeground(SystemColor.menu);
		lblNewLabel_24.setFont(new Font("Sitka Text", Font.PLAIN, 10));
		lblNewLabel_24.setBounds(10, 101, 64, 24);
		panel_3.add(lblNewLabel_24);
		
		JLabel lblNewLabel_26 = new JLabel("Date:");
		lblNewLabel_26.setForeground(SystemColor.menu);
		lblNewLabel_26.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblNewLabel_26.setBounds(10, 124, 45, 24);
		panel_3.add(lblNewLabel_26);
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 0, 102));
		panel_6.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		panel_6.setBounds(325, 444, 188, 67);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Dispose Bill");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-error-16.png"));
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setBounds(10, 10, 168, 46);
		panel_6.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertdataindb dispose_bill = new insertdataindb();
				dispose_bill.dispose_bill();
				dispose();
			}
		});
		
		
		btnNewButton_3.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		
	}
	
	
	
	
}
