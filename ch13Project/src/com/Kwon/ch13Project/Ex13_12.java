package com.Kwon.ch13Project;

//동기화 처리를 하지 않은 경우
public class Ex13_12 {
	public static void main(String[] args) {
		
		Runnable r = new Runnable12();
		//thread2개가 run()메서드 실행
		Thread th1 = new Thread(r); 
		Thread th2 = new Thread(r); 
		
		new Thread(r).start
		
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
			//출금 금액을 100,200,300을 발생
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance()); //출금 후 잔액
		}		
	}//run();
}//class Runnable12;

class Account{//계좌 처리 클래스로 공동 사용 자원 객체로 사용 (th1과 th2가 공동으로 사용하는 자원 = th1,th2 임계영역)
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	//동기화를 처리 하지 않은 메서드로 th1과 th2가 동시에 처리 할 수 있음
	//잔액 처리가 안된 상태에서 다른 스레드가 사용
	public void withdraw(int money) {//출금 처리 money는 출금 금액
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
}//class Account;
