package com.Kwon.ch06Project;

//카드 Class는 카드 한 장 한 장(객체)를 만드는 Class
class Card{
	//클래스 영역에 있으므로 멤버변수
	//static 키워드가 없으므로 인스턴스형 멤버변수
	//카드 무늬와 숫자는 각 카드마다 다르므로 인스턴스형을 쓴다
	String kind;// 카드 무늬
	int number;// 카드 숫자
	
	//카드 크기는 모든 객체(카드)에 공통이므로 static을 쓴다
	static int width = 100; //static 자체는 변수 타입이 아니므로 static + 변수타입을 쓰고 JVM 클래스 로딩시 실행되므로 저장된 값을 바로 줌.
	static int height = 250; 
}