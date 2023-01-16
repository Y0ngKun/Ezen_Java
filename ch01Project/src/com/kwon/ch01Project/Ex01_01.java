package com.kwon.ch01Project;

public class Ex01_01 {// 클래스 이름 Ex01_01은 자바파일의 이름과 동일
	// 은 한 줄 주석
	/*
	 * 여러줄에 걸 친 주석
	 * 
	 */
	// /** 내용은 * / 문서화 할시에 사용하는 주석

	public static void main(String[] args) {
		System.out.println("Hello World");// 메서드 실행문으로 끝에 ;이 있어야한다.
		int x = 1; // 변수 x를 만들고 값을 1을 대입한다는 실행문으로 끝에 ;이 있어야 한다.
		int y = 2; // 보통 실행문은 한 줄에 하나씩만 쓰지만 두 개 이상 사용해도 무방.
		double k = 0.6; //실수형은 float와 double
		var result = x + y + k;
		int result2 = y + (int) Math.round(k); // 소수점 반올림하여 덧셈

		System.out.println(result); // sysout까지 쓰고 ctrl+space으로 자동완성
		System.out.println("Hello");
		System.out.println(k);
		System.out.println(result2);
		System.out.println("1");
	}

}
