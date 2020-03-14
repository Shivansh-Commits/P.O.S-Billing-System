import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class show_sales_logs extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show_sales_logs frame = new show_sales_logs();
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
	public show_sales_logs() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 326);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(64, 64, 64)), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sales ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(240, 240, 240))));
		panel_1.setBounds(21, 60, 591, 219);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 15, 571, 194);
		panel_1.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		insertdataindb show_sales_logs = new insertdataindb();
		show_sales_logs.show_sales_logs(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 102, 153), 3, true));
		panel.setBounds(261, 12, 99, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sales Logs");
		lblNewLabel.setBounds(10, 10, 87, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 15));
	}

}
