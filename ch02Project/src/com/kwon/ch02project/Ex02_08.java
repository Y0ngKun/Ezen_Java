package com.kwon.ch02project;

public class Ex02_08 {

	public static void main(String[] args) {
		int x = 10 , y = 5; //���������� ���� ��쿡 ���ٿ� �ۼ�
		//int x = 10;
		//int y = 5;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int tmp = x;
		x = y; //x���� y����
		y = tmp; //y���� ���� x���� ���� tmp ����
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.printf("[%03d]%n", 10);
		System.out.printf("d=%14.10f%n", x);
		System.out.printf("d=%14.10f%n", y);
		
		
				

	}

}
