package com.Kwon.ch07Project;

public class Child extends Parent {
	int x = 20;//����� Parent���� int x ������ �־� ���� Ŭ���� x�� �������� �Ⱥ���
	void method() {
		System.out.println("x = "+ x );
		System.out.println("this.x = "+ this.x );
		//this�� �ڱ� ��ü�̹Ƿ� x�� �ڱ� Ŭ������ x
		System.out.println("super.x = "+ super.x );
		//super�� ��ӹ��� Ŭ����(Parent)�� x
	}
	

}

//Ŭ���� �̸��� Child�� �� ������ ����, �� �⺻ �����ڸ� �ִ�.
