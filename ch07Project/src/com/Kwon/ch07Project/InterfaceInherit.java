package com.Kwon.ch07Project;

public interface InterfaceInherit extends Moveable,Attackable {
	//클래스간의 상속은 1개만 가능하지만 인터페이스는 다중 상속이 가능하다
	//상속한 추상 메서드 2개를 갖는 인터페이스
}

interface Moveable{
	//interface 내부니까 
	/*public abstract가 생략되어있음*/void move(int x, int y);
	
	
}
interface Attackable{
	void attack();
}