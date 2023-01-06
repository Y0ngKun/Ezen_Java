package com.Kwon.ch07Project;

public class Ex07_14 {
	private int outerIv = 0; //Ex07_14 클래스 안에서만 사용
	static int outerCv = 0; //접근제어자가 없으므로 (default) 내 패키지 안에서는 어디서나 사용가능
	class InstanceInner{//인스턴스형 내부 클래스는 부모클래스의 멤버이므로 다른 멤버 사용가능
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	static class StaticInner{//클래스형 내부클래스
		//static은 static멤버 그대로 사용하나 인스턴스멤버는 외부객체를 만들어 사용
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0;//메서드의 변수로 로컬 변수
		final int LV = 0; 
		//메서드의 변수로 로컬변수인데 Local클래스에서 사용을 위해 final사용(자바8부터 생략 가능)
		
		//myMethod()안에 로컬 클래스
		class LocalInner{
			//외부클래스 멤버는 모두 사용 가능
			int iiv = outerIv;
			int iiv2 = outerCv;
			int iiv3 = lv;
			int iiv4 = LV;//자바8 이전에는 final이 붙은 지역변수만 사용 가능하나 지금은 final생략
		
		}
		
	}
	
	public static void main(String[] args) {}

}
