package Question1;
import java.sql.*;
import java.util.Scanner;

public class SpecificProduct 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter product category");
		String category=scan.next();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select p_subcategory from Product where p_category='"+category+"'";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/peje7?user=root&password=root");
			
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				String p_subcategory=rs.getString("p_subcategory");
				
				System.out.println(p_subcategory);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try
				{
					stmt.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(rs!=null)			
			{
				try
				{
					rs.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}

}
