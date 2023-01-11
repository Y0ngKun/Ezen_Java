package com.Kwon.ch09Project;

public class Ex09_11 {

	public static void main(String[] args) {
		
		//StringBuffer는 Java.lang에 있는 기본 클래스이다.
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//생성자중에 파라메터로 문자열을 사용하는 생성자(문자열 + 16문자 수용가능 char[]배열 생성]
		//StringBuffer sb1 = "abc"; 불가하다 StringBuffer는 리터럴로 객체 생성 불가
		
		//==은 참조형에서는 주소 비교
		
		System.out.println("sb == sb2 ? " + (sb==sb2));
		System.out.println("sb.equals(sb2) ? "+sb.equals(sb2));
		
		//StringBuffer의 내용을 String으로 변환하여 equals()로 비교.
		//toString()은 equals()가 재정의가 되어 있어서 문자열을 출력, equals()로 비교가능
		
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("sb == sb2 ? " + (s==s2));//주소값 비교가 되서 false 나옴
		System.out.println("s.equals(s2) ? "+s.equals(s2));
		
		
		
		StringBuffer k = new StringBuffer(1232132132);
		
		
	}

}
