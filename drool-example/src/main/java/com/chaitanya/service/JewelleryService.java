package com.chaitanya.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaitanya.model.Product;


@Service
public class JewelleryService {
	
	
	private final KieContainer kieContainer;
	
	@Autowired
	public JewelleryService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	
	public Product getProductDiscount(Product product) {
		//get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(product);
		kieSession.fireAllRules();
		kieSession.dispose();
		return product;
	}
	

}
