package com.kwon.ch02project;

public class EX02_07 {
	public static void main(String[] args) {
		String name = "Ja" + "va"; // +는 문자열 결합 연산자
		String str = name + 8.0;
		// name은 String형 변수이고 저장된 값이 "Java"
		// 8.0은 소수점이 있는 숫자로 자바에서는 소수점 기본이 double형
		// double형이므로 8바이트 리터럴
		// name + 8.0은 문자열 + 숫자는 = 문자열 + 문자열
		System.out.println(name);
		System.out.println(7 + "");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println("" + 7 + 7);
		System.out.println(7 + 7 + "7");

		

	}
}
