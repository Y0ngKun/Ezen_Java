package com.Kwon.ch06Project;

public class Ex06_13 {

	public static void main(String[] args) {
		Car0613_01 c1 = new Car0613_01();
		Car0613_01 c2 = new Car0613_01("dark");

	}//main method;

}//main class;

class Car0613_01{
	String Color;
	String gearType;
	int door;
	
	Car0613_01(){
		this("white");//자기 클래스의 다른 생성자인 파라메터 하나 가진 생성자 호출
	}
	Car0613_01(String Color){ // 파라메타 1개일 때 
		this(Color,"auto",4);//자기 클래스의 다른 생성자인 파라메터 새게 가진 생성자 호출 Color는 받은 파라메타 활용
		
	}
	Car0613_01(String Color,String gearType, int door){ // << 파라메터 3개일 때
		//멤버 변수 이름과 파라메터 이름이 같을시는 멤버변수에 this를 사용구분
		//this는 자기 클래스의 객체
		super();
		//this는 자신 객체를 나타내는 인스턴스 객체로 모든 메서드에서 지역 변수로 존재한다.
		this.Color = Color;
		this.gearType = "auto";
		this.door = door;
	}
	int sum(int a,int b) {return a+b;}
	void call() {this.sum(5, 10);}
	//자기 클래스의 인스턴스 메서드 호출시는 이름으로 호출해도 되나 
	//예를 들면 tins.sum(5,10)말고 sum(5,10)으로 호출 가능
	//모든 메서드에 숨겨진 자신의 인스턴스 객체인 this를 사용해도 무방(권고)
} //class Car0613_01;


class Car0613_02{
	String Color;
	String gearType;
	int door;
	
	//명시적인 생성자가 없음
	//자바 컴파일러가 기본생성자를 추가
}


