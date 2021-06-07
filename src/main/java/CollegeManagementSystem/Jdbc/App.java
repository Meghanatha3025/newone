package CollegeManagementSystem.Jdbc;
/*1.create pojo class
 * 2.client pkg which contains inputs and outputs
 * 3.service layer basic logics bussinesslogi
 * 4.dao layer connection btween db and java
 * 5.utility for helping class
 * 6.model is for entity/pojo class
 */
import java.util.Scanner;

import CollegeManagementSystem.dao.CollegeInsert;
import CollegeManagementSystem.dao.OrderByName;
import CollegeManagementSystem.dao.ShowDetails;
import CollegeManagementSystem.dao.StudentInsert;

public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
  while(true)
	  {
	  int choice=0;
		System.out.println("enter your choice");
		System.out.println("press 1 for college name and strength");
		System.out.println("press 2 for  inserting student details");
		System.out.println("press 3 for show all details");
		System.out.println("press 4 for order by name");
		System.out.println("press 5 for exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: new CollegeInsert().collegeInsert();
		break;
		case 2:new StudentInsert().studentInsert();
		break;
		case 3:new ShowDetails().showDetails();
		break;
		case 4:new OrderByName().orderByName();
		break;
		case 5: System.out.println("thank you");
		break;
		default:System.out.println("plese enter the valid number");
		break;
		}
	   }
    }
}