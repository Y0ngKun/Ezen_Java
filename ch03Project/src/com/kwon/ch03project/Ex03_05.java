package com.kwon.ch03project;

public class Ex03_05 {

	public static void main(String[] args) {
		double  d= 85.4; //소수점이 있는 실수는 자바 기본값이 double
		int score = (int)d;
		
		System.out.println(d);
		//숫자 범위별로 double > float > long > int
		//큰 데이터형에서 double에서 적은 int로 대입하려면 명시적으로 캐스팅함.
		//실수에서 정수로 변환하면 소수점이하는 무조건 삭제(절사)
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
		
//		System.out.println(d.getClass().getName());
	
		

	}

}
