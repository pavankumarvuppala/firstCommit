package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Student> getStudents() {

		return studentService.getStudents();

	}

	@RequestMapping(value = "/students/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	Student getStudent(@PathVariable int id) {

		return studentService.getStudent(id);

	}
	
	@RequestMapping(value = "/students/{id}", produces = MediaType.APPLICATION_XML_VALUE, method=RequestMethod.POST)
	Student getStudent2(@PathVariable int id) {

		return studentService.getStudent(id);

	}


}
