package com.chaitanya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.model.Student;

@RestController
public class TestController {
	
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public Student firstPage() {
		
		Student st = new Student();
		st.setStudentId("EC100");
		st.setGrade("J01");
		st.setName("Sam");
		return st;
	}

}
