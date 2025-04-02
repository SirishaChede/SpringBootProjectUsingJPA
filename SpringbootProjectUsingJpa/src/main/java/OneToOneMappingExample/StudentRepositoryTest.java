package OneToOneMappingExample;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentrepository;
Scanner sc=new Scanner(System.in);
	public void printAllStudentDetails()
	{
		List<Student>studentdetails=studentrepository.findAll();
		System.out.println(studentdetails);
	}	
	public void deleteStudent()
	{   System.out.println("enter the id");
	    int id=sc.nextInt();
		/*System.out.println("Enter the Student name to delete");
		String name=sc.nextLine();
		//int k=studentrepository.deletemethod(name);
		if(k==1)
		{System.out.println("deleted successfully");
		}else {
			System.out.println("enter correct id");*/
		
		Optional<Student> studentOpt = studentrepository.findById((int) id);
		if(studentOpt.isPresent()) {
			Student student = studentOpt.get();
			studentrepository.delete(student);
	  
	    	    
	    	}
		
	}
}

