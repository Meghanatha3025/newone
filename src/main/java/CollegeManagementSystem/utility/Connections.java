package CollegeManagementSystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
	static String URL="jdbc:mysql://localhost:3306/CollegeManagementSystem";
	static String USERNAME="root";
	static String PASSWORD="123";

	public  Connection getConnection()
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			return con;
		}
		catch(Exception e)
		{
			System.out.println("connection not done");
		}
		return null;
	
	}

}
