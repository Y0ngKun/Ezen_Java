package com.kwon.ch03project;

import javax.management.remote.SubjectDelegationPermission;

public class Ex03_Quiz {

	public static void main(String[] args) {
		int x =10;
		int y =5;
		System.out.println(x==y);
		System.out.println(x!=y);
		String str1 ="abcde";
		System.out.println(str1==null);
		System.out.println(str1=="xyz");
		System.out.println(str1.equals("xyz"));
		
		String str2 = new String("abcde"); 
		/* str1과 str2는 값은 같은데 주소가다름
		 * 참조변수인 String의 변수 값에는 주소가 저장된다
		 * 
		 */
		System.out.println(str1==str2); //참조형 비교시 주소가 비교됨
		System.out.println(str1.equals(str2));
		
		String str3 = "abcde";
		System.out.println(str1==str3);
		//리터럴로 만든 String 객체는 값이 같으면 주소가 같음
		//대소문자 무시하고 동등 비교는 equlsIgnorecase(str)
		
		
		
	
	}
}
