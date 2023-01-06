package com.Kwon.ch07Project;


public class Ex07_12 {
	
	//인스턴스형 내부 클래스
	class InstanceInner{
		int iv = 178;
//		static int cv = 200; //jdk 버전에 따라서 못쓸 수도 있다.
		final static int CONST = 100;//상수는 인스턴스 내부클래스에서도 사용가능
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 250; //static 클래스안에서는 static 멤버변수 사용가능
		final static int CONST = 150;
	}
	
	void myMethod() {
		class LocalInner{
			int iv =300;
//			static int cv = 270;//jdk 버전에 따라서 못쓸 수도 있다
			final static int CONST = 170;
			}
		}
	
	public static void main(String[] args) {
		Ex07_12 dee1 = new Ex07_12(); // 이 두 개념 중요
		InstanceInner dee = dee1.new InstanceInner(); // 이 두 개념 중요
		
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
	
		System.out.println(dee.iv);
		
		//클래스형 내부 클래ㅅ이지만 인스턴스 변수는 클래스 이름으로 접근 불가
		
	
		
	}

}
