package CollegeManagementSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import CollegeManagementSystem.model.Student;
import CollegeManagementSystem.utility.Connections;

public class StudentInsert {
	
	Scanner sc=new Scanner(System.in);
	static Student s=new Student();
	public void studentInsert()
	{
		
		System.out.println("enter the name");
		s.setName(sc.next());
		System.out.println("enter the age");
		s.setAge(sc.nextInt());
		System.out.println("enter the subject");
		s.setSubject(sc.next());
		System.out.println("enter the college name");
		s.setCollegename(sc.next());
		try
		{
			//connection creation
			Connection con=new Connections().getConnection();
			//statement creation
			Statement st=con.createStatement();
			//preparing statement
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?);");
			//process
			pst.setString(1, s.getName());
			pst.setInt(2, s.getAge());
			pst.setString(3, s.getSubject());
			pst.setString(4, s.getCollegename());
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
			e.printStackTrace();
		}
	  }
	}

