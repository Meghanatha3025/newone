package CollegeManagementSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import CollegeManagementSystem.model.College;
import CollegeManagementSystem.utility.Connections;

public class CollegeInsert {
	
	
	static College c=new College();
	Scanner sc=new Scanner(System.in);
	public void collegeInsert()
	{
	System.out.println("enter the college name");
	c.setCollegename(sc.next());
	System.out.println("enter the strength");
	c.setStrength(sc.nextInt());
	try
	{
		//connection creation
		Connection con=new Connections().getConnection();
		//statement creation
		Statement st=con.createStatement();
		//preparing statement
		PreparedStatement pst=con.prepareStatement("insert into college values(?,?);");
		//process
		pst.setString(1, c.getCollegename());
		pst.setInt(2, c.getStrength());
        //execute statement
		int x=pst.executeUpdate();
	
		if(x==1)
		{
			System.out.println("records inserted");
		}
		else
		{
			System.out.println("record not inserted");
		}
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}