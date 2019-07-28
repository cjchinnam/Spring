package com.chaitanya.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	
	private String id;
	private String name;
	private String grade;
	
	public Student() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
