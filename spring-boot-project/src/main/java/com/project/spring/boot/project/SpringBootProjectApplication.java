package com.project.spring.boot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootProjectApplication{
	
//	public class SpringBootProjectApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Employee employee1 = new Employee("RAM", "Tech", "SE", "C1", 123456, "JAVA");
//		employeeRepository.save(employee1);
//		
//		Employee employee2 = new Employee("Neha", "Tech", "SE", "C1", 123456, "JAVA");
//		employeeRepository.save(employee2);
//		
//		Employee employee3 = new Employee("Riya", "Tech", "SE", "C1", 123456, "JAVA");
//		employeeRepository.save(employee3);
//		
//	}

}
