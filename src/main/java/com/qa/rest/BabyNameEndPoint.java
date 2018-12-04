package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.BabyNameService;

@RestController
public class BabyNameEndPoint {

	@Autowired
	BabyNameService service;
	
	
	@RequestMapping("/getName/{lengthOfName}/{nameStartingWith}")
	public String getName(@PathVariable Long lengthOfName, @PathVariable String nameStartingWith) {
		String name = service.generateBabyName(lengthOfName, nameStartingWith);
		return name;
	}
	
}
