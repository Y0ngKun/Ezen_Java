package com.Kwon.ch12Project;

import java.util.ArrayList;

public class Ex12_06  {
	public static void main(String[] args) {
		
		for(Direction2 d : Direction2.values()) {
			//enum명.values는 enum명이 가지고 있는 각각의 원소(상수)를 배열로 반환
			System.out.printf("%s=%ds%n",d.name(),d.getValue(),d.getSymbol());
		}
		
		Direction2 d1 = Direction2.EAST;//enum의 각각의 상수를 객채로 처리
		Direction2 d2 = Direction2.SOUTH;//enum의 각각의 상수를 객채로 처리
		
		System.out.printf("%s=%ds%n",d1.name(),d1.getValue(),d1.getSymbol());
		System.out.printf("%s=%ds%n",d2.name(),d2.getValue(),d2.getSymbol());
		
	}//main method;
}//main class;
enum Direction2 {
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	//상수의 값을 별도로 부여시는()안에 부여한다(여기서는 2개 값을 줌)
	//상수 열거후에 ;을 사용
	//괄호안의 첫번째 인자는 value이고, 두번째 인자는 symbol변수를 나타냄
	//괄호안에 2개의 인자를 초기화하는 생성자와 두개의 인자를 나타내는 멤버변수를 만들어주어야한다.
	private final int value;
	private final String symbol;
	
	private Direction2(int value, String symbol) {
		// 접근제어자는 묵시적으로 private이다
		this.value = value;
		this.symbol = symbol;
	}

	//외부에서 멤버변수 접근이 가능토록하는 get메서드 작성
	public int getValue() {
		return value;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String toString() {
		return name() + getSymbol();
	}
	
}//Direction2;

