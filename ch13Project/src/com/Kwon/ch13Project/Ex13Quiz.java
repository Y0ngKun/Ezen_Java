package com.Kwon.ch13Project;

public class Ex13Quiz extends Thread {//1번;
	//Thread는 Runnable인터페이스를 구현한 클래스로 java.lang에 있는 기본 클래스이다.
	//Thread를 상속하면 Thread 클래스를 사용할 수 있고 꼭 Run()메소드를 구현해야 한다.
   @Override
   public void run() {
      System.out.println("Ex13Quiz Thread");
   }//2번;
   
   public static void main(String[] args) {
      
      Thread th1 = new Ex13Quiz();
      //Ex13Quiz에는 명시적으로 생성자가 없으므로 기본 생성자를 사용
      //public Ex13Quiz(){super();}를 사용
      th1.start();//3번;
      //start는 바로 실행 되는 메소드가 아니고 
      //실행대기상태(Runnable상태)로 만드는 메소드이다
      //실행 대기에 있다가 CPU할당시에 run()메서드를 실행
      
      RunThread r = new RunThread();
      Thread th2 = new Thread(r);
      th2.start();//6번;
      
//      Thread th2 = new Thread(new RunThread());
      //6번 한 줄로 만들었을 때
      
      try {
         th1.join();
         th2.join();
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }//8번;
      
      System.out.println("main method 종료");//7번;
      
      th1 = new Ex13Quiz(); //종료된 쓰레드 재성성 방법 1
      new Thread(th1); //종료된 쓰레드 재성성 방법 2
     
      th2 = new Thread(r); //종료된 쓰레드 재성성 방법 2
      //th2 = new Thread(new RunThread());
      //6번에서 한 줄로 만들었을 때 재생성 하는 방법(!!!)
    
      th1.start();
      th2.start();//9번;
      
      //isAlive()는 스레드가 사용가능한 상태인지 boolean값 반환
      while(th1.isAlive() || th2.isAlive()) {}
      //while문으로 isAlive()로 상태를 확인해  메인스레드를 진행시킴
      System.out.println("main method 종료2");//10번;
      
   }//main method;
}//main class;

class RunThread implements Runnable{//4번;
   @Override
   public void run() {
      System.out.println("RunThread");
      //5번;
   }
}//class RunThread;

/* 1.Ex13Quiz클래스를 Thread클래스를 상속한 클래스로 변경
 * 2.run()메소드를 Override하는데 내용은 Ex13Quiz클래스의 스레드임을 출력
 * 3.Ex13Quiz의 스레드 객체 th1을 생성하고 start해줌
 * 4.Runnable을 구현한 클래스 RunThread를 만듦
 * 5.run()메소드는 RunThread의 Thread임을 출력
 * 6.main 쓰레드에서 RunThread의 쓰레드 객체 th2를 생성 후 start
 * 7.main 쓰레드의 마지막 문은 main의 마지막 문임을 출력
 * 8.start이후 main스레드는 th1과 th2가 종료 될시까지 대기토록 만듦
 * 9.main 쓰레드 마지막 문 종료 후 다시 th1과 thr2를 생성하고 start
 * 10.th1과 th2가 종료시까지 main 쓰레드는 진행치 못하도록 처리(isAlive()사용) --> 현업에서 join()보다 많이 쓴다고 함
 */