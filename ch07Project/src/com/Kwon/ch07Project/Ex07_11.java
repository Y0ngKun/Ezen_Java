package com.Kwon.ch07Project;

public class Ex07_11 {

	public static void main(String[] args) {
		ChildEx0711 c = new ChildEx0711();
		c.method1();//�������̽��� default method1�� �浹�� �Ͼ ChildEx0711Ŭ�������� �������� �޼��带 ���
		c.method2();//ChildEx0711�� ���� Ŭ������ ParentEx0711�� mymethod2�� ����Ѵ�
		
		//static �޼ҵ�� �������̽� �̸����� ����
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
		//���� �߻� �޼��� ȣ��
		c.absMethod1();
		

	}

}

class ParentEx0711{
	public void method2() {
		System.out.println("Method2() in ParentEx0711");
	}
}


class ChildEx0711 extends ParentEx0711 implements MyInterface,MyInterface2{
	//������ �������̽��� default�޼��尣�� �浹 MyInterface,MyInterface2�� method1)
	@Override
	public void method1() {
		System.out.println("method1() in ChildEx0711");
	}
	
	//����� �޼��� method2�� �������̽��� default �޼��� method2�� �浹�ô�
	//������ �޼��� ����
	
	//�߻�޼��� ����
	@Override
	public void absMethod1() {
		System.out.println("�߻�޼ҵ� ����");
	}
}



interface MyInterface{
	//�߻�޼��尡 ���� �������̽�
	//�������̽��� �޼���� public(���� ����)
	//default�޼���� static �޼��带 jdk1.8���� �߰��� ������ �������̽� ������ ���� �ϱ����ؼ�
	//�߻�޼��带 �߰��ϸ� �̸� ������ ��� Ŭ������ �߻�޼��带 �����ϴ� �������� �߱�
	
	default void method1() {
		//�Ϲ� �ν��Ͻ��޼ҵ忡 {}�� �� ���� �ݵ�� default�� �ٿ����Ѵ�
		System.out.println("method1() in MyInterface");
	}//method1;
	
	default void method2() {
		//�Ϲ� �ν��Ͻ��޼ҵ忡 {}�� �� ���� �ݵ�� default�� �ٿ����Ѵ�
		System.out.println("method2() in MyInterface");
	}//method1;
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	};

}

interface MyInterface2{
	//�߻�޼��尡 ���� �������̽�
	//�������̽��� �޼���� public(���� ����)
	//default�޼���� static �޼��带 jdk1.8���� �߰��� ������ �������̽� ������ ���� �ϱ����ؼ�
	//�߻�޼��带 �߰��ϸ� �̸� ������ ��� Ŭ������ �߻�޼��带 �����ϴ� �������� �߱�
	
	default void method1() {
		//�Ϲ� �ν��Ͻ��޼ҵ忡 {}�� �� ���� �ݵ�� default�� �ٿ����Ѵ�
		System.out.println("method1() in MyInterface2");
	}//method1;
	default void method2() {
		//�Ϲ� �ν��Ͻ��޼ҵ忡 {}�� �� ���� �ݵ�� default�� �ٿ����Ѵ�
		System.out.println("method2() in MyInterface2");
	}//method1;
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
	
	public abstract void absMethod1();

}

