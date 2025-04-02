package OneToManyExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentRepositoryTest {
	Scanner sc=new Scanner(System.in);
	@Autowired
	private StudentRepository studentrepository;
	public void insertDetails() {
		System.out.println("Enter Student EmailId");
		String email=sc.nextLine();
		System.out.println("Enter Student FirstName");
		String FirstName=sc.nextLine();
		System.out.println("Enter Student LastName");
		String LastName=sc.nextLine();
		System.out.println("Enter Student PhoneNum");
		int phNo=sc.nextInt();
		System.out.println("Please Enter How Many Addresses Do You Want");
		int n=sc.nextInt();	
		List<StudentAddress1> addressList = new 	ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student PinCode");
			int Pincode=sc.nextInt();
		System.out.println("Enter Student State");
		String state =sc.next();
		StudentAddress1 stdadd=StudentAddress1.builder()
				.State(state)
				.Pincode(Pincode)
				.build();
		addressList.add(stdadd);
		}
		Student std=Student.builder()
				.email(email)
				.firstName(FirstName)
				.lastName(LastName)
				.phNo(phNo)
				.studentaddress1(addressList)
				.build();
		studentrepository.save(std);

		}
	public void printAllStudentDetails()
	{
		List<Student>studentdetails=studentrepository.findAll();
		for(int i=0;i<studentdetails.size();i++)
		{
			System.out.println(studentdetails.get(i).getStudentaddress1());
		}		
	}
	
	public void deleteStudentById()
	{
		System.out.println("Enter the StudentId to delete");
		int id=sc.nextInt();
		Optional<Student>studentopt=studentrepository.findById((int)id);
if(studentopt.isPresent())
{
	Student student=studentopt.get();
	studentrepository.delete(student);
}
	}
	}