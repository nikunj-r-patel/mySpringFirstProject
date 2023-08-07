package com.example.mySpringFirstProject.controller;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	public String hello() {
		String str = "h ello W orld !!!!!";
		return str;
	}
	public List<Student> newStudent() {
		List<Student> list = new LinkedList<Student>();
		list.add(new Student(1L, "nikunj", "nikunj123@gmail.com", LocalDate.of(1988, 01, 17), 36));
		System.out.println("Showinng new student on web page");
		return list;
	}
}
