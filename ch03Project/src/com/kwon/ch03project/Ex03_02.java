package com.kwon.ch03project;
//���� ������

public class Ex03_02 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++; //���� ���� �����ڷ� ��ó�� �� ����;
		
		
System.out.println("j = i++; ������, i = " + i + ", j= " +j );
		i = 5; 
		j = 0;
		
		j = ++i;
		System.out.println("j = i++; ������, i = " + i + ", j= " +j );
		
		
	}

}
