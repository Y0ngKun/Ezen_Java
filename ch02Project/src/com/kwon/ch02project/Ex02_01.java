package com.kwon.ch02project; //패키지가 제일 위에 옴

public class Ex02_01 { // 블록의 시작을 나타내는 중괄호 { <<
	// 블록은 자바의 코드를 작성하는 부분
	// 영역을 나타냄
	// Class 블록, 메서드 블록, 일반 블록이 있다.

	// 자바는 프로그램 시작을 main 메서드에서 시작!
	public static void main(String[] args) {
		System.out.println("Hello World");// ln= new line , 문자열을 출력하고 줄바꿈 문자열은 인용부호 ""사이에 작성
		System.out.print("HEllo");
		System.out.println("World");

		System.out.println("3 + 5");// ""안에 있으므로 문자열
		System.out.println(3 + 5);// ""가 없으므로 계산해서(사칙연산) 계산식이 나옴.

		int x = 5;
		System.out.println("X = " + 5);

		// 사칙 연산 출력
		System.out.println(5 + 3); // 연산자 앞뒤로는 한 칸씩 띄어주는 게 보기 좋다.
		System.out.println(5 - 3); // 연산자 앞뒤로는 한 칸씩 띄어주는 게 보기 좋다.
		System.out.println(5 * 3); // 연산자 앞뒤로는 한 칸씩 띄어주는 게 보기 좋다.
		System.out.println(5 / 3); // 나누기 연산의 기본값은 정수이다. 소수점 생략

	}

} // 블록의 끝을 나타내는 중괄호 } <<