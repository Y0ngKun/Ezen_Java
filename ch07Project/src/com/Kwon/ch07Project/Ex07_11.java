package com.Kwon.ch07Project;

public class Ex07_11 {

	public static void main(String[] args) {
		ChildEx0711 c = new ChildEx0711();
		c.method1();//인터페이스의 default method1이 충돌이 일어나 ChildEx0711클래스에서 재정의한 메서드를 사용
		c.method2();//ChildEx0711의 조상 클래스인 ParentEx0711의 mymethod2를 사용한다
		
		//static 메소드는 인터페이스 이름으로 접근
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
		//구현 추상 메서드 호출
		c.absMethod1();
		

	}

}

class ParentEx0711{
	public void method2() {
		System.out.println("Method2() in ParentEx0711");
	}
}


class ChildEx0711 extends ParentEx0711 implements MyInterface,MyInterface2{
	//구현한 인터페이스의 default메서드간에 충돌 MyInterface,MyInterface2의 method1)
	@Override
	public void method1() {
		System.out.println("method1() in ChildEx0711");
	}
	
	//상속한 메서드 method2가 인터페이스의 default 메서드 method2와 충돌시는
	//조상의 메서드 선택
	
	//추상메서드 구현
	@Override
	public void absMethod1() {
		System.out.println("추상메소드 구현");
	}
}



interface MyInterface{
	//추상메서드가 없는 인터페이스
	//인터페이스의 메서드는 public(생략 가능)
	//default메서드와 static 메서드를 jdk1.8에서 추가한 이유는 인터페이스 수정을 쉽게 하기위해서
	//추상메서드를 추가하면 이를 구현한 모든 클래스에 추상메서드를 구현하는 불편함을 야기
	
	default void method1() {
		//일반 인스턴스메소드에 {}을 쓸 때는 반드시 default를 붙여야한다
		System.out.println("method1() in MyInterface");
	}//method1;
	
	default void method2() {
		//일반 인스턴스메소드에 {}을 쓸 때는 반드시 default를 붙여야한다
		System.out.println("method2() in MyInterface");
	}//method1;
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	};

}

interface MyInterface2{
	//추상메서드가 없는 인터페이스
	//인터페이스의 메서드는 public(생략 가능)
	//default메서드와 static 메서드를 jdk1.8에서 추가한 이유는 인터페이스 수정을 쉽게 하기위해서
	//추상메서드를 추가하면 이를 구현한 모든 클래스에 추상메서드를 구현하는 불편함을 야기
	
	default void method1() {
		//일반 인스턴스메소드에 {}을 쓸 때는 반드시 default를 붙여야한다
		System.out.println("method1() in MyInterface2");
	}//method1;
	default void method2() {
		//일반 인스턴스메소드에 {}을 쓸 때는 반드시 default를 붙여야한다
		System.out.println("method2() in MyInterface2");
	}//method1;
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
	
	public abstract void absMethod1();

}

