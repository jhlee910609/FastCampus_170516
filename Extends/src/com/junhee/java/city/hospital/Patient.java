package com.junhee.java.city.hospital;

import com.junhee.java.city.design.People;

public class Patient extends People {

	public String mainDoctor;

	public String myDoctor(String doctor) {
		this.mainDoctor = doctor;
		return this.mainDoctor;
	}
	
	// 주치의 소개 
	public void tellMyDocter() {
		System.out.println("제 주치의는 " + mainDoctor);
	}
}
