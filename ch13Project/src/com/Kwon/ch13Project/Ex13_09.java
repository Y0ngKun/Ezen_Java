package com.Kwon.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_09 {
	public static void main(String[] args) {
		//interrupt 사용
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		//IO BLOCK이 발생 ( 진행중인 쓰레드가 대기 상태가 됨)
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		//입력처리가 종료되면 다시 Runnable상태가 되고 CPU가 할당 되면 run;
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		th1.interrupt();
		//th1쓰레드의 일시 정지를 중단시키고 Runnable상태로 변환토록 요청함
		//정지하고 있는 쓰레드에 예외를 발생시켜 중단을 멈추고 run()메서드 나머지 부분을 실행하고 종료
		
		System.out.println("th1.isInterrupted() : "+th1.isInterrupted());
		
		System.out.println("main 메서드 종료");
		
	}//main method;
}//main class;

class ThreadEx9_1 extends Thread{
	@Override 
	public void run() {
		int i = 10;
		while (i!=0 && !isInterrupted()) {//interrupted가 호출 안된 상태이고 i가 0이 아닌 상태시는 true
			System.out.println(i--);
			for(long x =0; x<25000000000L; x++) {
				;
			}
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}

class ThreadEx9_2 extends Thread{
	@Override
	public void run() {}
}
