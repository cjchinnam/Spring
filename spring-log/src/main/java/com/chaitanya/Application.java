package com.chaitanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chaitanya.config.Config;
import com.chaitanya.dao.DJdbcTemplate;

@EntityScan(basePackages="com.chaitanya")
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Config.class,args);
	}
}
