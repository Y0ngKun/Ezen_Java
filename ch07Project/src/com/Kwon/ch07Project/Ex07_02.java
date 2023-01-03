package com.Kwon.ch07Project;

public class Ex07_02 { //상속받은 클래스가 안보임으로 Java 최상위 클래스인 Object를 상속받았으나 생략함)

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
		
		System.out.println("줄바꿈입니다");
		
		Child2 c2 = new Child2();
		c2.method();

	}//main method

}//main class
