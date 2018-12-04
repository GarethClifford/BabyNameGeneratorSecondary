package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.util.StringGenerator;

@Service
public class BabyNameService {
	
	@Autowired
	StringGenerator stringGenerator;
	
	public String generateBabyName(Long lengthOfName, String nameStartingWith) {
		return stringGenerator.nameGenerator(lengthOfName, nameStartingWith);
	}
	

}
