package com.junhee.java.polymophism;

public class Father {
	
	// 
	public String name = "아빠이름";
	private int age;
	
	// getter와 setter [마우스 오른쪽 클릭 - source - generate setter/getter] 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = "p" + name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter와 setter
	// 클래스의 멤버변수와 클래스의 메서드만 있는 클래 > 포조 클래스
	
	
	
	

}