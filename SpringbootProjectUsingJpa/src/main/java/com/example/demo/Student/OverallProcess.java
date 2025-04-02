package com.example.demo.Student;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OverallProcess {
	Scanner sc=new Scanner(System.in);
	@Autowired
	public StudentRepositoryTest test;
	public void Test()
	{
		while(true)
		{
			try {
		System.out.println("\t1.Create"+"\n\t2.Update"+"\n\t3.Read"+"\n\t4.Delete"+"\n\t5.Exit");
		System.out.println("Enter the Option");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
			test.insertStudentDetails();
			break;
		case 2:
			test.updateStudentName();
			break;
		case 3:
			test.printAllStudents();
			break;
		case 4:
			test.deleteStudent();
			break;
		case 5:
			System.exit(0);
			default:System.out.println("Enter Number between 1-5");
		}
	}
catch(Exception e)
		{
	System.out.print(e.toString());
	System.out.println("enter valid number");
		}
		
}
}
}