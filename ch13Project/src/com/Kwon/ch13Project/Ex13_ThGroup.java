package com.Kwon.ch13Project;

public class Ex13_ThGroup {
	public static void main(String[] args) {
		
		//스레드 그룹 활용 main 쓰레드가 만드는 쓰레드 그룹은 main 쓰레드 그룹에 속한
		
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//그룹명과 스레드 이름을 사용하는 스레드 생성자를 호출하여 스레드 생성
		
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		//()안에 객체를 넣어야한다. ThreadGroup (XX)
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//두개 쓰레드 모두 쓰레드 그룹이 동일 (myGroup)
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 쓰레드 그룹의 list() 메소드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//main 쓰레드가 속해있는 쓰레드 그룹을 얻어냄
		mainGroup.list(); //쓰레드 그룹과 쓰레드 명을 출력해주는 메서드
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
		}
		System.out.println("[myGroup 쓰레드 그룹의 interrupt()메소드 호출]");
		myGroup.interrupt();
		
	}//main method;
}//main class;

class WorkThread extends Thread{
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);//sleep중 interrupt()가 실행 (정지)되면 예외 발생

			} catch (Exception e) {
				System.out.println(getName() + "interrupted" );
				break;
			}
		}//while;
		System.out.println(getName() + "종료됨");
	}//run();
}//WorkThread;
