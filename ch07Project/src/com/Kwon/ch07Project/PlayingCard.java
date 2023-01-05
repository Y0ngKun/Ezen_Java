package com.Kwon.ch07Project;

public interface PlayingCard {
	//인터페이스는 상수와 추상메서드로만 만들 수 있다
	public static final int SPADE = 4;
	//인터페이스 안에 상수는 public static final을 생략하거나 일부 생략가능하다
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	//인터페이스안의 추상메서드는 접근제어자가 public이어야함 (추상class는 아니어도 됨)
	//추상메서드는 {}구현부 생략해야함
	public abstract String getCardNumber();
	//인터페이스 안에서는 public abstract은 생략이 가능하다
	String getCardKind();
	
}
