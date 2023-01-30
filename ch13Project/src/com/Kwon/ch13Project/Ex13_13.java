package com.Kwon.ch13Project;

//동기화를 사용한 처리
public class Ex13_13 {
	public static void main(String[] args) {
		
		Runnable r = new Runnable13();
		//thread2개가 run()메서드 실행
		Thread th1 = new Thread(r); 
		Thread th2 = new Thread(r); 
		
		th1.start();
		th2.start();
		
	}//main method;
}//main class;

class Account2{//계좌 처리 클래스로 공동 사용 자원 객체로 사용 (th1과 th2가 공동으로 사용하는 자원 = th1,th2 임계영역)
	//모든 자바 클래스의 객체는 lock을 하나만 가짐
	private int balance = 1000;
	public int getBalance() {return balance;}
	
	//synchronized 사용하면 이 메서드를 가진 객체에서 스레드중 하나 에게만 lock 제공
	//메서드 종료되면 lock 반납
	public synchronized void withdraw(int money) {//출금 처리 money는 출금 금액
		if(balance>=money) {
			try {
				Thread.sleep(1000);
				//처리 안정성을 주기 위해 1초 지연시킴
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
			//출금 금액을 100,200,300을 발생
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance()); //출금 후 잔액
		}		
	}//run();
}//class Runnable13;
