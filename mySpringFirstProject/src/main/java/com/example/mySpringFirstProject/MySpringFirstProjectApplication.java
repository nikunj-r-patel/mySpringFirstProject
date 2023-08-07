package com.example.mySpringFirstProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan
public class MySpringFirstProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringFirstProjectApplication.class, args);
	}
}
