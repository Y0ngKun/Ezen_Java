package com.Kwon.ch13Project;

//����ȭ ó���� ���� ���� ���
public class Ex13_12 {
	public static void main(String[] args) {
		
		Runnable r = new Runnable12();
		//thread2���� run()�޼��� ����
		Thread th1 = new Thread(r); 
		Thread th2 = new Thread(r); 
		
		th1.start();
		th2.start();
		
		
		
	}//main method;
}//main class;

class Runnable12 implements Runnable {
	Account acc = new Account();
	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int)((Math.random() * 3) + 1) * 100;
			//��� �ݾ��� 100,200,300�� �߻�
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance()); //��� �� �ܾ�
		}		
	}//run();
}//class Runnable12;

class Account{//���� ó�� Ŭ������ ���� ��� �ڿ� ��ü�� ��� (th1�� th2�� �������� ����ϴ� �ڿ� = th1,th2 �Ӱ迵��)
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	//����ȭ�� ó�� ���� ���� �޼���� th1�� th2�� ���ÿ� ó�� �� �� ����
	//�ܾ� ó���� �ȵ� ���¿��� �ٸ� �����尡 ���
	public void withdraw(int money) {//��� ó�� money�� ��� �ݾ�
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
}//class Account;
