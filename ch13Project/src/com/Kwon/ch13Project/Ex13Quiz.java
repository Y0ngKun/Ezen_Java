package com.Kwon.ch13Project;

public class Ex13Quiz extends Thread {//1��;
	//Thread�� Runnable�������̽��� ������ Ŭ������ java.lang�� �ִ� �⺻ Ŭ�����̴�.
	//Thread�� ����ϸ� Thread Ŭ������ ����� �� �ְ� �� Run()�޼ҵ带 �����ؾ� �Ѵ�.
   @Override
   public void run() {
      System.out.println("Ex13Quiz Thread");
   }//2��;
   
   public static void main(String[] args) {
      
      Thread th1 = new Ex13Quiz();
      //Ex13Quiz���� ��������� �����ڰ� �����Ƿ� �⺻ �����ڸ� ���
      //public Ex13Quiz(){super();}�� ���
      th1.start();//3��;
      //start�� �ٷ� ���� �Ǵ� �޼ҵ尡 �ƴϰ� 
      //���������(Runnable����)�� ����� �޼ҵ��̴�
      //���� ��⿡ �ִٰ� CPU�Ҵ�ÿ� run()�޼��带 ����
      
      RunThread r = new RunThread();
      Thread th2 = new Thread(r);
      th2.start();//6��;
      
//      Thread th2 = new Thread(new RunThread());
      //6�� �� �ٷ� ������� ��
      
      try {
         th1.join();
         th2.join();
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }//8��;
      
      System.out.println("main method ����");//7��;
      
      th1 = new Ex13Quiz(); //����� ������ �缺�� ��� 1
      new Thread(th1); //����� ������ �缺�� ��� 2
     
      th2 = new Thread(r); //����� ������ �缺�� ��� 2
      //th2 = new Thread(new RunThread());
      //6������ �� �ٷ� ������� �� ����� �ϴ� ���(!!!)
    
      th1.start();
      th2.start();//9��;
      
      //isAlive()�� �����尡 ��밡���� �������� boolean�� ��ȯ
      while(th1.isAlive() || th2.isAlive()) {}
      //while������ isAlive()�� ���¸� Ȯ����  ���ν����带 �����Ŵ
      System.out.println("main method ����2");//10��;
      
   }//main method;
}//main class;

class RunThread implements Runnable{//4��;
   @Override
   public void run() {
      System.out.println("RunThread");
      //5��;
   }
}//class RunThread;

/* 1.Ex13QuizŬ������ ThreadŬ������ ����� Ŭ������ ����
 * 2.run()�޼ҵ带 Override�ϴµ� ������ Ex13QuizŬ������ ���������� ���
 * 3.Ex13Quiz�� ������ ��ü th1�� �����ϰ� start����
 * 4.Runnable�� ������ Ŭ���� RunThread�� ����
 * 5.run()�޼ҵ�� RunThread�� Thread���� ���
 * 6.main �����忡�� RunThread�� ������ ��ü th2�� ���� �� start
 * 7.main �������� ������ ���� main�� ������ ������ ���
 * 8.start���� main������� th1�� th2�� ���� �ɽñ��� ������ ����
 * 9.main ������ ������ �� ���� �� �ٽ� th1�� thr2�� �����ϰ� start
 * 10.th1�� th2�� ����ñ��� main ������� ����ġ ���ϵ��� ó��(isAlive()���) --> �������� join()���� ���� ���ٰ� ��
 */