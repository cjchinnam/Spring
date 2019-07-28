package com.chaitanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chaitanya.config.Config;
import com.chaitanya.dao.DJdbcTemplate;

//@EntityScan(basePackages="com.verizon")
//@SpringBootApplication
//@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Config.class,args);

	}

}
