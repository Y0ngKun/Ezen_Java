package com.Kwon.ch09Project;

public class Ex09_08 {
	public static void main(String[] args) {
		
		char[] cArr = new char[0];
		//char[] cArr = {}; 과 같다
		
		String s = new String(cArr);
		//String 생성자 중에서 char[]을 인자로 사용하는 메서드 사용
		String s1 = new String("");
		String s2 = "";
		String s3 = "";
		System.out.println("cArr.length= " + cArr.length);
		System.out.println("@@@"+s+"@@@");
		
		System.out.println("s와 s1의 값비교(주소x) : " + s.equals(s1));
		System.out.println("s1와 s2의 값비교(주소x) : " + s1.equals(s2));
		System.out.println("s2와 s3의 값비교 (주소x): " + s2.equals(s3));
	
		//문자열의 값이 없는 초기화는 null보다 리터럴 ""을 사용 권장
		//char의 값이 없는 초기화도 null인 \u0000보다 ' '(공백) 사용 권장
	}
}
