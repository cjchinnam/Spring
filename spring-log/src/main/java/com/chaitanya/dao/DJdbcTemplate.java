package com.chaitanya.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DJdbcTemplate {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String insert() {
		String sql="insert into DI_LOG VALUES(001,001,'immediate','test description','system',SYSDATE,'fix');";
		jdbcTemplate.update(sql);
		return "record updated successfully";
	}
	
	public String list() {
		String select_query="select * from DI_LOG";
		jdbcTemplate.execute(select_query);
	}
}
