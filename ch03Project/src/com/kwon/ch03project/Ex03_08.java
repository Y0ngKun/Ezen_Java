package com.kwon.ch03project;

public class Ex03_08 {

	public static void main(String[] args) {
		// byte�� ������ -128~0~127
		byte a = 10;
		byte b = 30;
		int c = a + b; // ����Ʈ�� a�� b�� ������ int�� ��ȯ�ǰ� ����� int
		byte c1 = (byte) c;
		byte c2 = (byte)(a*b);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2); //byte�� ����� ������ �� �����÷ο�

	}

}
