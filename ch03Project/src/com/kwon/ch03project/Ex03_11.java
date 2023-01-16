package com.kwon.ch03project;

public class Ex03_11 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//괄호안은 double * int --> double형 3141.592
		//Math클래스의 소수점 첫자리에서 반올림하는 round(3141.592)는 3142L을 반환
		//소수점 셋째 자리만 갖는 pi를 double shorPi로 만들기 위해 1000.0으로 나눔
		System.out.println(shortPi);
		
		double pi1 = 3.141592;
		double shortPi1 = Math.round(pi1 * 1000) / 1000f;
		
		System.out.println(shortPi1);
		
		
	}

}
