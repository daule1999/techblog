package com.techblog.techblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.utils.*;

@SpringBootApplication
public class TechblogApplication {
	public TechblogApplication(){
		super();
	}
	public static void main(String[] args) {
		// SpringApplication.run(TechblogApplication.class, args);
		SpringApplication app = new SpringApplication(TechblogApplication.class);
        	app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		System.out.println("Server running at port  "+8083)
        	app.run(args);
	}

}
