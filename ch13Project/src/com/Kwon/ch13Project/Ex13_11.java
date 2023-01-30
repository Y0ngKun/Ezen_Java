package com.Kwon.ch13Project;

public class Ex13_11 {
	public static void main(String[] args) {
		
		//Thread.yield()�� ������ ��ü.join()
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		//th1�� th2������� �ڽ� �������� run()�� ����(Runnable�� ���ļ�)
		th1.start();
		th2.start();
		
		//main �޼��尡 �ϴ� ��
		long startTime =  System.currentTimeMillis();//posix time
		
		try {
			th1.join();//main�����尡 join ȣ��
			th2.join();//main�����尡 join ȣ��
			//join()�� ��� �Ϸ�� �ٽ� main�����尡 ����
			//join()�� � �迭�� �ִµ� ���� �� ä�� ������ ���θ޼��带 ��ٸ��� �� �� ���̾���.
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("<<�ҿ�ð�>> : " + (System.currentTimeMillis()-startTime));
		
	}//main method;
}//main class;

class ThreadEx11_1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
		System.out.print("<<th1����>>");
	}//run();
}//class ThreadEx11_1;

class ThreadEx11_2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
		System.out.print("<<th2����>>");
	}//run();
}//ThreadEx11_2;
