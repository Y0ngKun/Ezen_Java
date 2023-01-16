package com.kwon.ch03project;

public class Ex03_14 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		// "\"는 "을 인용부호 안에서 사용하도록 해주는 에스케이프시퀀스 문자임
		// %b포맷지시자는 boolean값으로 표시
		System.out.printf(" str1==\" abc\" ? %b%n", str1 == "abc");
		//str1 == "abc"는 str1이 값을 대입하여 만든 변수이므로 값으로 비교
		System.out.printf(" str2==\" abc\" ? %b%n", str2 == "abc");
		//str2는 new로 생성한 객체이므로 ==로 비교 하면 주소로 비교되어 false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		//e
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

	}

}
