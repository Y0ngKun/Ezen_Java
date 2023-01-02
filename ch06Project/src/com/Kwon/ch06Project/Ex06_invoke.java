package com.Kwon.ch06Project;

class TestClass{
	//동일 클래스에서 메소드 호출
	
	int iv;//인스턴스 변수
	static int sv;//클래스 변수
	void instanceMethod() {
		//인스턴스 메소드안에서는 동일 클래스의 인스턴스 변수나 클래스 변수 모두 변수 이름만으로 접근
		iv =10;
		sv = 20;
	}//인스턴스메소드
	static void staticMethod() {
//		iv = 15; //클래스 메소드 안에서는 인스턴스 변수는 이름으로 접근 불가
		TestClass tc = new TestClass();
		tc.iv = 15;
		sv = 20;
	}
	
	//========================
	void instanceMethod2() {//인스턴스 메소드
		instanceMethod();//인스턴스 메소드안에서 동일 클래스 인스턴스 메소드 메소드 이름으로 호출 가능
		staticMethod(); //인스턴스 메소드안에서 동일 클래스 인스턴스 메소드 메소드 이름으로 호출 가능
	}
	//========================
	static void staticMethod2() {//클래스(스태틱)메소드
		//instanceMethod(); 클래스메소드내에서 동일 클래스 인스턴스메소드는 메소드 이름으로 호출 불가
		TestClass tc = new TestClass();
		tc.instanceMethod();//객체를 만들어서 사용 가능
		staticMethod();	
	}
	
}//TestClass;

public class Ex06_invoke {

	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		tc.instanceMethod2();// 다른 클래스 인스턴스 메소드는 객체 생성 후 사용
		
		TestClass.staticMethod2();// 다른 클래스 클래스(스태틱)메소드는 클래스메소드이름.()로 바로 사용 가능
		

	}//main;

}//pb class;
