package com.kwon.ch03project;

public class Ex03_14 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		// "\"�� "�� �ο��ȣ �ȿ��� ����ϵ��� ���ִ� ���������������� ������
		// %b���������ڴ� boolean������ ǥ��
		System.out.printf(" str1==\" abc\" ? %b%n", str1 == "abc");
		//str1 == "abc"�� str1�� ���� �����Ͽ� ���� �����̹Ƿ� ������ ��
		System.out.printf(" str2==\" abc\" ? %b%n", str2 == "abc");
		//str2�� new�� ������ ��ü�̹Ƿ� ==�� �� �ϸ� �ּҷ� �񱳵Ǿ� false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		//e
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

	}

}
