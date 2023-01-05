package com.Kwon.ch07Project;

public abstract class Unit {
	//추상 클래스는 하나 이상의 추상 메서드가 있으면 추상 클래스로 만든다
	//하지만 추상메서드가 하나도 없어도 추상 클래스로 만들 수는 있다.
	//추상메서드가 있다는 것 외에는 일반 메서드와 동일(멤버변수,멤버메서드,생성자등)
	int x,y;
	//일반메서드
	void stop() {System.out.println("Stop");}
	//추상메서드
	abstract void move(int x, int y);
	//추상메서드는 추상을 나타내는 abstract을 붙이고 선언부만 만들고; 종료
	//{}값을 만들면 에러 발생
	
}
