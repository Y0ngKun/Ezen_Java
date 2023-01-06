package com.Kwon.ch07Project;

//익명의 클래스 만들기
public class Ex07_17 {
	
	//바로 해당 조상 클래스나 인터페이스 참조변수(객체)를 원하는 위치에 만들어 사용

	//인스턴스형 익명 클래스 만들어보기
	Object iv = new Object(){//생성자 뒤에 구현부를 만들어 원래 클래스로 처리할 내용을 작성
		void method() {}		
	};
	
	//클래스형 익명 클래스 만들어보기
	static Object sv = new Object() {
		void method() {}
	};
	
	//메소드형 익명 클래스 만들어보기
	void method() {
		Object iv = new Object() {
			void method() {}
		};
	}//method

}
