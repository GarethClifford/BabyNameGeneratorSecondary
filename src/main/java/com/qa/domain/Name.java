package com.qa.domain;

public class Name {

	private String nameStartingWith;
	private Long lengthOfName;


	public Name() {
	}
	
	public Name(String nameStartingWith, Long lengthOfName) {
		this.nameStartingWith = nameStartingWith;
		this.lengthOfName = lengthOfName;
	}

	public String getNameStartingWith() {
		return nameStartingWith;
	}

	public void setNameStartingWith(String nameStartingWith) {
		this.nameStartingWith = nameStartingWith;
	}

	public Long getLengthOfName() {
		return lengthOfName;
	}

	public void setLengthOfName(Long lengthOfName) {
		this.lengthOfName = lengthOfName;
	}


}
