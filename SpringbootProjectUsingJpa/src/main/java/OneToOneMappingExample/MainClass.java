package OneToOneMappingExample;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MainClass {
//	@Autowired
//private StudentRepositoryTest srt;
	@Autowired
	private OverAllProcess sart;
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);

	}
	@PostConstruct
    public void init() {
       sart.Test();

	}

}
