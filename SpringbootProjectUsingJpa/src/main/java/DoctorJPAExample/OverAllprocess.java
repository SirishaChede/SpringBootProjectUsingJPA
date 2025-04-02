package DoctorJPAExample;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OverAllprocess {
	Scanner sc= new Scanner(System.in);
	@Autowired
	public DoctorRepositoryTest test;
	
	public void All() {
		while(true) {
			try {
			System.out.println("\t1.create\n\t2.update\n\t3.read\n\t4.delete\n\t5.exit");
			System.out.println("enter the option");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				test.insertDoctorDetails();
				break;
			case 2:
				test.updatedetails();
				break;
			case 3:
				test.printall();
				break;
			case 4:
				test.deleteDoctor();
				break;
			case 5:
				System.exit(5);
				break;
			default:
				System.out.println("enter the values between 1-5");
			}
		}
		catch (Exception e) {
				System.out.println(e.toString());
				System.out.println("enter valid number");
			}
	}

}
}
