package OneToOneCourseExample;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OverallProcess {
	@Autowired
	private CourseRepositoryTest CorseRepository;
	@Autowired
	private CourseMaterialRepositoryTest CourseMaterialRepository;
	Scanner sc=new Scanner(System.in);
	public void test() {
		while(true) {
			try {

		System.out.println("\t1.create\n\t2.read\n\t3.delete\n\t4.exit");
		System.out.println("enter the number");
		switch(Integer.parseInt(sc.nextLine())) {
		case 1:
			CourseMaterialRepository.saveCourseMaterial();
			break;
		case 2:
			CourseMaterialRepository.printAll();
			break;
		case 3:
			CorseRepository.deleteStudent();
			break;
		case 4:
			System.exit(0);
			break;
		default:System.out.println("enter the correct number");
		}
	}catch(Exception e) {
		System.out.println(e.toString());
		System.out.println("enter correct number");
	}
}
}
}
