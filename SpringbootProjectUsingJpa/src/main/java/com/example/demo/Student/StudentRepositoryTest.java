package com.example.demo.Student;

import java.util.List;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentRepositoryTest {
	@Autowired
	private StudentRepository res;
	Scanner sc=new Scanner(System.in);
	public void insertStudentDetails()
	{
		try {
		System.out.println("Enter Student EmailId");
		String email=sc.nextLine();
		
		System.out.println("Enter Student FirstName");
		String FirstName=sc.nextLine();
		
		System.out.println("Enter Student LastName");
		String LastName=sc.nextLine();
		
		System.out.println("Enter Student PhoneNum");
		int phNo=sc.nextInt();
		Student std=Student.builder()
					.email(email)
					.firstName(FirstName)
					.lastName(LastName)
					.phNo(phNo)
					.build();
		res.save(std);
		System.out.println(std.getId()+"th Student details inserted successfully!");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("please Enter vaild details");
		}
	}
public void printStudentsList()
{
	List<Student>studentlist=res.findAll();
	System.out.println("studentlist="+studentlist);
}

public void printStudentByFirstName()
{
	List<Student>studentlist=res.findByFirstName("venu");
	System.out.println("studentlist="+studentlist);
}	
	
public void printStudentByEmailAddress()
{
	List<Student>student=res.getStudentByEmailAddress("karthik.com");
	System.out.println("studentlist="+student);
}	

public void printAllStudents()
{
	List<Student>studentlist=res.findAllStudents();
	 System.out.printf("%-5s %-15s %-15s %-20s %-10s%n", "ID", "First Name", "Last Name", "Email", "Phone No");   
	 System.out.println("--------------------------------------------------------------"); 
	 for (Student student : studentlist) {
	            System.out.printf("%-5d %-15s %-15s %-20s %-10d%n",
	                student.getId(), student.getFirstName(), student.getLastName(), student.getEmail(), student.getPhNo());
     }

   }


public void printStudentbyEmail()
{
	List<Student>studentlist=res.getStudentByEmail("karthik.com");
	System.out.println("studentlist="+studentlist);
}


public void printStudentCount()
{
	Long studentlist=res.getStudentsCount();
	System.out.println("studentlist="+studentlist);
}

public void updateStudentName()
{
	System.out.println("Enter the Student Email");
	String email=sc.nextLine();
	System.out.println("Enter the Student FirstName to update");
	String firstname =sc.nextLine();
	int k=res.updateStudentNameByEmail(firstname,email);
	if(k==1)
	{
	System.out.println("Student  "+firstname+"  updated successfully!");
	}
	else
	{
		System.out.println("Please Enter Correct Email");
	}
}

public void deleteStudent()
{
	System.out.println("Enter the Student Email to delete");
	String email=sc.nextLine();
	int k=res.deleteStudentNameByEmail(email);
	if(k==1)
	{
		System.out.println("Student details deleted successfully!");
	}
	else
	{
		System.out.println("Please Enter Correct Email");
	}	
}
}

