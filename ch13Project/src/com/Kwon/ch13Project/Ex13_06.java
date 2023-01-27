package com.Kwon.ch13Project;

public class Ex13_06 {
	public static void main(String[] args) {
		//thread �켱����
		//main thread�� �ٸ� thread�� ����(main thread�� �θ� thread)
		//main�� �⺻ NORM_PRIORITY�� 5�̴�.(���� �켱���� ��)
		//�ڽ� thread�� �θ��� �켱������ ����Ѵ�.
		Thread6_1 th1 = new Thread6_1();
		Thread6_2 th2 = new Thread6_2();
//		Thread th3 = new Thread(new Thread6_1()); //���� �ۼ� ���
		
		//priority ������ start()������ ����
		th2.setPriority(7); //�켱 ������ 3���� ������ �� ���� �����Ǹ� CPU�Ҵ� �ð��� ���� ŭ
		
		System.out.println("Priority of th1 : (-) " + th1.getPriority());
		System.out.println("Priority of th2 : (|) " + th2.getPriority());
	
		th1.start();
		th2.start();//�켱 ������ ���� ���� CPU�� ���� ����ϹǷ� th1���� ���� ������
		
		System.out.println("main ������ ����");
		
	}//main method;
}//main class;

class Thread6_1 extends Thread{
	//�����带 ����ϱ� ���ؼ��� �����尡 ó���ؾ��� ���� ����ϴ� public void run()�� �� ������ ����� �Ѵ�.
	@Override
	public void run(){
		for (int i = 1; i < 300; i++) {
			System.out.print("-");
			for (int j = 0; j < 10000000; j++) {}
		}
		System.out.print("th1 ����");
	}//run;
}
class Thread6_2 extends Thread{
	
	@Override
	public void run(){
		for (int i = 1; i < 300; i++) {
			System.out.print("|");
			for (int j = 0; j < 10000000; j++) {}
		}
		System.out.println("th2 ����");
	}//run;
}