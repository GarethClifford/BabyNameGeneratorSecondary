package com.qa.util;

import org.springframework.stereotype.Component;

@Component
public class StringGenerator {
	
	public String nameGenerator(Long lengthOfName, String nameStartingWith) {
		String actualName = nameStartingWith.toLowerCase();
		Long numberToGenerate = lengthOfName - nameStartingWith.length();
		String[] letters = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","v","b","n","m"};
		for (int i = 0; i < numberToGenerate; i++) {
			int randomLetterIndex = (int) Math.round(Math.random() * letters.length);
			actualName += letters[randomLetterIndex];
		}
		return actualName;
	}

}
