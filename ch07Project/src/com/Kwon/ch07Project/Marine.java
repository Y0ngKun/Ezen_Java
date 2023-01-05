package com.Kwon.ch07Project;

//이클립스 SuperClass를 추상클래스를 브라우징해서 만들면 자동으로 블록안의 코드가 없는 추상메서드가 구현됨 
public class Marine extends Unit {
	//추상클래스를 상속한 클래스는 추상클래스의 모든 추상메서드를 구현(재정의)해야한다.
	//만일 하나라도 안하면 에러이고 추상클래스로 사용해야함
	//내용이 없는 추상메서드 구현도 구현된것으로 처리

	@Override//상위 클래스의 내용을 재정의
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y = "+ y + "]");
	}
	void stimPack() {System.out.println("스팀팩 사용");}

	
}
