package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initUsers() {
		List<User> users = new ArrayList<User>();
		User user=new User("ghghgfg", "javatechie", "password", "javatechie@gmail.com");
//				new User(102, "user1", "pwd1", "user1@gmail.com"),
//				new User(103, "user2", "pwd2", "user2@gmail.com"),
//				new User(104, "user3", "pwd3", "user3@gmail.com")
		users.add(user);
		try {
			User user1 = repository.save(user);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplication.class, args);

		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
