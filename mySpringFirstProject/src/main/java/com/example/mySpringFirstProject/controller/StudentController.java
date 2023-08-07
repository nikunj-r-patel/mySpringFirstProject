package com.example.mySpringFirstProject.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Showinng hello world on web page");
		return studentService.hello();
	}
	@GetMapping("/newstudent")
	public List<Student> newStudent() {
		System.out.println("Showinng new student on web page");
		return studentService.newStudent();
	}
}
