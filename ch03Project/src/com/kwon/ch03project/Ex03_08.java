package com.kwon.ch03project;

public class Ex03_08 {

	public static void main(String[] args) {
		// byte의 범위는 -128~0~127
		byte a = 10;
		byte b = 30;
		int c = a + b; // 바이트인 a와 b는 연산전 int로 변환되고 결과도 int
		byte c1 = (byte) c;
		byte c2 = (byte)(a*b);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2); //byte로 출력은 되지만 값 오버플로우

	}

}
