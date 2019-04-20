package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Student;

@Service
public class StudentService {

	
	private List<Student> list = Arrays.asList(new Student("Pavan", 1, 100), new Student("kumar", 2, 100), new Student("vuppala", 3, 500));
	
	
	public List<Student> getStudents (){
		
		return list;
		
	}
	
public Student getStudent (int id){
		
	
	for (Student s: list) {
		
		if (s.getId() == id )
			return s;
	}
		return null;
		
	}
}
