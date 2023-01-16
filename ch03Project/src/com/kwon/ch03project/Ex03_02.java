package com.kwon.ch03project;
//증감 연산자

public class Ex03_02 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++; //후위 증가 연산자로 선처리 후 증가;
		
		
System.out.println("j = i++; 실행후, i = " + i + ", j= " +j );
		i = 5; 
		j = 0;
		
		j = ++i;
		System.out.println("j = i++; 실행후, i = " + i + ", j= " +j );
		
		
	}

}
