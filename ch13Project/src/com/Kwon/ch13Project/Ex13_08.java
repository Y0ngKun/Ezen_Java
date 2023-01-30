package com.Kwon.ch13Project;

public class Ex13_08 {
	
	public static void main(String[] args) {
		//sleep()메서드 사용
		Thread08_01 th1 = new Thread08_01();
		Thread08_02 th2 = new Thread08_02();
		
		th1.start();//실행대기상태인 Runnable 상태가 됨
		th2.start();//실행대기상태인 Runnable 상태가 됨
		
		//메인쓰레드를 sleep
		try {
			th1.sleep(2000);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		System.out.print("<<main 종료>>");
	}//main method;
}//main class;

class Thread08_01 extends Thread{
	//쓰레드 th2이 실행할 run()
	//CPU에 할당시부터 run()실행
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}
}//class Thread08_01;

class Thread08_02 extends Thread{
	//쓰레드 th2이 실행할 run()
	//CPU에 할당시부터 run()실행
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	}
}//Thread08_02;
