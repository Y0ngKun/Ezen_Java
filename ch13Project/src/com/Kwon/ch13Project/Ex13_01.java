package com.Kwon.ch13Project;

public class Ex13_01 {
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();//Thread�� ����� Ŭ����(ThreadEx1_1)�� ��ü ����
		ThreadEx1_3 t3 = new ThreadEx1_3();
		ThreadEx1_4 t4 = new ThreadEx1_4();
		
		Runnable r = new ThreadEx1_2();
		
		Thread t2 = new Thread(r);
//		�̷��� �� ���� �ִ� = Thread t2 = new Thread(new ThreadEx1_2());
		
		//thread�� ���� ��Ű���� start()�޼��� ȣ��
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//start()�޼��尡 ȣ��Ǹ� thread�� ���� ��� ���°� ��
		//����Ǵ� ������ OS�� �����층�� ���� �����
		
	}//main method;
}//main class;

//thread�� ����Ϸ��� Thread�� ����ϰų� Runnable �������̽��� ������ Ŭ������ ��ä�θ� ����� ����
class ThreadEx1_1 extends Thread{
	//public class Thread extends Object implements Runnable
	//java.lang�� �ִ� �⺻ Ŭ������ import �ʿ� ����
	
	public void run() {//run () �޼���� �� �����尡 �ؾ� �� ���� ���� ��
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());//��ӹ��� Thread�� getName()�޼��� ���
			//String getName(), ThreadŬ�������� ��ӹ��� �޼���� ������ �̸� ��ȯ
		}
	}
}//ThreadEx1_1;

class ThreadEx1_2 implements Runnable{
	//@FunctionalInterface public interface Runnable
	//java.lang�� �ִ� �������̽��� import �ʿ� ����
	//@FunctionalInterface ������̼��� �߻� �޼��尡 �ϳ��� �������̽��̴�
	@Override
	public void run() {
		 // Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�.
		for (int i = 0; i < 5; i++) {
			//getName()�޼���� Runnable �������̽����� �����Ƿ� ������ ���� ���� ��� �Ұ�
			//���� ������� Thread�� Thread.currentThread() �� �˾Ƴ� (static Ŭ����)
			System.out.println("���� ������� ������ : "+Thread.currentThread().getName());
		}
	}
}//ThreadEx1_2;

class ThreadEx1_3 extends Thread{
	//public class Thread extends Object implements Runnable
	//java.lang�� �ִ� �⺻ Ŭ������ import �ʿ� ����
	
	public void run() {
		//run () �޼���� �� �����尡 �ؾ� �� ���� ���� ��
		 // Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�.
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());//��ӹ��� Thread�� getName()�޼��� ���
			//String getName(), ThreadŬ�������� ��ӹ��� �޼���� ������ �̸� ��ȯ
		}
	}
}//ThreadEx1_3;


class ThreadEx1_4 extends Thread{
	//public class Thread extends Object implements Runnable
	//java.lang�� �ִ� �⺻ Ŭ������ import �ʿ� ����
	
	public void run() {//run () �޼���� �� �����尡 �ؾ� �� ���� ���� ��
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());//��ӹ��� Thread�� getName()�޼��� ���
			//String getName(), ThreadŬ�������� ��ӹ��� �޼���� ������ �̸� ��ȯ
		}
	}
}//ThreadEx1_4;
