package com.Kwon.ch09Project;

import static java.lang.Math.*;
import static java.lang.System.*;


public class Ex09_13 {

	public static void main(String[] args) {
		
		double val = 90.7552;
		out.println("round("+ val +")=" + round(val));
		//System과 Math 모두 생략하고 사용
		//long round(double d)으로 처리 - 소수점 첫자리에서 반올림한 long형 정수
		
		val *= 100; //== val = val * 100;
		System.out.println(val);
		out.println("round("+ val +")=" + round(val));
		//소수점 3째 자리에서 반올림
		out.println("round("+ val +")/100 =" + round(val)/100);
		//100으로 쓰면 정수형 기본 값인 long형으로 나누기
		out.println("round("+ val +")/100.0 =" + round(val)/100.0);
		//100.0으로 써서 소수점 기본값인 double형으로 나누기
		System.out.println();
		System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
		//double java.lang.Math.ceil(double a)은 double을 받아서 무조건 올림한 double형 반환
		System.out.println("floor()메서드는 무조건 내림" + floor(1.5));
		System.out.println("rint메서드는 가장 가까운 double형 값을 반환하나 정중앙 값인 .5는"+"짝수값을 반환"+rint(1.5));
		
		//음수처리
		System.out.println("음수의 처리는 가까운 음수로 반올림 -1.6 : " + round(-1.6));
		System.out.println("음수의 처리는 가까운 음수로 반올림 -1.6 : " + round(-1.3));
		System.out.println("음수의 처리는 가까운 음수로 반올림 -1.6 : " + round(-1.5));
		System.out.println("음수의 처리는 가까운 음수로 반올림 -1.6 : " + ceil(-1.5));
		System.out.println("음수의 처리는 가까운 음수로 반올림 -1.6 : " + floor(-1.5));
		

	}//main method;
}//main class;
