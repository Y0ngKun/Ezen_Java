package com.Kwon.ch13Project;

import javax.swing.JOptionPane; //javax = �׷����� ó���ϴ� ��Ű�� 

public class Ex13_04 {
	
	//main thread�� ���� I/O ���ŷ�� ���� ��
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		//��ȭâ�� �����ϴ� GUIâ, OK ��ư�� Ŭ���ؾ߸� �۾��� ����. 
		//--�̶� ������ I/O���ŷ (������ ������)
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
	
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//sleep(�и�������)�� (�и�������) ���� ������ ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for;
		
		
	}//main method;
}//main class;
