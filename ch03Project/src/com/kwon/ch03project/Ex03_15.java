package com.kwon.ch03project;

import java.util.Scanner;
//�ڹ� �⺻Ŭ������ java.lang ��Ű���� �����ڰ� ���� ������ ��Ű���� ���� Ŭ������ import�ؼ� ���

public class Ex03_15 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' '; //char�� �⺻���� ' '����(����) ���ش�.
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0'<= ch && ch <= '9') {
			//if�� ()���� boolean�� ��ȯ�ϴ� ������� ���� , true�̸�
			//{}������ ���� ó���� �ϰ� false�̸� {}������ ������.
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�%n");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
				}
		
		
		
	}//main

}//class
