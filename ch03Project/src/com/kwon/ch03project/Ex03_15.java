package com.kwon.ch03project;

import java.util.Scanner;
//자바 기본클래스인 java.lang 패키지와 개발자가 만든 동일한 패키지에 없는 클래스는 import해서 사용

public class Ex03_15 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' '; //char의 기본값은 ' '으로(공백) 해준다.
		
		System.out.print("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0'<= ch && ch <= '9') {
			//if의 ()에는 boolean을 반환하는 연산식이 들어가고 , true이면
			//{}안으로 들어가서 처리를 하고 false이면 {}안으로 못들어간다.
			System.out.printf("입력하신 문자는 숫자입니다%n");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
				}
		
		
		
	}//main

}//class
