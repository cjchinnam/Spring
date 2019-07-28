package com.chaitanya;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.chaitanya.controller.StudentConsumptionController;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		// TODO Auto-generated method stub

		ApplicationContext ac = SpringApplication.run(StudentApplication.class, args);
		StudentConsumptionController scc = ac.getBean(StudentConsumptionController.class);
		System.out.println(scc);
		scc.getStudent();
	}

	@Bean
	public StudentConsumptionController scc() {
		return new StudentConsumptionController();
	}
}
