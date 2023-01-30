package com.Kwon.ch13Project;

//����ȭ�� ����� ó��
public class Ex13_13 {
	public static void main(String[] args) {
		
		Runnable r = new Runnable13();
		//thread2���� run()�޼��� ����
		Thread th1 = new Thread(r); 
		Thread th2 = new Thread(r); 
		
		th1.start();
		th2.start();
		
	}//main method;
}//main class;

class Account2{//���� ó�� Ŭ������ ���� ��� �ڿ� ��ü�� ��� (th1�� th2�� �������� ����ϴ� �ڿ� = th1,th2 �Ӱ迵��)
	//��� �ڹ� Ŭ������ ��ü�� lock�� �ϳ��� ����
	private int balance = 1000;
	public int getBalance() {return balance;}
	
	//synchronized ����ϸ� �� �޼��带 ���� ��ü���� �������� �ϳ� ���Ը� lock ����
	//�޼��� ����Ǹ� lock �ݳ�
	public synchronized void withdraw(int money) {//��� ó�� money�� ��� �ݾ�
		if(balance>=money) {
			try {
				Thread.sleep(1000);
				//ó�� �������� �ֱ� ���� 1�� ������Ŵ
				balance -= money;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}//class Account2;

class Runnable13 implements Runnable {
	Account2 acc = new Account2();
	
	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int)((Math.random() * 3) + 1) * 100;
			//��� �ݾ��� 100,200,300�� �߻�
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance()); //��� �� �ܾ�
		}		
	}//run();
}//class Runnable13;
