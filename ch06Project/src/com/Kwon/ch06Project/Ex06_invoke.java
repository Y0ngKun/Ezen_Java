package com.Kwon.ch06Project;

class TestClass{
	//���� Ŭ�������� �޼ҵ� ȣ��
	
	int iv;//�ν��Ͻ� ����
	static int sv;//Ŭ���� ����
	void instanceMethod() {
		//�ν��Ͻ� �޼ҵ�ȿ����� ���� Ŭ������ �ν��Ͻ� ������ Ŭ���� ���� ��� ���� �̸������� ����
		iv =10;
		sv = 20;
	}//�ν��Ͻ��޼ҵ�
	static void staticMethod() {
//		iv = 15; //Ŭ���� �޼ҵ� �ȿ����� �ν��Ͻ� ������ �̸����� ���� �Ұ�
		TestClass tc = new TestClass();
		tc.iv = 15;
		sv = 20;
	}
	
	//========================
	void instanceMethod2() {//�ν��Ͻ� �޼ҵ�
		instanceMethod();//�ν��Ͻ� �޼ҵ�ȿ��� ���� Ŭ���� �ν��Ͻ� �޼ҵ� �޼ҵ� �̸����� ȣ�� ����
		staticMethod(); //�ν��Ͻ� �޼ҵ�ȿ��� ���� Ŭ���� �ν��Ͻ� �޼ҵ� �޼ҵ� �̸����� ȣ�� ����
	}
	//========================
	static void staticMethod2() {//Ŭ����(����ƽ)�޼ҵ�
		//instanceMethod(); Ŭ�����޼ҵ峻���� ���� Ŭ���� �ν��Ͻ��޼ҵ�� �޼ҵ� �̸����� ȣ�� �Ұ�
		TestClass tc = new TestClass();
		tc.instanceMethod();//��ü�� ���� ��� ����
		staticMethod();	
	}
	
}//TestClass;

public class Ex06_invoke {

	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		tc.instanceMethod2();// �ٸ� Ŭ���� �ν��Ͻ� �޼ҵ�� ��ü ���� �� ���
		
		TestClass.staticMethod2();// �ٸ� Ŭ���� Ŭ����(����ƽ)�޼ҵ�� Ŭ�����޼ҵ��̸�.()�� �ٷ� ��� ����
		

	}//main;

}//pb class;
