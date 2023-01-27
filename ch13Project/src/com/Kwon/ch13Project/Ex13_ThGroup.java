package com.Kwon.ch13Project;

public class Ex13_ThGroup {
	public static void main(String[] args) {
		
		//������ �׷� Ȱ�� main �����尡 ����� ������ �׷��� main ������ �׷쿡 ����
		
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//�׷��� ������ �̸��� ����ϴ� ������ �����ڸ� ȣ���Ͽ� ������ ����
		
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		//()�ȿ� ��ü�� �־���Ѵ�. ThreadGroup (XX)
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//�ΰ� ������ ��� ������ �׷��� ���� (myGroup)
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main ������ �׷��� list() �޼ҵ� ��� ����]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//main �����尡 �����ִ� ������ �׷��� ��
		mainGroup.list(); //������ �׷�� ������ ���� ������ִ� �޼���
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
		}
		System.out.println("[myGroup ������ �׷��� interrupt()�޼ҵ� ȣ��]");
		myGroup.interrupt();
		
	}//main method;
}//main class;

class WorkThread extends Thread{
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);//sleep�� interrupt()�� ���� (����)�Ǹ� ���� �߻�

			} catch (Exception e) {
				System.out.println(getName() + "interrupted" );
				break;
			}
		}//while;
		System.out.println(getName() + "�����");
	}//run();
}//WorkThread;
