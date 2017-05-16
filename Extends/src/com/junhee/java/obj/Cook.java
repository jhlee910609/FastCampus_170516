package com.junhee.java.obj;

// interface = 기능 모음
// interface 상속 시 무조건(의무적으로) 구현해야함 
// 변수 정의 불가, 메서드만 정의할 수 있음. 
// 자바의 상속 시 다중상속이 안되는 부분을 인터페이스가 보완해주는 역할을 하기도 함.
// 객체 지향에서의 인터페이스는 '객체 지향 설계를 위해 굉장히 중요한 도구' 이다.
// 상속보다 훨씬 더 중요한 개념으로 추후 개발 시 많이 쓰일 수 있는 기술, 인터페이스
// {} 자체가 입력되지 않음 
//	abstract 클래스와 기능 흡사, abstract 생략됨.
// 디자인 패턴, MVP 패턴을 공부하게 되면 와닿을 수 있는 개념.
// 속성 값 X 경우 > 속성 값 있다면 클래스로 

public interface Cook {
	
	public void boil(); // {} 자체가 인터페이스에서는 입력되지 않음. 
	public abstract void grill();
	public void fry();
	public void oven();
	public void stea();
	void disassemble();
	void replacePart();
	void clean();
	void assemble();
	
	
	

}
