package com.junhee.java.polymophism;

public class PolyMain {

	public static void main(String[] args) {
	
		// new = 나 객체.
		// 타입 부모로 대체 가능.
		
		Father son = new Son();
		
		// 메모리 스택에 올라감
		// 메모리에 올라가면서 필드값 모조리 메모리에 업로딩.
		
		System.out.println(son.name);

		// 부모 객체에서 만든 함수들만 나타남.
		// 자식 객체에서 만든 함수들은 뜨지 않음.
		// 그래서 아래 코드 컴파일 오류 생김. 
		// son.goSchool();
		
	
		
		// <--- 다형성과 관련된 것들. --->
		// .(점찍고) 나오는 메소드 혹은 속성의 선택지를 좁혀서 코딩을 좀 더 유연하고, 쉽게 할 수 있게 해줌.
		
		Father daughter = new Daughter();
		
		// Father 객체의 메소드 호출 가능. 
		
		// <--- super와 this ---> 
		// super - 부모 객체의 리소스 사용함. 첫 번째 만나는 클래스 블록의 자원을 활용
		// ㄴ 상속 시에만 사용가능
		// this - 상속하지 않아도 사용할 수 있으며 자기 자신을 가리킴.
		// ㄴ 내 전역변수(Local 변수)를 지칭할 때 사용.
	
	}
}
