package com.Kwon.ch07Project;

public class Outer { //extends가 없으므로 실제는 Object상속
	
	
	int iv = 0; //클래스의 인스턴스형 멤버 변수
	static int cv = 0; //클래스의 클래스형(static) 멤버 변수
	
	void myMethod() {//인스턴스형 멤버 메서드
		int x = 0; //인스턴스형 멤버 메서드의 로컬변수 
		
		//메서드나 초기화 블록안에 클래스는 "로컬클래스"
		class LocalClass{}
	}
	static void mySmethod() { //클래스형 멤버 메서드
		int y = 0;
		
	}
	
	public Outer(){ //생성자
		super();//Object의 생성자 호출
	}
	
	//내부 클래스도 클래스의 멤버인 멤버변수,멤버메서드,생성자처럼 처리
	//내부 클래스도 멤버이므로 인스턴스형,클래스형 2가지 종류의 클래스가 존재한다
	private class InstanceInner{ //인스턴스형 내부 클래스
		//접근제어자로는 멤버변수나 메서드처럼 public,private,default,protected 4가지 사용가능
		//일반제어자로는클래스에 사용하는 abstract,final 사용가능
	}
	
	static class StaticInner{ //클래스형 내부 클래스
		
	}
}//class Outer;
