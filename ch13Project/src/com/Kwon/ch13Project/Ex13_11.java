package com.Kwon.ch13Project;

public class Ex13_11 {
	public static void main(String[] args) {
		
		//Thread.yield()와 쓰레드 객체.join()
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		//th1과 th2쓰레드는 자신 쓰레드의 run()을 수행(Runnable를 거쳐서)
		th1.start();
		th2.start();
		
		//main 메서드가 하는 일
		long startTime =  System.currentTimeMillis();//posix time
		
		try {
			th1.join();//main쓰레드가 join 호출
			th2.join();//main쓰레드가 join 호출
			//join()이 모두 완료시 다시 main쓰레드가 동작
			//join()은 어떤 배열이 있는데 값을 다 채울 때까지 메인메서드를 기다리게 할 때 많이쓴다.
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("<<소요시간>> : " + (System.currentTimeMillis()-startTime));
		
	}//main method;
}//main class;

class ThreadEx11_1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
		System.out.print("<<th1종료>>");
	}//run();
}//class ThreadEx11_1;

class ThreadEx11_2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
		System.out.print("<<th2종료>>");
	}//run();
}//ThreadEx11_2;
