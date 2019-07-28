package com.chaitanya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.model.Product;
import com.chaitanya.service.JewelleryService;

@RestController
public class JewelleryController {
	
	
	private final JewelleryService jewelleryService;
	
	@Autowired
	public JewelleryController(JewelleryService jewelleryService) {
		this.jewelleryService = jewelleryService;
	}
	
	@RequestMapping(value = "/getDiscount", 
			method = RequestMethod.GET, 
			produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setType(type);
		jewelleryService.getProductDiscount(product);
		return product;
	}	
}
