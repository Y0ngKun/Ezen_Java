package com.kwon.ch03project;

public class Ex03_03 {
	public static void main(String[] args) {
		int i = 5, j = 5;
		System.out.println(i++); //후위 증가 연산자 (선처리, 후증가)	
		System.out.println(++j); //전위 증가 연산자 (선증가, 후처리)
		System.out.println("i = " + i + ", j = " + j);
		
		i = 5;
		j = 5;
		
		System.out.println(i--); //후위 증가 연산자 (선처리, 후증가)	
		System.out.println(--j); //전위 증가 연산자 (선증가, 후처리)
		System.out.println("i = " + i + ", j = " + j);
			
	}

}
