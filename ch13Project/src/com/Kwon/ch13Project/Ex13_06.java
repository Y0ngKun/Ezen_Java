package com.Kwon.ch13Project;

public class Ex13_06 {
	public static void main(String[] args) {
		//thread 우선순위
		//main thread가 다른 thread를 만듦(main thread가 부모 thread)
		//main은 기본 NORM_PRIORITY인 5이다.(보통 우선순위 값)
		//자식 thread는 부모의 우선순위를 상속한다.
		Thread6_1 th1 = new Thread6_1();
		Thread6_2 th2 = new Thread6_2();
//		Thread th3 = new Thread(new Thread6_1()); //한줄 작성 방법
		
		//priority 설정은 start()이전에 가능
		th2.setPriority(7); //우선 순위가 3개의 스레드 중 제일 높으므르 CPU할당 시간이 제일 큼
		
		System.out.println("Priority of th1 : (-) " + th1.getPriority());
		System.out.println("Priority of th2 : (|) " + th2.getPriority());
	
		th1.start();
		th2.start();//우선 순위가 제일 높아 CPU를 오래 사용하므로 th1보다 빨리 종료함
		
		System.out.println("main 쓰레드 종료");
		
	}//main method;
}//main class;

class Thread6_1 extends Thread{
	//스레드를 사용하기 위해서는 스레드가 처리해야할 일을 담당하는 public void run()을 꼭 재정의 해줘야 한다.
	@Override
	public void run(){
		for (int i = 1; i < 300; i++) {
			System.out.print("-");
			for (int j = 0; j < 10000000; j++) {}
		}
		System.out.print("th1 종료");
	}//run;
}
class Thread6_2 extends Thread{
	
	@Override
	public void run(){
		for (int i = 1; i < 300; i++) {
			System.out.print("|");
			for (int j = 0; j < 10000000; j++) {}
		}
		System.out.println("th2 종료");
	}//run;
}