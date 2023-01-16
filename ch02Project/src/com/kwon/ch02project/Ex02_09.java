package com.kwon.ch02project;

public class Ex02_09 {
	public static void main(String[] args) {

		String url = "www.codechobo.com";
		float f1 = .10f; // = 0.10 = 1.0E-1
		float f2 = 1E1f; // = 10.0 = 1.0E1 = 1.0E+1 / E =10 E1은 10의 1승
		float f3 = 3.14E3F; // 3140.0 = E = 10 / E3= 10의 3승
		double d = 1.23456789; // 자바에서 소수점리터럴은 기본이 double

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%f%n", d); // f는 소수점 6자리 표시하는데 반올림
		System.out.printf("d=%14.10f%n", d); // 전체 14자리중 소수점 10자리
		// 정수부분자리는 없으면 비워두고 소수점에서 비어있는자리는 0으로 처리
		System.out.printf("[12345678901234567890]%n"); // 출력영역크기 없이 지정하면 값 그대로 출력
		System.out.printf("[%s]%n", url); // 영역크기 없으므로 그대로 출력
		System.out.printf("[%20s]%n", url); // 영역크기를 20으로 주면 오른쪽부터 채움
		System.out.printf("[%8s]%n", url); // 왼쪽에서 8글자만 출력

	}
}
