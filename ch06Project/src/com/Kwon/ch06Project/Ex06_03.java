package com.Kwon.ch06Project;

public class Ex06_03 {

	public static void main(String[] args) {
		
		//Class변수(Static)는 Class.변수명으로 접근
		System.out.println("card.width = " + Card.width);
		System.out.println("card.width = "+ Card.height);
		

		//인스턴트 변수는 객체를 생성하여 객체.변수명으로 접근
		Card c1 = new Card();
		//기본 생성자는 Class에 생성자가 하나도 없을 시에는 컴파일시 자바가 제공
		c1.kind = "spade";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Heart";
		c2.number = 8;
		
		//클래스형도 객체.class형 변수로 접근해도 무방
		System.out.println("c1은 = " + c1.kind + "," + c1.number + "이며");
		System.out.println("c1의 크기는 = " + c1.width + "," + c1.height + "이며");
		System.out.println("c2은 = " + c2.kind + "," + c2.number + "이며");
		System.out.println("c2의 크기는 = " + c2.width + "," + c2.height + "이며");
		
		c1.width = 	50;
		c1.height = 80;
		//width와 height는 공통으로 사용하는 클래스형 변수이므로 c2로 접근하더라도 변경된 값
		
		System.out.println("c2 width = " + c2.width);
		System.out.println("c2 height = " + c2.height);
		
		//하지만 바람직한 방법은 아래와같이 직접 클래스형 클래스.변수로 변경해서 사용할 것
		Card.width = 51;
		Card.height = 81;
		
	}

}
