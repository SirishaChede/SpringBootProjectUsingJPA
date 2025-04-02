package DoctorJPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class main {
	@Autowired
	public DoctorRepositoryTest test;
	@Autowired
	public OverAllprocess process;
//public OverAllprocess process;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(main.class,args);
	}
// the below method is used for we can individually print the methods it on them		
@PostConstruct
public void init() {
	//test.insertDoctorDetails();
	//test.printAllDoctorDetails();
	process.All();// this method can take the class of the OverallProcess and can it can ask one by one process
	}



}
