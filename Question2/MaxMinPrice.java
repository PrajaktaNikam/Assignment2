package Question2;

import java.sql.*;

public class MaxMinPrice
{
	static Connection con;
	static
	{
		//System.out.println("running static block");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/peje7?user=root&password=root");
			//System.out.println("Connection established");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void maxProduct()
	{
		Statement stmt=null;
		ResultSet rs=null;
		String query="select * from Product where p_price=(select max(p_price)from product);";
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			if(rs.next())
			{
				int p_id=rs.getInt(1);
				String p_name=rs.getString(2);
				double p_price=rs.getDouble(3);
				System.out.println(p_id+"\t"+p_name+"\t"+p_price);
				
			}
			
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		}
	
	}
	public void minProduct()
	{
		Statement stmt=null;
		ResultSet rs=null;
		String query="select * from Product where p_price=(select min(p_price)from product)";
		try
		{
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			if(rs.next())
			{
				int p_id=rs.getInt(1);
				String p_name=rs.getString(2);
				double p_price=rs.getDouble(3);
				System.out.println(p_id+"\t"+p_name+"\t"+p_price);
				
			}
				
			
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		}
	   
	}
	

}
