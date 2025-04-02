package OneToManyExample;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OverAllProcess {
	Scanner sc=new Scanner(System.in);
	@Autowired
	private StudentRepositoryTest studentrepositorytest;
	@Autowired
	private StudentAddressRepositoryTest studentaddressrepositorytest;
	public void Test()
	{
		while(true)
		{
			try {
		System.out.println("\t1.Create"+"\n\t2.Read"+"\n\t3.delete"+"\n\t4.Exit");
		System.out.println("Enter the Option");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			studentrepositorytest.insertDetails();
			break;
		case 2:
			studentaddressrepositorytest.printAllStudentDetails();
			break;
		case 3:
			studentrepositorytest.deleteStudentById();
			break;
		case 4:
			System.exit(0);
			default:System.out.println("Enter Number between 1-3");
		}
	}
catch(Exception e)
		{
	System.out.print(e.toString());
	System.out.println("enter valid number");
		}
}
}}