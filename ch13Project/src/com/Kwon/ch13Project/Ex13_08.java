package com.Kwon.ch13Project;

public class Ex13_08 {
	
	public static void main(String[] args) {
		//sleep()�޼��� ���
		Thread08_01 th1 = new Thread08_01();
		Thread08_02 th2 = new Thread08_02();
		
		th1.start();//����������� Runnable ���°� ��
		th2.start();//����������� Runnable ���°� ��
		
		//���ξ����带 sleep
		try {
			th1.sleep(2000);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		System.out.print("<<main ����>>");
	}//main method;
}//main class;

class Thread08_01 extends Thread{
	//������ th2�� ������ run()
	//CPU�� �Ҵ�ú��� run()����
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 ����>>");
	}
}//class Thread08_01;

class Thread08_02 extends Thread{
	//������ th2�� ������ run()
	//CPU�� �Ҵ�ú��� run()����
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 ����>>");
	}
}//Thread08_02;
