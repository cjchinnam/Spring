package com.chaitanya.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest/student")
public class studentResource {

	
	@GetMapping
	public List<student> getStudents(){
		return Arrays.asList(
				new student("hari","jagan"),
				new student("sai","siva")
				);
		
	}

	@GetMapping("/{studentName}")
	public student getStudent(@PathVariable("studentName") final String studentName) {
		return new student(studentName,"jai");
	}
	
	private class student{
		private String studentName;
		private String friendName;
		public student(String studentName, String friendName) {
			super();
			this.studentName = studentName;
			this.friendName = friendName;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getFriendName() {
			return friendName;
		}
		public void setFriendName(String friendName) {
			this.friendName = friendName;
		}
		
		
}
}