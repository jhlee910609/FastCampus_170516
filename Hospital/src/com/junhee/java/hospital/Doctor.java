package com.junhee.java.hospital;

import com.junhee.java.obj.People;

public class Doctor extends People {
	
	public void checkUp(String patientName) {
		System.out.println(patientName + " 을 진단하였습니다.");
	}
}