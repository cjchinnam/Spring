package com.chaitanya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.model.Student;

@RestController
public class StudentServicesController {
	
	
	@RequestMapping (value = "/student", method = RequestMethod.GET, produces = {"application/json","application/xml"})
	public Student firstPage() {
		Student st = new Student();
		st.setId("1");
		st.setGrade("LKG2018");
		st.setName("Peter");
		
		return st;
	}

}
