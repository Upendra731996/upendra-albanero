package com.example.ProjectFive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectFiveApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(ProjectFiveApplication.class, args);
		}
		catch (Exception exception){
			System.out.println(exception.getMessage());
		}
	}

}
