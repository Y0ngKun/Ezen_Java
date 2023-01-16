package com.kwon.ch03project;

public class Ex03_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d + %d = %d%n", a, b, a - b);
		System.out.printf("%d + %d = %d%n", a, b, a * b);
		System.out.printf("%d + %d = %d%n", a, b, a / b);
		System.out.printf("%d + %f = %f%n", a, (float) b, a / (float) b);
		// 피 연산자중 큰 데이터형의 결과를 반환

	}

}
