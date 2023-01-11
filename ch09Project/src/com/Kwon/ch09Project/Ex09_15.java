package com.Kwon.ch09Project;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex09_15 {

	public static void main(String[] args) {
		
		int i = new Integer("100").intValue();
		//문자열을 인자로 받아 Integer객체를 만든 후 intValue()로 int로 변환
		int i2 = Integer.parseInt("100");
		//Integer.parseInt는 int로 반환 
		Integer i3 = Integer.valueOf("100");
		//valueOf는 wrapper 클래스로 반환
		int ix = Integer.valueOf("100");
		//반환된 wrapper클래스인 Integer가 자동으로 int로 변환
		
		
		int i4 = Integer.parseInt("100",2);
		//문자열 100을 2진수로 처리, 결과는 10진수 = 4
		int i5 = Integer.parseInt("100",8);
		//문자열 100을 8진수로 처리, 결과는 10진수 = 64
		int i6 = Integer.parseInt("100",16);
		//문자열 100을 16진수로 처리, 결과는 10진수 = 256
		int i7 = Integer.parseInt("FF",16); 
		//문자열 FF를 16진수로 처리, 결과는 10진수 = 255
		//16 * 15 + 15
		
		//int i8 = Integer.parseInt("FF"); //NumberFormatException 예외 발생
		//Integer.parseInt("FF")는 10진수인데 10진수에는 FF없어서 에러
		
		Integer i9 = Integer.valueOf("100",2);
		//문자열 100을 2진수로 처리, 결과는 10진수 = 4
		Integer i10 = Integer.valueOf("100",8);
		//문자열 100을 8진수로 처리, 결과는 10진수 = 64
		Integer i11 = Integer.valueOf("100",16);
		//문자열 100을 16진수로 처리, 결과는 10진수 = 256
		Integer i12 = Integer.valueOf("FF",16);
		//문자열 FF를 16진수로 처리, 결과는 10진수 = 255
		//Integer i13 = Integer.valueOf("FF"); 
		//10진수인데 10진수에는 FF없어서 NumberFormatException 예외 발생
		
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println("100(2) -> " + i4);
		System.out.println("100(8) -> " + i5);
		System.out.println("100(16) -> " + i6);
		System.out.println("FF(16) -> " + i7);
		
		
		System.out.println("100(2) -> " + i9);
		System.out.println("100(8) -> " + i10);
		System.out.println("100(16) -> " + i11);
		System.out.println("FF(16) -> " + i12);
	
	
	}

}
