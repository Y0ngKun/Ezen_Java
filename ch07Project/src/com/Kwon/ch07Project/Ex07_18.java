package com.Kwon.ch07Project;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//���� �⺻�� GUI��Ű�� Ŭ����

//�͸��� Ŭ������ ���ʰ� Ŭ������ ����� ���
public class Ex07_18 {
	
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		//�Ķ���ͷ� ActionListener�� ������ (EventHandler)��ü
		
		
	}

}

class EventHandler implements ActionListener{
	//ActionListener�� �������̽��� �����ҽô� �߻�޼��带 �����ؾ��Ѵ�.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}