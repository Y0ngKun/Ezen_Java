package com.Kwon.ch06Project;

class MyMath2{
	long a, b;//인스턴스 변수(글로벌 변수로 클래스내에서 어디서나 사용가능)
	
	//리턴 타입이 long형, 파라메타 없음
	//인스턴스 메서드는 인스턴스 멤버나 static멤버
	long add() { return a+b;} //a,b는 인스턴스 변수 사용하므로 인스턴스 메서드
	long subtract() {return a-b;}//a,b는 인스턴스 변수 사용하므로 인스턴스 메서드
	long multply() {return a*b;}//a,b는 인스턴스 변수 사용하므로 인스턴스 메서드
	long divide() {return a/b;}//a,b는 인스턴스 변수 사용하므로 인스턴스 메서드
	
	//인스턴스 변수나 메서드를 호출하지 않는 경우에는 static으로 정의
	static long add(long a, long b) {return a+b;} 
	//이 때 a,b는 맨위에 인스턴스 변수 a,b가 아니라 전달 받은 인자 값;
	static long subtract(long a, long b) {return a-b;}
	//이 때 a,b는 맨위에 인스턴스 변수 a,b가 아니라 전달 받은 인자 값;
	static long multply(long a, long b) {return a*b;}
	//이 때 a,b는 맨위에 인스턴스 변수 a,b가 아니라 전달 받은 인자 값;
	static double divide(long a, long b) {return a/(double)b;}
	//이 때 a,b는 맨위에 인스턴스 변수 a,b가 아니라 전달 받은 인자 값;

}//class MyMath;

public class Ex06_09 {

	public static void main(String[] args) {
		
	//static 메서드 호출
		System.out.println(MyMath2.add(200L,200L));
		System.out.println(MyMath2.subtract(200L,200L));
		System.out.println(MyMath2.multply(200L,200L));
		System.out.println(MyMath2.divide(200L,200L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.a = 200L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multply());
		
	

	}//main;;

}//Class Ex06_09;
