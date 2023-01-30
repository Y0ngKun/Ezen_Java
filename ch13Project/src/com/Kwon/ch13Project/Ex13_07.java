package com.Kwon.ch13Project;

public class Ex13_07 implements Runnable{

	static boolean autoSave = false;
	
	@Override
	//���� ������� run���� ���ξ����� ����Ǹ� �ڵ� ����
	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (autoSave) {
				autoSave();
			}
		}
	}//run();
	public void autoSave() {
		System.out.println("������ �ڵ� ���� �Ǿ����ϴ�");
	}
	public static void main(String[] args) {
		//main method�� JVM���� ���� ������� 
		Runnable r =new Ex13_07();
		Thread t = new Thread(r);
		Thread rt = new Thread(new Ex13_07());//���ٷ� ���� ��

		t.setDaemon(true);//������ t��, ���� �������� daemon������� ���
		t.start();
		//���⼭ ������������ �Ϲݾ������ main������

		//�Ʒ��κ��� main �����尡 ����
		for (int i = 1; i <= 13 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			if(i==5) {
				autoSave = true;
			}
		}//for;

	}//main method;
}//main class;
