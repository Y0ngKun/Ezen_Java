package com.Kwon.ch13Project;

public class Ex13Quiz extends Thread {//1번;
	@Override
	public void run() {
		System.out.println("Ex13Quiz Thread : "+Thread.currentThread().getName());
	}//2번;
	public static void main(String[] args) {
		
		Thread th1 = new Ex13Quiz();
		th1.start();//3번;
		
		RunThread r = new RunThread();
		Thread th2 = new Thread(r);
		th2.start();//6번;
		
		try {
			th1.join();
			th2.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//8번;
		
		System.out.println("main method 종료");//7번;
		
		
		
		try {
			th1.isAlive();
			th1.run();
			th1.start();
		} catch (IllegalThreadStateException e) {
			System.out.println(e.getMessage());
		}
		
	}//main method;
}//main class;

class RunThread implements Runnable{//4번;
	@Override
	public void run() {
		System.out.println("RunThread : "+Thread.currentThread().getName());
		//5번;
	}
}//class RunThread;

/* 1.Ex13Quiz클래스를 Thread클래스를 상속한 클래스로 변경
 * 2.run()메소드를 Override하는데 내용은 Ex13Quiz클래스의 스레드임을 출력
 * 3.Ex13Quiz의 스레드 객체 th1을 생성하고 start해줌
 * 4.Runnable을 구현한 클래스 RunThread를 만듦
 * 5.run()메소드는 RunThread의 Thread임을 출력
 * 6.main 쓰레드에서 RunThread의 쓰레드 객체 th2를 생성 후 start
 * 7.main 쓰레드의 마지막 문은 main의 마지막 문임을 출력
 * 8.start이후 main스레드는 th1과 th2가 종료 될시까지 대기토록 만듦
 * 9.main 쓰레드 마지막 문 종료 후 다시 th1과 thr2를 생성하고 start
 * 10.th1과 th2가 종료시까지 main 쓰레드는 진행치 못하도록 처리(isAlive()사용) --> 현업에서 join()보다 많이 쓴다고 함
 */
