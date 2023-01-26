package com.Kwon.ch13Project;

public class Ex13_03 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		//main method Thread와 다른 Thread 1개를 추가하여 실행
		Thread3_1 th1 = new Thread3_1();
		th1.start();
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간 1 : " + (System.currentTimeMillis()-Ex13_03.startTime));
		//소요시간1은 main 스레드가 반복문을 처리하는데 걸린 시간
	
	}//main method;
}//main class;

class Thread3_1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("|"));
		}
		System.out.print("소요시간 2 : " + (System.currentTimeMillis()-Ex13_03.startTime));
		//소요시간2는 th1스레드가 반복문을 처리하는데 걸린 시간
	
	}
}
