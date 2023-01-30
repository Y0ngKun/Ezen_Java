package com.Kwon.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_09 {
	public static void main(String[] args) {
		//interrupt ���
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		//IO BLOCK�� �߻� ( �������� �����尡 ��� ���°� ��)
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		//�Է�ó���� ����Ǹ� �ٽ� Runnable���°� �ǰ� CPU�� �Ҵ� �Ǹ� run;
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		th1.interrupt();
		//th1�������� �Ͻ� ������ �ߴܽ�Ű�� Runnable���·� ��ȯ��� ��û��
		//�����ϰ� �ִ� �����忡 ���ܸ� �߻����� �ߴ��� ���߰� run()�޼��� ������ �κ��� �����ϰ� ����
		
		System.out.println("th1.isInterrupted() : "+th1.isInterrupted());
		
		System.out.println("main �޼��� ����");
		
	}//main method;
}//main class;

class ThreadEx9_1 extends Thread{
	@Override 
	public void run() {
		int i = 10;
		while (i!=0 && !isInterrupted()) {//interrupted�� ȣ�� �ȵ� �����̰� i�� 0�� �ƴ� ���½ô� true
			System.out.println(i--);
			for(long x =0; x<25000000000L; x++) {
				;
			}
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}

class ThreadEx9_2 extends Thread{
	@Override
	public void run() {}
}
