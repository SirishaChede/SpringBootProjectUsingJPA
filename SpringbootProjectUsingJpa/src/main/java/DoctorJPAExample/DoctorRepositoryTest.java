package DoctorJPAExample;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Student.Student;
@Component
public class DoctorRepositoryTest {
	@Autowired
	private DoctorRepository DoctorRep;
	Scanner sc=new Scanner(System.in);
public void insertDoctorDetails() {
	try {
	//System.out.println("enter the doctor id");
	//int id=sc.nextInt();
	//sc.nextLine();
	System.out.println("enter the Doctor name");
	String name=sc.nextLine();
	System.out.println("enter the Doctor email");
	String email=sc.nextLine();
	System.out.println("enter the Doctor moboile number");
	String mobile=sc.nextLine();
	System.out.println("enter the Doctor Department");
	String Department=sc.nextLine();
	    Doctor doc=Doctor.builder()
                //.id(id)
				.name(name)
				.email(email)
				.mobile(mobile)
				.Department(Department)
				.build();
		DoctorRep.save(doc);
		System.out.println(doc.getId()+"th Doctor details is inserted successfully");
	}catch(Exception e) {
		System.out.println(e.toString());
		
	}
	finally {
		System.out.println("enter correct details");
	}
				
	}
public void printAllDoctorDetails() {
	List<Doctor>Doctorlist=DoctorRep.findAll();
	System.out.println("Doctorlist="+Doctorlist);
}
public void printDoctorByname() {
	List<Doctor>DoctorList=DoctorRep.findByname("siri");
	System.out.println("Doctorlist="+DoctorList);
}
public void printByemail() {
	List<Doctor>Doctorlist=DoctorRep.findByEmail("siri@gmail.com");
	System.out.println("DoctorList="+Doctorlist);
}
public void printall() {
	List<Doctor>Doctorlist=DoctorRep.printAll();
	System.out.printf("%-5s %-15s %-15s %-20s %-10s%n", "Id","name","email","mobile","Departmernt");
	System.out.println("..........................................................................");
	for  (Doctor doctor:Doctorlist)
	{
        System.out.printf("%-5d %-15s %-15s %-20s %-10s%n",
            doctor.getId(),  doctor.getName(), doctor.getEmail(), doctor.getMobile(),doctor.getDepartment());
	
}
}
public void printdoctorbyEmail()
{
	List<Student>studentlist=DoctorRep.getprintdoctorbyEmail("karthik.com");
	System.out.println("studentlist="+studentlist);
}
public void count() {
	Long doctorlist=DoctorRep.allcount();
	System.out.println("DoctorCount="+doctorlist);
}
public void updatedetails() {
	System.out.println("enter the doctor email"); 
	String email=sc.nextLine();
	System.out.println("enter the name");
	String name=sc.nextLine();
	int k=DoctorRep.updateDoctorbyEmail(name,email);
	if(k==1) {
		System.out.println("updated successfully");
	}else {
		System.out.println("enter correct email");
	}
}
public void deleteDoctor() {
	System.out.println("enter doctor name to delete");
	String name=sc.nextLine();
	int k=DoctorRep.deleteDoctordetails(name);
	if(k==1) {
		System.out.println("delete successfully");
		
	}else {
		System.out.println("enter correct name");
	}
}
}
