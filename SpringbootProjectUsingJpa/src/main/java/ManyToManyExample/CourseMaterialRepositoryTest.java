package ManyToManyExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseMaterialRepositoryTest {
	@Autowired
	private CourseMaterialRepository coursematerialRepository;
	Scanner sc=new Scanner(System.in);
	public void insertdetails() {
		System.out.println("enter the course name");
		String name=sc.nextLine();
		System.out.println("enter the credits");
		int credits=sc.nextInt();
		sc.nextLine();
		List<CourseMaterial>coursemateriallist=new ArrayList<>();
		System.out.println("enter the number of coursematerials");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("enter the cost");
			int cost=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the course url");
			String url=sc.nextLine();
			CourseMaterial coursematerial=CourseMaterial.builder()
					.cost(cost)
					.url(url)
					.build();
			coursemateriallist.add(coursematerial);
			
		}
		Course course=Course.builder()
				.name(name)
				.credits(credits)
				.courseMaterial(coursemateriallist)
				.build();
			
			
		}
	public void printAllcourseDetails()
	{
		List<CourseMaterial>coursematerial=coursematerialRepository.findAll();
		System.out.println(coursematerial);
	}	
	
		}
	


