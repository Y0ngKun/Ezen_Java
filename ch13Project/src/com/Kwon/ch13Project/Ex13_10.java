package com.Kwon.ch13Project;

public class Ex13_10 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		//deprecated된 suspend(),resume(),stop()
		
		RunImplEx10 r = new RunImplEx10();
		
		//Thread(Runnable target, String name) 
		//Runnable객체 r과 쓰레드명 name을 사용한 생성자
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);//main쓰레드 정지
			th1.suspend();//th1쓰레드 정지
			Thread.sleep(2000);//main쓰레드 정지
			th2.suspend();//th2쓰레드 정지
			Thread.sleep(3000);//main쓰레드 정지
			th1.resume();//다시 runnable
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
			th3.yield();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}//main method;
}//main class;

class RunImplEx10 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//while;
	}//run();
}//class RunImplEx10;