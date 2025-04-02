package OneToOneCourseExample;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import OneToOneMappingExample.Student;
@Component
public class CourseRepositoryTest {
	@Autowired
	private CourseRepository courseRepository;
	Scanner sc=new Scanner(System.in);
	public void print() {
		List<Course> corse=courseRepository.findAll();
		System.out.println(corse);
	}

	
	public void deleteStudent()
	{   System.out.println("enter the id");
	    int id=sc.nextInt();
		Optional<Course> courseOpt = courseRepository.findById((int) id);
		if(courseOpt.isPresent()) {
			Course course = courseOpt.get();
			courseRepository.delete(course);
		}
	}
}
