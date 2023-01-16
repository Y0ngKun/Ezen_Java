package com.kwon.ch04project;

public class Ex04_01 {

	public static void main(String[] args) {
		int score = 60;

		// if문의 ( )안에는 비교 연산이나 논리 연산처럼 boolean값을 반환해야한다.
		// 괄호 = () 안의 연산결과가 true 이면 {} 안으로 진입하여 코드를 실행

		 if (score >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}//if end

	}//main
	

}//public class
