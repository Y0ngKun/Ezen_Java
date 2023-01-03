package com.Kwon.ch07Project;

public class Point {
	int x,y;
	
	
	//생성자는 클래스명이랑 똑같이 해야하고,리턴타입이 없다.
	//생성자가 하나 명시적으로 만들어져서 기본형 생성자는 없어짐
	//public은 생략가능하나 타 클래스에서 접근이 용이해야하므로 권고사항으로 붙여준다.
	public Point (int x, int y){
		
		//상위클래스인 Object의 생성자 super();
		//super(); --> super()를 생략해도 컴파일시 자동생성한다.
		this.x = x;
		this.y = y;
		
	}
}
