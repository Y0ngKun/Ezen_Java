package com.Kwon.ch13Project;

public class Ex13_03 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		//main method Thread�� �ٸ� Thread 1���� �߰��Ͽ� ����
		Thread3_1 th1 = new Thread3_1();
		th1.start();
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("�ҿ�ð� 1 : " + (System.currentTimeMillis()-Ex13_03.startTime));
		//�ҿ�ð�1�� main �����尡 �ݺ����� ó���ϴµ� �ɸ� �ð�
	
	}//main method;
}//main class;

class Thread3_1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("|"));
		}
		System.out.print("�ҿ�ð� 2 : " + (System.currentTimeMillis()-Ex13_03.startTime));
		//�ҿ�ð�2�� th1�����尡 �ݺ����� ó���ϴµ� �ɸ� �ð�
	
	}
}
