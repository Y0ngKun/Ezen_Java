package com.kwon.ch03project;

public class Ex03_01 {
	public static void main(String[] args) {
		int x,y;
		/*
		 * int x;
		 * int y;
		 * �� ���ٿ� �ۼ� / ���������� ���� ���� ��� ����!
		 */
		x = y = 3; // =�� ���Կ������̰� �������� �������� ����
		x = ++ y;
		y = x++;
		
		

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
