package CollegeManagementSystem.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import CollegeManagementSystem.model.Student;
import CollegeManagementSystem.utility.Connections;

public class OrderByName {
	

	static Student s=new Student();
	static Scanner sc=new Scanner(System.in);
	public  void orderByName()
	{

		try {
			Connection con= new Connections().getConnection();
			Statement st=con.createStatement();
			String sql="select * from  student order by name;";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.getString(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
