package com.springboot.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWarDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWarDemo2Application.class, args);
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Arsen");
		student.setLastName("Turelyk");
		
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		
	}

}
