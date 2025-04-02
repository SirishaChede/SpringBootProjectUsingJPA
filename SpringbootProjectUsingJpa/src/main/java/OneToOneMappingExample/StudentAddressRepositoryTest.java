package OneToOneMappingExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentAddressRepositoryTest {
	Scanner sc=new Scanner(System.in);
	//private StudentAddress stud;
	@Autowired
	private StudentAddressRepository studentaddressrepository;
	
	public void insertDetails() {
		System.out.println("Enter Student EmailId");
		String email=sc.nextLine();
		System.out.println("Enter Student FirstName");
		String FirstName=sc.nextLine();
		System.out.println("Enter Student LastName");
		String LastName=sc.nextLine();
		System.out.println("Enter Student PhoneNum");
		int phNo=sc.nextInt();
//		System.out.println("Please Enter How Many Addresses Do You Want");
//		int n=sc.nextInt();	
		Student std=Student.builder()
					.email(email)
					.firstName(FirstName)
					.lastName(LastName)
					.phNo(phNo)
					.build();
		
//List<StudentAddress> addressList = new 	ArrayList<>();
//		for(int i=0;i<n;i++)
//		{
			System.out.println("Enter Student PinCode");
			int Pincode=sc.nextInt();
		System.out.println("Enter Student State");
		String state =sc.next();
		StudentAddress stdadd=StudentAddress.builder()
				.State(state)
				.Pincode(Pincode)
				.student(std)
				.build();
		studentaddressrepository.save(stdadd);
		//addressList.add(stdadd); 
		
		}
		
		// studentaddressrepository.saveAll(addressList);
		
//		StudentAddress stdadd=StudentAddress.builder()
//				.student(std)
//				.build();
//		studentaddressrepository.save(stdadd);
	//	}
	
	public void printAllDetails()
	{
		List<StudentAddress> studentaddress=studentaddressrepository.findAll();
		System.out.println(studentaddress);
		for(int i=0;i<studentaddress.size();i++) {
		System.out.println(studentaddress.get(i).getStudent());
		}
	}
	
}