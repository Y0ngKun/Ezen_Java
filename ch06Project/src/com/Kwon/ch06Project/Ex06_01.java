package com.Kwon.ch06Project;

public class Ex06_01 {

	public static void main(String[] args) {
		
		//클래스(멤버가 인스턴트형이 있을 시)를 사용하려면 객체를 만들어줘야함
		Tv t = 	null; //method 안의 변수 이므로 로컬변수이고 기본값이 없음
		System.out.println(t); //t에는 참조형이므로 주소값임.
		t = new Tv();//객체생성 (인스턴트),t에 주소가 주어짐	

		Tv t1 = new Tv();//t1 객체 생성하고 주소가 주어짐
		System.out.println(t1);
		
		t.channel = 6;
		t1.channel = 7;
		
		
		t.channelDown();
		t.channelUp();
		
		System.out.println(t.channel);
		System.out.println(t1.channel);
		
		
	}

}//public Class

class Tv{
	//class는 멤버 변수와 멤버 method로 구성된다 (특수 method인 생성자를 포함)
	//멤버는 인스턴스형과 static형(클래스형)으로 구분된다.
	//인스턴스형은 객체를 생성해서 사용하고 
	//class 형은 객체를 생성안하고 class 이름으로 사용
	//인스턴스형은 String str; str.charAt(3);
	//class형은 Math.random()
	
	//멤버 변수는 모든 데이터형(기본형,참조형 사용)
	//멤버변수는 전역 변수
	//멤버 변수는 로컬변수와 달리 기본값을 갖는다.
	
	//기본형---
	//숫자형 기본값은 0, 0.0;
	//char은 ' '; (공백);
	//boolean은 false;
	
	//참조형---
	//참조형은 null
	
	String color;
	boolean power;
	int channel;
	
	//멤버 method
	void power() {
		power = !power; // ! = 논리부정연산자, 반대값으로 변경
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		++channel;
	}
	/*특수메서드인 생성자는 명시적으로 없으면 자바컴파일러가 다음 생성자를 추가
	 * public tv(){
	    super();
	 */
}