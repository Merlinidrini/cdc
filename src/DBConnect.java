import java.sql.*;
import org.apache.derby.jdbc.ClientDriver;

public class DBConnect{   		
	public static Connection connect()
	{			
		String url = "jdbc:derby://localhost:1527/CdCollectionWeb";		
		String username = "root";			
		String password = "";					
		System.out.println("Connecting database...");			
						
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e)
		{
			e.printStackTrace();
		}			
		System.out.println("Database connected!");			
		return conn;			

	}	
}
