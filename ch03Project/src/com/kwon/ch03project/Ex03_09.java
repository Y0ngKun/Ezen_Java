package com.kwon.ch03project;

public class Ex03_09 {
	public static void main(String[] args) {
		
		int a = 1_000_000;
		int b = 2_000_000;
		long c = a * b; // int �����÷ο� 21�������� ���
		long c1 = (long)a * b;
		
		System.out.println(c);
		System.out.println(c1);
		
	}

}
