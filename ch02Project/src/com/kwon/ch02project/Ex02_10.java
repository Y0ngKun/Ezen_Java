package com.kwon.ch02project;

import java.util.Scanner;

public class Ex02_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Scanner Ŭ������ java.lang��Ű���� �ִ� Ŭ������ �ƴϹǷ� import�Ѵ�.
		//System�̳� String Ŭ������ �ڹ��� �⺻ ��Ű���� Java.lang�� �־� import ���ص� ��.
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		//�Է� �������ϴ� �Է��� ������(����) �Էµ� ���� ��ȯ
		int num = Integer.parseInt(input);
		
		System.out.println("�Է� ����:" + input);
		System.out.printf("num=%d%n",  num); //10�� ������ ���
	
		
		
	}

}
