package com.chaitanya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaitanya.domain.DLog;
import com.chaitanya.repository.DLRepository;

@Service
public class DLogService {
	
	@Autowired
	private DLRepository dLRepository;
	
	public DLog saveDLogObject(DLog dLog) {
		return dLRepository.save(dLog);
	}
}
