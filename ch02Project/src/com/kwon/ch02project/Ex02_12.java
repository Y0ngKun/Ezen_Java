package com.kwon.ch02project;

public class Ex02_12 {
	
	public static void main(String[] args) {
		
		//������ ����ȯ

		String str = "1255"; // ���� 3�� ���ڿ��� ó��
		char c0 = str.charAt(0); //charAt(���ι�ȣ)�� ���������� ���ι�ȣ�� ����Ű�� ���ڸ� ��ȯ
		int c1 = c0 - '0' ; //���� - ���ڴ� int�� ��ȯ
		char c2 = (char)c1; // int c1�� char�� ����ȯ (��� ����ȯ)
		int c3 = c2; //char���� int�� ����ȯ Ȯ�� ����ȯ���� ĳ���� ����
		
		System.out.println(c0);
		System.out.println(c1);
		System.out.println(str.charAt(2)-'0'); //��Ʈ ���� ��ȯ
		System.out.println('3'-'0'+ 1); //3 + 1 = 4
		System.out.println(Integer.parseInt("3")+1);
		//Java.lang.Integer.parseInt(������ String)�� ������ ��ȯ
		System.out.println("3"+ 1);//���ڿ� + ���ڴ� ���ڿ��� ����  = 31
		System.out.println(3 + '2'); //���� + ���ڴ� ������ �ڵ��� int ��ȯ�Ͽ� ���, '0'�� 48 1�� 49 2�� 50 .....
		System.out.println(c3); //���� + ���ڴ� ������ �ڵ��� int ��ȯ�Ͽ� ���, '0'�� 48
		
		 
	}

}
