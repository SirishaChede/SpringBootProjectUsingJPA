package ManyToManyExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseRepositoryTest {
	@Autowired
	private CourseRepository corseRepository;
	Scanner sc=new Scanner(System.in);
	public void insertdetails() {
		System.out.println("enter how many coursematerials enterd");
		int n=sc.nextInt();
		sc.nextLine();
		List<CourseMaterial> coursemateriallist=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("enter the cost");
			int cost=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the url");
			String url=sc.next();
			CourseMaterial courseMaterial=CourseMaterial.builder()
					.cost(cost)
					.url(url)
					.build();
			coursemateriallist.add(courseMaterial);
			
		
		}
		System.out.println("enter how many courses u have entered");
		int m=sc.nextInt();
		sc.nextLine();
		List<Course>courselist=new ArrayList<>();
		for(int i=0;i<m;i++) {
			System.out.println("enter the course name");
			String name=sc.nextLine();
			System.out.println("enter the course credits");
			int credits=sc.nextInt();
			sc.nextLine();
			Course course=Course.builder()
					.name(name)
					.credits(credits)
					.courseMaterial(coursemateriallist)
					.build();
			courselist.add(course);
			
		}
		corseRepository.saveAll(courselist);
		
	}

}
