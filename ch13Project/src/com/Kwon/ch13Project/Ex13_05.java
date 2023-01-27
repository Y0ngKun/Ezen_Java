package com.Kwon.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_05 {
	public static void main(String[] args) {
		//main thread�� �ٸ� thread�� thread I/O ���ŷ�� ó�� ���� ��
		
		//main thread���� �� �ٸ� thread�� ����
		Thread5_1 r = new Thread5_1();
		Thread th1 = new Thread(r);
		
		Thread th2 = new Thread(new Thread5_1());
		//Thread ��ü ���ٷ� �ϴ� ���
		
		th1.start();//th1�� ���� ������ �����·� ����(Runnable ����)
		//������ OS���� CPU�� �Ҵ����ָ�  run()�޼��带 �����Ѵ�.
		
		//main thread ó���ϱ�
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���2.");
		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�2.");
	
	}//main method;
}//main class;

class Thread5_1 implements Runnable{
	@Override
	public void run(){
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
		
	}//run();
}//class Thread5_1;