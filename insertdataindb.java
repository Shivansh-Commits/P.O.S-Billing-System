
import java.sql.*;
import javax.swing.JTable;

import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;
public class insertdataindb {

	public static void main(String[] args) {
		
		
	}
	
	public void insert(String pn,int pi,int pc,int pq,int ppc,String ps,String pexp,String psalt)
	{

		
    try {
		DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
	    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
        Statement statement = connection.createStatement();
       statement.executeUpdate("insert into products(p_id,p_name,p_cost,p_quantity,p_purchase_cost,p_size,p_expiry_date,salt) values('"+pi+"' , '"+pn+"' , '"+pc+"' , '"+pq+"' , '"+ppc+"','"+ps+"','"+pexp+"','"+psalt+"')");
        
    } catch (SQLException e) {
    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
		e.printStackTrace();
	}
	}
	
	
	public void delete(int pi)
	{
		 try {
				DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
			    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
		        Statement statement = connection.createStatement();
		        int delete = statement.executeUpdate("delete from products where p_id="+pi);
		        System.out.println(delete + "Row deleted");
		        
		    } catch (SQLException e) {
		    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
				e.printStackTrace();
			}
	}
	
	public void modify(int cpi,String pn,int pi,int pc,int pq,int ppc,String ps,String pexp,String psalt)
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        statement.executeUpdate("update products set p_id ="+pi+",p_name='"+pn+"' , p_cost ="+pc+",p_quantity ="+pq+",p_purchase_cost= "+ppc+", p_size='"+ps+"' ,p_expiry_date='"+pexp+"' ,salt='"+psalt+"' where p_id ="+cpi);
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	
	public void searchbyid(JTable table_1,int pi)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_id ="+pi);
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	public void searchbyname(JTable table_1,String pn)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_name ='"+pn+"'");
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	public void searchbymrp(JTable table_1,int pmrp)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_cost ="+pmrp);
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	
	public void searchbycost(JTable table_1,int pc)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_purchase_cost ="+pc);
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	
	public void searchbyquant(JTable table_1,int pq)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_quantity ="+pq);
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	
	
	public void searchbysize(JTable table_1,String ps)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_size ='"+ps+"'");
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	
	public void searchbyexpiry(JTable table_1,String pe)
	{
		
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products where p_expiry_date ='"+pe+"'");
	        
	        table_1.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	}
	
	public void login (String user,String pass,String value)
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        
	        char ch1[];
	        String us="";
	        ch1=user.toCharArray();
			us=us+"'";
			for(int i=0;i<user.length();i++)
			{
				us=us+ch1[i];
			}
			us=us+"'";
			
			char ch2[];
	        String pa="";
	        ch2=user.toCharArray();
			pa=pa+"'";
			for(int i=0;i<pass.length();i++)
			{
				pa=pa+ch2[i];
			}
			pa=pa+"'";
	       
			
	        if(value=="Admin")
	        {
	        	 ResultSet rs = statement.executeQuery("select * from admins where username="+us+" and password="+pa);
	        	if(rs.next())
	        	{
	        		statement.executeUpdate("insert into user_logs_ values("+us+" , sysdate)");
	        		
		        	JOptionPane.showMessageDialog(null,"Login Success,Welcome");
		        	Admin_Menu admin_menu = new Admin_Menu();
		        	admin_menu.setVisible(true);
		        	
	        	}
	        	else
	        	{
		        	JOptionPane.showMessageDialog(null,"Wrong Credentials");

	        	}
	        	
	        }
	        else if(value =="Cashier")
	        {
	        	 ResultSet rs = statement.executeQuery("select username , password from cashier where username="+us+"and password="+pa);
	        	 if(rs.next())
		        	{
	        		    statement.executeQuery("insert into user_logs_ values("+us+" , sysdate)");
			        	JOptionPane.showMessageDialog(null,"Login Success,Welcome");
			        	Menu menu = new Menu();
			        	menu.setVisible(true);
			        	

		        	}
		        	else
		        	{
			        	JOptionPane.showMessageDialog(null,"Wrong Credentials");

		        	}
	 	        
	        }
	        else
	        {
	        	JOptionPane.showMessageDialog(null,"USER SELECTION ERROR");
	        }
	        
	       
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
			
	}
	
	public void open(JTable table)
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from products");
	        
	        table.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	}
	
	public void add_cashier_account(String username , String password , String cashier_name , String email_id , String cashier_add ,String cashier_gender , int cashier_age , int cashier_id_no ,int cashier_salary,int cashier_contact_no)
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	       statement.executeUpdate("insert into cashier (username,password,cashier_name , cashier_age , cashier_id_no , cashier_email_id , cashier_address , cashier_assigned_salary , cashier_contact_no ,gender) values('"+username+"' , '"+password+"' , '"+cashier_name+"' , '"+cashier_age+"' , '"+cashier_id_no+"','"+email_id+"','"+cashier_add+"','"+cashier_salary+"','"+ cashier_contact_no+"','"+cashier_gender+"') ");
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	}
	
	public void remove_cashier_account(String name)
	{
		 try {
				DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
			    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
		        Statement statement = connection.createStatement();
		        int delete = statement.executeUpdate("delete from cashier where cashier_name='"+name+"'");
		        System.out.println(delete + "Row deleted");
		        
		    } catch (SQLException e) {
		    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
				e.printStackTrace();
			}
	}
	
	public void view_user_logs(JTable table)
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from user_logs_");
	        
	        table.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	}
	
	public void view_cashier_details(JTable table)	
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from cashier");
	        
	        table.setModel(DbUtils.resultSetToTableModel(rs));
	        
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}                      
	}
	
	public void add_customer_details(String cust_name,String cust_gender , String cust_email_id,String payment_mode ,int cust_contact_no , int products_purchased )
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	       statement.executeUpdate("insert into customer (customer_name,customer_contact_no,customer_email_id,payment_mode,customer_gender,products_purchased) values('"+cust_name+"' , '"+cust_contact_no+"' , '"+cust_email_id+"' , '"+payment_mode+"' , '"+cust_gender+"','"+products_purchased+"')");
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	    	e.printStackTrace();
		}
	}
	
	public void add_to_product_in_bill(String product_name , String product_size , int product_id , double product_mrp , int product_quant )
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	       statement.executeUpdate("insert into products_in_bill (p_name,p_size,p_mrp,p_id,p_quantity) values('"+product_name+"' , '"+product_size+"' , '"+product_mrp+"' , '"+product_id+"' , '"+product_quant+"')");
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	}
	
	
	public void delete_from_products_in_bill(String val)
	{
		try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	       statement.executeUpdate("delete from products_in_bill where p_name='"+val+"'");
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	}
	
	
	public void show_products_in_bill(JTable table)
	{
		
			try {
				DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
			    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
		        Statement statement = connection.createStatement();
		        ResultSet rs = statement.executeQuery("Select * from products_in_bill");
		        
		        table.setModel(DbUtils.resultSetToTableModel(rs));  
		        
		        
		    } catch (SQLException e) {
		    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
				e.printStackTrace();
			}                      
	} 
	
	
   public void update_quantity()
   {
	   try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	       ResultSet rs = statement.executeQuery("Select * from products_in_bill");
	       while(rs.next())
	       {
	     	   //JOptionPane.showMessageDialog(null,"IN_FUNC_Update_quantity");

	    	   int pq=rs.getInt("p_quantity");
	    	   int pid=rs.getInt("p_id");
	    	   String pquant=rs.getNString("p_quantity");
	    	   statement.executeUpdate("update products set p_quantity=p_quantity-"+pq+"where p_id="+pid+"and p_quantity="+pquant+""); 
	       }
	       
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
	  			e.printStackTrace();
		}    
   }
   
   public void make_zero_if_less_than_zero()
   {
	   try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	     	  // JOptionPane.showMessageDialog(null,"IN_FUNC_make_zero_if_less_than_zer");

	       ResultSet rs1=statement.executeQuery("select * from products");
	       while(rs1.next())
	       {
	    	   int pq1=rs1.getInt("p_quantity");
	    	   //JOptionPane.showMessageDialog(null,pq1);
	           if(pq1<=0)
	           {
	        	   statement.executeUpdate("update products set p_quantity=0 where p_quantity ="+pq1);
	           }    
	       }
		      
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}  
   }
   

  public double bill_ex_tax()
  {
	  double total_ex_tax=0;
	  double mrp=0;
	  double quant=0.0;

	  try 
	  {
		DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
	    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
        Statement statement = connection.createStatement();
        ResultSet rs=statement.executeQuery("select * from products_in_bill");
  	   

        while(rs.next())
       {
        	
    	   mrp=rs.getInt("p_mrp");
    	   quant=rs.getInt("p_quantity");
    	   mrp=mrp*quant;
    	   total_ex_tax=total_ex_tax+mrp;

       }
        //JOptionPane.showMessageDialog(null,"IN_FUNC_bill_ex_tax"+total_ex_tax);
 	  
    } 
	catch (SQLException e) 
	{
		JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
		e.printStackTrace();
	}
	  return total_ex_tax;
	  
  }  
   
   
  public double bill_inc_tax()
  {
	  double total_inc_tax=0;
	  double mrp=0.0;
	  double temp=0.0;
	  double temp_1=0.0;
      double quant=0.0;
      double hund=100.00;
      double gst=0.0;
      int flag=1;
	  
      try 
	  {
		DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
	    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
        Statement statement = connection.createStatement();
        ResultSet rs=statement.executeQuery("select * from products_in_bill");
   
        DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
	    Connection connection_1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
        Statement statement_1 = connection_1.createStatement();
        ResultSet rs1=statement_1.executeQuery("select * from taxes");
        
 	    //JOptionPane.showMessageDialog(null,"INC_TAX"+total_inc_tax);

        while(rs.next())
       { 	
        	if(flag==1)
        	{
        		rs1.next();
                gst = rs1.getInt("gst");
        		flag=0;        		
        	}
        	
        	mrp=rs.getInt("p_mrp");
        	quant=rs.getInt("p_quantity");
        	
        	temp=gst/hund;
        	mrp=mrp+mrp*temp;
      	   //JOptionPane.showMessageDialog(null,"MRP:"+mrp);        	
            temp_1=mrp*quant;
            total_inc_tax = total_inc_tax + temp_1;
    	    
     	   //JOptionPane.showMessageDialog(null,"INC_TAX"+total_inc_tax);
       }


    } 
	catch (SQLException e) 
	{
		JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
		e.printStackTrace();
	}
	  return total_inc_tax;
	  
	  
  }  
  
  public void show_tax(JTable table)
  {
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from taxes");
	        
	        table.setModel(DbUtils.resultSetToTableModel(rs));
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
  }
  
  public void show_customer_info(JTable table)
  {
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from customer");
	        
	        table.setModel(DbUtils.resultSetToTableModel(rs));
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
  }
   
  public void insert_into_sales_logs(String name,String size,int id,int mrp,int quant)
  {
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
		    JOptionPane.showMessageDialog(null,"INSERT INTO SALES LOGS CALLED");
	        statement.executeUpdate("INSERT INTO sales_logs SELECT * FROM products_in_bill");
		    statement.executeQuery("truncate table products_in_bill");
	        

	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	  
	  
  }
  
  public void show_sales_logs(JTable table)
  {
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery("Select * from sales_logs");
	        
	        
	        table.setModel(DbUtils.resultSetToTableModel(rs));
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
  }

  public void update_tax_details(int sgst,int cgst,int gst,String gstin_no)
  {
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	       statement.executeUpdate("update taxes set sgst="+sgst+",cgst="+cgst+",gst="+gst+",gstin_no='"+gstin_no+"'");
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
  }
  
  public double returncgst()
  {
	  int cgst=0;
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs=statement.executeQuery("select * from taxes");
	        rs.next();
	        cgst=rs.getInt("cgst");
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	  
	  return cgst;
  }
  
  public double returnsgst()
  {
	  int sgst=0;
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs=statement.executeQuery("select * from taxes");
	        rs.next();
	        sgst=rs.getInt("sgst");
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	  
	  return sgst;
  }
  
  public double returngst()
  {
	  int gst=0;
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs=statement.executeQuery("select * from taxes");
	        rs.next();
	        gst=rs.getInt("gst");
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	  
	  return gst;
  }
  
  public String returngstin_no()
  {
	  String gstin_no="";
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        ResultSet rs=statement.executeQuery("select * from taxes");
	        rs.next();
	        gstin_no=rs.getNString("gstin_no");
	        
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		}
	  return gstin_no;
  }
  
  
  public void dispose_bill()
  {
	  try {
			DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
		    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Helloworld7");
	        Statement statement = connection.createStatement();
	        statement.executeUpdate("truncate table products_in_bill");
	       
	        
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "ERROR : Connection to DataBase Not Established\nTry Again");
			e.printStackTrace();
		} 
  }
  
  
  
  
}


