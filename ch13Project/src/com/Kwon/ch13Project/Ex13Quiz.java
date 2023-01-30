package com.Kwon.ch13Project;

public class Ex13Quiz extends Thread {//1��;
	@Override
	public void run() {
		System.out.println("Ex13Quiz Thread : "+Thread.currentThread().getName());
	}//2��;
	public static void main(String[] args) {
		
		Thread th1 = new Ex13Quiz();
		th1.start();//3��;
		
		RunThread r = new RunThread();
		Thread th2 = new Thread(r);
		th2.start();//6��;
		
		try {
			th1.join();
			th2.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//8��;
		
		System.out.println("main method ����");//7��;
		
		
		
		try {
			th1.isAlive();
			th1.run();
			th1.start();
		} catch (IllegalThreadStateException e) {
			System.out.println(e.getMessage());
		}
		
	}//main method;
}//main class;

class RunThread implements Runnable{//4��;
	@Override
	public void run() {
		System.out.println("RunThread : "+Thread.currentThread().getName());
		//5��;
	}
}//class RunThread;

/* 1.Ex13QuizŬ������ ThreadŬ������ ����� Ŭ������ ����
 * 2.run()�޼ҵ带 Override�ϴµ� ������ Ex13QuizŬ������ ���������� ���
 * 3.Ex13Quiz�� ������ ��ü th1�� �����ϰ� start����
 * 4.Runnable�� ������ Ŭ���� RunThread�� ����
 * 5.run()�޼ҵ�� RunThread�� Thread���� ���
 * 6.main �����忡�� RunThread�� ������ ��ü th2�� ���� �� start
 * 7.main �������� ������ ���� main�� ������ ������ ���
 * 8.start���� main������� th1�� th2�� ���� �ɽñ��� ������ ����
 * 9.main ������ ������ �� ���� �� �ٽ� th1�� thr2�� �����ϰ� start
 * 10.th1�� th2�� ����ñ��� main ������� ����ġ ���ϵ��� ó��(isAlive()���) --> �������� join()���� ���� ���ٰ� ��
 */
