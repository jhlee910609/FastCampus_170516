package com.junhee.java.polymophism;

public class Son extends Father {
	
	// 부모 객체인 Father객체의 필드값 private으로 묶여 있어서 public 메서드를 통해 넣어줘야 함.
	
	
	public String name = "자식이름";
	

	public void goSchool() {
		System.out.println("학교에 갑니다.");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

}


