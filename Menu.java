import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JSplitPane;
import javax.swing.JLabel;

public class Menu{

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 639, 470);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.text);
		menuBar.setBounds(0, 0, 635, 38);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("User");
		mnNewMenu.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-customer-16.png"));
		mnNewMenu.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Log Out");
		mntmNewMenuItem_4.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Log Out.png"));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Inventory");
		mnNewMenu_1.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Inventory.png"));
		mnNewMenu_1.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Product");
		mntmNewMenuItem.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\add Product.png"));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertdataindb insert = new insertdataindb();
				
				add_product_page add = new add_product_page();
				add.setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Open Inventory");
		mntmNewMenuItem_3.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Open Inventory.png"));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				open_inventory open = new open_inventory();
				open.setVisible(true);
				
				
			}
		});
		mntmNewMenuItem_3.setBackground(SystemColor.text);
		mnNewMenu_1.add(mntmNewMenuItem_3);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Delete Product");
		mntmNewMenuItem_1.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Delete Product.png"));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 delete_product_page dlt = new delete_product_page();
			 dlt.setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Update Product Details");
		mntmNewMenuItem_7.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Modify Inventory.png"));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				modify_product_page mod = new modify_product_page();
				mod.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Search Product");
		mntmNewMenuItem_8.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Search .png"));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				search_product_page src = new search_product_page();
				src.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Purchase");
		mnNewMenu_2.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Purchase.png"));
		mnNewMenu_2.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Generate Bill");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate_bill bill = new generate_bill();
				bill.setVisible(true);
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Gen Bill.png"));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_4 = new JMenu("Customer Information");
		mnNewMenu_4.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\Customer _ info.png"));
		mnNewMenu_4.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Customer Information");
		mnNewMenu_4.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				customer_info show_cust_info = new customer_info();
				show_cust_info.setVisible(true);
				
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\cutomer info.png"));
		
		JMenu mnNewMenu_3 = new JMenu("About");
		mnNewMenu_3.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-information-16.png"));
		mnNewMenu_3.setFont(new Font("Microsoft Yi Baiti", Font.BOLD, 17));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("About");
		mntmNewMenuItem_6.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\icons8-information-16.png"));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about_page ap = new about_page();
				ap.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Lawrenciums\\College Stuff\\4 SEM\\JAVA\\Icons\\skyscraper-1149478_640.jpg"));
		lblNewLabel.setBounds(0, -39, 640, 531);
		frame.getContentPane().add(lblNewLabel);
		
		
		

	}

	public void setVisible(boolean b) 
	{
		Menu window = new Menu();
		window.frame.setVisible(true);

	}
	
	

}
