package com.Kwon.ch07Project;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07_19 {
	public static void main(String[] args) {
		
		Frame frame = new Frame("title");
		frame.setSize(500,300);
		frame.setVisible(true);
		
		Button b = new Button("Start");
		frame.add(b);
		
		System.exit(1);
		//addActionListener의 메서드의 파라메터는 인터페이스 ActionListener 구현 객체
		//익명의 클래스로 객체를 구현
		
		//인터페이스 객체를 new생성자로 만들고 인터페이스의 추상메서드를 구현해줌
		
		
		//addActionListener라는 메소드() 안에서 익명클래스를 만드는 코드이다.
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명의 클래스로 만듦");
			}
		});
		//익명의 클래스는 new 인터페이스(추상클래스)생성자(){
		//인터페이스(추상클래스)의 추상메서드를 구현
		//필요한 코드작성

	
	}//main method;

		
}//main class;
