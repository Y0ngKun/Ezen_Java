package com.Kwon.ch13Project;

public class Ex13_01 {
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();//Thread를 상속한 클래스(ThreadEx1_1)의 객체 생성
		ThreadEx1_3 t3 = new ThreadEx1_3();
		ThreadEx1_4 t4 = new ThreadEx1_4();
		
		Runnable r = new ThreadEx1_2();
		
		Thread t2 = new Thread(r);
//		이렇게 쓸 수도 있다 = Thread t2 = new Thread(new ThreadEx1_2());
		
		//thread를 동작 시키려면 start()메서드 호출
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//start()메서드가 호출되면 thread는 실행 대기 상태가 됨
		//실행되는 순서는 OS의 스케쥴링에 따라 실행됨
		
	}//main method;
}//main class;

//thread를 사용하려면 Thread를 상속하거나 Runnable 인터페이스를 구현한 클래스의 객채로만 사용이 가능
class ThreadEx1_1 extends Thread{
	//public class Thread extends Object implements Runnable
	//java.lang에 있는 기본 클래스로 import 필요 없음
	
	public void run() {//run () 메서드는 이 쓰레드가 해야 할 일을 정의 함
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());//상속받은 Thread의 getName()메서드 사용
			//String getName(), Thread클래스에서 상속받은 메서드로 스레드 이름 반환
		}
	}
}//ThreadEx1_1;

class ThreadEx1_2 implements Runnable{
	//@FunctionalInterface public interface Runnable
	//java.lang에 있는 인터페이스로 import 필요 없음
	//@FunctionalInterface 어노테이션은 추상 메서드가 하나인 인터페이스이다
	@Override
	public void run() {
		 // Thread 를 상속하면 run 메서드를 구현해야 한다.
		for (int i = 0; i < 5; i++) {
			//getName()메서드는 Runnable 인터페이스에는 없으므로 구현할 수가 없어 사용 불가
			//현재 사용중인 Thread는 Thread.currentThread() 로 알아냄 (static 클래스)
			System.out.println("현재 사용중인 쓰레드 : "+Thread.currentThread().getName());
		}
	}
}//ThreadEx1_2;

class ThreadEx1_3 extends Thread{
	//public class Thread extends Object implements Runnable
	//java.lang에 있는 기본 클래스로 import 필요 없음
	
	public void run() {
		//run () 메서드는 이 쓰레드가 해야 할 일을 정의 함
		 // Thread 를 상속하면 run 메서드를 구현해야 한다.
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());//상속받은 Thread의 getName()메서드 사용
			//String getName(), Thread클래스에서 상속받은 메서드로 스레드 이름 반환
		}
	}
}//ThreadEx1_3;


class ThreadEx1_4 extends Thread{
	//public class Thread extends Object implements Runnable
	//java.lang에 있는 기본 클래스로 import 필요 없음
	
	public void run() {//run () 메서드는 이 쓰레드가 해야 할 일을 정의 함
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());//상속받은 Thread의 getName()메서드 사용
			//String getName(), Thread클래스에서 상속받은 메서드로 스레드 이름 반환
		}
	}
}//ThreadEx1_4;
