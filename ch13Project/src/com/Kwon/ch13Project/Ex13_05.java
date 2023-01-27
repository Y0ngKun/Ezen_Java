package com.Kwon.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_05 {
	public static void main(String[] args) {
		//main thread와 다른 thread로 thread I/O 블록킹시 처리 실행 예
		
		//main thread에서 또 다른 thread를 만듦
		Thread5_1 r = new Thread5_1();
		Thread th1 = new Thread(r);
		
		Thread th2 = new Thread(new Thread5_1());
		//Thread 객체 한줄로 하는 방법
		
		th1.start();//th1을 실행 가능한 대기상태로 보냄(Runnable 상태)
		//실행은 OS에서 CPU를 할당해주면  run()메서드를 실행한다.
		
		//main thread 처리하기
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요2.");
		System.out.println("입력하신 값은 "+input+"입니다2.");
	
	}//main method;
}//main class;

class Thread5_1 implements Runnable{
	@Override
	public void run(){
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		//대화창을 제공하는 GUI창, OK 버튼을 클릭해야만 작업이 종료. 
		//--이때 까지는 I/O블록킹 (쓰레드 대기상태)
		System.out.println("입력하신 값은 " + input + "입니다.");
	
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//sleep(밀리세컨드)는 (밀리세컨드) 동안 쓰레드 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for;
		
	}//run();
}//class Thread5_1;