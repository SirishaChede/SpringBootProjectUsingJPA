package ManyToManyExample;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Overallprocess {
	@Autowired
	public CourseRepositoryTest courserepositorytest;
	@Autowired
	public CourseMaterialRepositoryTest courseMaterialtest;
     Scanner sc=new Scanner(System.in);
     public void printAll() {
    	 while(true) {
    	 try {
    	 System.out.println("\t1.create\n\t2.exit");
    	 System.out.println("enter the number");
    	 switch(Integer.parseInt(sc.nextLine())) {
    	 case 1:
    		 courserepositorytest.insertdetails();
    		 break;
    	 case 2:
    		 System.exit(4);
    		 break;
    	default:System.out.println("please enter correct number");
    	
    	 }
    	 
     }catch(Exception e) {
    	 System.out.println(e.toString());
     }
}
     }
}

