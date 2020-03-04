import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JLabel;
public class Admin_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Menu frame = new Admin_Menu();
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
	public Admin_Menu() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 385);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Users");
		mnNewMenu.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-customer-16.png"));
		mnNewMenu.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Add Cashier Account");
		mntmNewMenuItem_10.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-add-user-male-16.png"));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_cashier_account add = new add_cashier_account();
				add.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Remove Cashier Account");
		mntmNewMenuItem_13.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Delete user.png"));
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				remove_cashier_account remove = new remove_cashier_account();
				remove.setVisible(true);				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("User Logs");
		mntmNewMenuItem_12.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-bulleted-list-16.png"));
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user_logs viewuserlogs = new user_logs();
				viewuserlogs.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Cashier Details");
		mntmNewMenuItem_14.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\user details.png"));
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cashier_details cashier_details = new cashier_details();
				cashier_details.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Log Out");
		mntmNewMenuItem_11.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Log Out.png"));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_1 = new JMenu("Inventory");
		mnNewMenu_1.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Inventory.png"));
		mnNewMenu_1.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Open Inventory");
		mntmNewMenuItem_9.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Open Inventory.png"));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				open_inventory open = new open_inventory();
				open.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Add Product");
		mntmNewMenuItem_6.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\add Product.png"));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_product_page add=new add_product_page();
			    add.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Delete Product");
		mntmNewMenuItem_7.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Delete Product.png"));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_product_page dlt=new delete_product_page();
				dlt.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Update Product Details");
		mntmNewMenuItem_8.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Modify Inventory.png"));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modify_product_page modify = new modify_product_page();
				modify.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Search Product");
		mntmNewMenuItem_5.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Search .png"));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				search_product_page search = new search_product_page();
				search.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Purchase");
		mnNewMenu_2.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Purchase.png"));
		mnNewMenu_2.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Generate Bill");
		mntmNewMenuItem_2.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Gen Bill.png"));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				generate_bill bill = new generate_bill();
				bill.setVisible(true);
				
				
			}
			
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Sales Logs");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				show_sales_logs show_sales = new show_sales_logs();
				show_sales.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-land-sales-16.png"));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_4 = new JMenu("Tax Details");
		mnNewMenu_4.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Tax.png"));
		mnNewMenu_4.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tax Details");
		mntmNewMenuItem_1.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\tax details.png"));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tax_details tax = new tax_details();
				tax.setVisible(true);
				
				
				}
		});
		mnNewMenu_4.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Update Tax Details");
		mntmNewMenuItem_15.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\update tax detaails.png"));
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_tax_details_page update_tax_details = new update_tax_details_page();
				update_tax_details.setVisible(true);
				
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_15);
		
		JMenu mnNewMenu_5 = new JMenu("Customer Credentials");
		mnNewMenu_5.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Customer _ info.png"));
		mnNewMenu_5.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Customer Information");
		mnNewMenu_5.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer_info show_cust_info = new customer_info();
				show_cust_info.setVisible(true);
				
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\cutomer info.png"));
		
		JMenu mnNewMenu_3 = new JMenu("About");
		mnNewMenu_3.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-information-16.png"));
		mnNewMenu_3.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				about_page about = new about_page();
				about.setVisible(true);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-information-16.png"));
		mnNewMenu_3.add(mntmNewMenuItem);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\skyscraper-1149478_640.jpg"));
		lblNewLabel.setBounds(0, -87, 634, 522);
		contentPane.add(lblNewLabel);
		
		mnNewMenu.setMnemonic(KeyEvent.VK_Q);//Shortcut for Menu
		mnNewMenu_1.setMnemonic(KeyEvent.VK_W);//Shortcut for Menu
		mnNewMenu_2.setMnemonic(KeyEvent.VK_E);//Shortcut for Menu
		mnNewMenu_3.setMnemonic(KeyEvent.VK_Y);//Shortcut for Menu
		mnNewMenu_4.setMnemonic(KeyEvent.VK_R);//Shortcut for Menu
		mnNewMenu_5.setMnemonic(KeyEvent.VK_T);//Shortcut for Menu
		
		
		KeyStroke keyStrokeToOpen= KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK);
		mntmNewMenuItem_10.setAccelerator(keyStrokeToOpen);
		
		KeyStroke keyStrokeToOpen_1= KeyStroke.getKeyStroke(KeyEvent.VK_R,KeyEvent.CTRL_DOWN_MASK);
		mntmNewMenuItem_13.setAccelerator(keyStrokeToOpen_1);
		
		KeyStroke keyStrokeToOpen_2= KeyStroke.getKeyStroke(KeyEvent.VK_U,KeyEvent.CTRL_DOWN_MASK);
		mntmNewMenuItem_12.setAccelerator(keyStrokeToOpen_2);
		
		KeyStroke keyStrokeToOpen_3= KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.CTRL_DOWN_MASK);
		mntmNewMenuItem_14.setAccelerator(keyStrokeToOpen_3);
		
		KeyStroke keyStrokeToOpen_4= KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0);
		mntmNewMenuItem_11.setAccelerator(keyStrokeToOpen_4);
		
		KeyStroke keyStrokeToOpen_5= KeyStroke.getKeyStroke(KeyEvent.VK_F1,0);
		mntmNewMenuItem_9.setAccelerator(keyStrokeToOpen_5);

		KeyStroke keyStrokeToOpen_6= KeyStroke.getKeyStroke(KeyEvent.VK_F2,0);
		mntmNewMenuItem_6.setAccelerator(keyStrokeToOpen_6);

		KeyStroke keyStrokeToOpen_7= KeyStroke.getKeyStroke(KeyEvent.VK_F3,0);
		mntmNewMenuItem_7.setAccelerator(keyStrokeToOpen_7);
		
		KeyStroke keyStrokeToOpen_8= KeyStroke.getKeyStroke(KeyEvent.VK_F4,0);
		mntmNewMenuItem_8.setAccelerator(keyStrokeToOpen_8);
		
		KeyStroke keyStrokeToOpen_9= KeyStroke.getKeyStroke(KeyEvent.VK_F5,0);
		mntmNewMenuItem_5.setAccelerator(keyStrokeToOpen_9);
		
		KeyStroke keyStrokeToOpen_10= KeyStroke.getKeyStroke(KeyEvent.VK_F6,0);
		mntmNewMenuItem_2.setAccelerator(keyStrokeToOpen_10);
		
		KeyStroke keyStrokeToOpen_11= KeyStroke.getKeyStroke(KeyEvent.VK_F7,0);
		mntmNewMenuItem_3.setAccelerator(keyStrokeToOpen_11);
		
		KeyStroke keyStrokeToOpen_12= KeyStroke.getKeyStroke(KeyEvent.VK_F8,0);
		mntmNewMenuItem_1.setAccelerator(keyStrokeToOpen_12);
		
		KeyStroke keyStrokeToOpen_13= KeyStroke.getKeyStroke(KeyEvent.VK_F9,0);
		mntmNewMenuItem_15.setAccelerator(keyStrokeToOpen_13);
		
		KeyStroke keyStrokeToOpen_14= KeyStroke.getKeyStroke(KeyEvent.VK_F10,0);
		mntmNewMenuItem_4.setAccelerator(keyStrokeToOpen_14);
		
		

	}
}
