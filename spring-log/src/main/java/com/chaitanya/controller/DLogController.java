package com.chaitanya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.dao.DJdbcTemplate;
import com.chaitanya.domain.DLog;

@RestController
public class DLogController {
	@Autowired
	private DJdbcTemplate dJdbcTemplate;
//	@Autowired
//	private DLogService dLogService;
//	
//	@RequestMapping(value="/save-di-log", method = RequestMethod.POST)
//	
//    public ResponseEntity<Void> saveDILog(@RequestBody DLog dLog){
//		
//		DLog dLogObj = dLogService.saveDLogObject(dLog);
//		return ResponseEntity.status(HttpStatus.CREATED).build();	
//	}
	
@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insertRecord() {
	return dJdbcTemplate.insert();
	
	}
	
	
}
