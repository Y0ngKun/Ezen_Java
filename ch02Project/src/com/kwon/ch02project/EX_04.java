package com.kwon.ch02project;

public class EX_04 {

	public static void main(String[] args) {
		//변수 선언
		int x = 5; //변수 x를 선언과 동시에 초기값 5를 대입
		System.out.println(x);
		
		//변수는 값을 변경 사용이 가능
		//한번 만들어진 변수는 다시 선언 할 수 없음.
		//만들어진 변수 사용시는 그냥 변수 이름으로 사용 "" 사용 안 함.
		x = 10; 
		System.out.println(x);
		
		int y = 5; // 새로운 변수 y
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		//변수를 이용한 수식을 사용하면 변수 값이 변경되더라도 수식은 수정 안해도 됨
		
		

	}

}
