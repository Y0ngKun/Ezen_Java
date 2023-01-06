package com.Kwon.ch07Project;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//가장 기본의 GUI패키지 클래스

//익명의 클래스를 사용않고 클래스를 만들어 사용
public class Ex07_18 {
	
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		//파라메터로 ActionListener를 구현한 (EventHandler)객체
		
		
	}

}

class EventHandler implements ActionListener{
	//ActionListener의 인터페이스를 구현할시는 추상메서드를 구현해야한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}