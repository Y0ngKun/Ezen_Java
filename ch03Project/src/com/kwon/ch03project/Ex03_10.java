package com.kwon.ch03project;

public class Ex03_10 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		//1_000_000이 int이므로 int*int = int
		long b = 1_000_000 * 1_000_000L;
		//int * long(1_000_000L) = long
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
