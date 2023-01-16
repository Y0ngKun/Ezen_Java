package com.kwon.ch02project;

public class Ex02_08 {

	public static void main(String[] args) {
		int x = 10 , y = 5; //데이터형이 같은 경우에 한줄에 작성
		//int x = 10;
		//int y = 5;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int tmp = x;
		x = y; //x값에 y대입
		y = tmp; //y값에 원래 x값이 였던 tmp 대입
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.printf("[%03d]%n", 10);
		System.out.printf("d=%14.10f%n", x);
		System.out.printf("d=%14.10f%n", y);
		
		
				

	}

}
