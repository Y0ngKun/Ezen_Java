package com.kwon.ch02project;

import java.util.Scanner;

public class Ex02_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Scanner 클래스는 java.lang패키지에 있는 클래스가 아니므로 import한다.
		//System이나 String 클래스는 자바의 기본 패키지인 Java.lang에 있어 import 안해도 됨.
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		//입력 대기상태하다 입력이 들어오면(엔터) 입력된 값을 반환
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용:" + input);
		System.out.printf("num=%d%n",  num); //10진 값으로 출력
	
		
		
	}

}
