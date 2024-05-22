package edu.school.schoolServer;

import edu.school.schoolServer.service.TeacherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SchoolServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServerApplication.class, args);
	}

}
