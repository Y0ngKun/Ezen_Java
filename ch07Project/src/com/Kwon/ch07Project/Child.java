package com.Kwon.ch07Project;

public class Child extends Parent {
	int x = 20;//상속한 Parent에도 int x 변수가 있어 상위 클래스 x는 가려져서 안보임
	void method() {
		System.out.println("x = "+ x );
		System.out.println("this.x = "+ this.x );
		//this는 자기 객체이므로 x는 자기 클래스의 x
		System.out.println("super.x = "+ super.x );
		//super는 상속받은 클래스(Parent)의 x
	}
	

}

//클래스 이름인 Child로 된 생성자 없음, 즉 기본 생성자만 있다.
