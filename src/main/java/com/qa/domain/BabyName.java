package com.qa.domain;

public class BabyName {
	
	private String babyName;
	
	public BabyName(String babyName) {
		this.babyName = babyName;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	@Override
	public String toString() {
		return "BabyName [babyName=" + babyName + "]";
	}
	

}
