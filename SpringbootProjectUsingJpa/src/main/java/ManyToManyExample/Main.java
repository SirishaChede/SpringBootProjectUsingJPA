package ManyToManyExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Main {
	@Autowired
	private Overallprocess process;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class,args);

	}
   @PostConstruct
   public void init() {
	   process.printAll();
   }
}
