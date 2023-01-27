package com.Kwon.ch13Project;

import javax.swing.JOptionPane; //javax = 그래픽을 처리하는 패키지 

public class Ex13_04 {
	
	//main thread만 사용시 I/O 블록킹시 실행 예
	public static void main(String[] args) {
		
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
		
		
	}//main method;
}//main class;
