package com.kwon.ch02project;

public class Ex02_06 {

	public static void main(String[] args) {
		
		int x = 100; // 4바이트 정수 변수, long은 8바이트
		final int y = 200; //상수, 변경 불가능
		double PIE = 3.14; // 8바이트 32비트 약 40억개값
		double z = 2; // 2.0으로 나옴
		char ch = 'a'; //문자열은 2바이트
		String str = "abc,def"; // 4바이트 string데이터는 기본형이 아니므로 <참조형>, string은 ""안에 써준다.
		
		short law = -32768;
	    long kk = -3;
	    float jj = 3.0e8F;
	    double ii = 3.08;
	    
	    String name =  "Ja" + "va"; 
	   System.out.println(name);
	   System.out.printf("age:%d year:%d\n, 14, 2017");
	   
	    
	}

}
