package OneToOneMappingExample;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OverAllProcess {
	Scanner sc=new Scanner(System.in);
	@Autowired
	private StudentAddressRepositoryTest studentaddrtessreository;
	@Autowired
	private StudentRepositoryTest studentreository;
	public void Test()
	{
		while(true)
		{
			try {
		System.out.println("\t1.Create"+"\n\t2.Read"+"\n\t3.Delete"+"\n\t3.Exit");
		System.out.println("Enter the Option");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			studentaddrtessreository.insertDetails();
			break;
		case 2:
			studentaddrtessreository.printAllDetails();
			break;
		case 3:
			studentreository.deleteStudent();
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



