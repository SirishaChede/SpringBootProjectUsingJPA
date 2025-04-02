package OneToOneCourseExample;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CourseMaterialRepositoryTest {
	@Autowired
	private CourseMaterialRepository Repository;
	Scanner sc=new Scanner(System.in);
	
	public void saveCourseMaterial() {
		//try {
		//System.out.println("enter the id");
		//int id=sc.nextInt();
		//sc.nextLine();
		System.out.println("enter the Title ");
		String Title=sc.nextLine();
		System.out.println("enter the credits");
		int credits=sc.nextInt();
		//sc.nextLine();
		Course course=Course.builder()
				//.id(id)
				.Title(Title)
				.credit(credits)
				.build();
		/*System.out.println("enter course material id");
		int cid=sc.nextInt();*/
		System.out.println("enter the course url");
		String url=sc.next();
		CourseMaterial Coursematerial=CourseMaterial.builder()
				//.id(cid)
				.url(url)
				.course(course)
				.build();
		Repository.save(Coursematerial);
		//System.out.println("details inserted successfully");
	}//catch(Exception e) {
		//System.out.println(e.toString());
	//}finally {
		//System.out.println("enter correct number");
	//}
	//}
		
	public void printAll() {
		List<CourseMaterial> coursematerial=Repository.findAll();
		System.out.println("CourseMaterial"+coursematerial);
		for(int i=0;i<coursematerial.size();i++) {
			System.out.println(coursematerial.get(i).getCourse());
		}
	}
	

	}		


