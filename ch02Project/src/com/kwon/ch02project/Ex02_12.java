package com.kwon.ch02project;

public class Ex02_12 {
	
	public static void main(String[] args) {
		
		//변수의 형변환

		String str = "1255"; // 숫자 3을 문자열로 처리
		char c0 = str.charAt(0); //charAt(색인번호)는 문지열에서 색인번호가 가르키는 문자를 반환
		int c1 = c0 - '0' ; //문자 - 문자는 int를 반환
		char c2 = (char)c1; // int c1을 char로 형변환 (축소 형변환)
		int c3 = c2; //char에서 int로 형변환 확대 형변환으로 캐스팅 생략
		
		System.out.println(c0);
		System.out.println(c1);
		System.out.println(str.charAt(2)-'0'); //인트 값을 반환
		System.out.println('3'-'0'+ 1); //3 + 1 = 4
		System.out.println(Integer.parseInt("3")+1);
		//Java.lang.Integer.parseInt(숫자형 String)은 정수로 변환
		System.out.println("3"+ 1);//문자열 + 숫자는 문자열로 결합  = 31
		System.out.println(3 + '2'); //숫자 + 문자는 문자의 코드인 int 변환하여 계산, '0'은 48 1은 49 2는 50 .....
		System.out.println(c3); //숫자 + 문자는 문자의 코드인 int 변환하여 계산, '0'은 48
		
		 
	}

}
