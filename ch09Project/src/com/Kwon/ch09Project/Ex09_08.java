package com.Kwon.ch09Project;

public class Ex09_08 {
	public static void main(String[] args) {
		
		char[] cArr = new char[0];
		//char[] cArr = {}; �� ����
		
		String s = new String(cArr);
		//String ������ �߿��� char[]�� ���ڷ� ����ϴ� �޼��� ���
		String s1 = new String("");
		String s2 = "";
		String s3 = "";
		System.out.println("cArr.length= " + cArr.length);
		System.out.println("@@@"+s+"@@@");
		
		System.out.println("s�� s1�� ����(�ּ�x) : " + s.equals(s1));
		System.out.println("s1�� s2�� ����(�ּ�x) : " + s1.equals(s2));
		System.out.println("s2�� s3�� ���� (�ּ�x): " + s2.equals(s3));
	
		//���ڿ��� ���� ���� �ʱ�ȭ�� null���� ���ͷ� ""�� ��� ����
		//char�� ���� ���� �ʱ�ȭ�� null�� \u0000���� ' '(����) ��� ����
	}
}
