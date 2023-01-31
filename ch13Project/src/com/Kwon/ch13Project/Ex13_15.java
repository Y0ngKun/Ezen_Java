package com.Kwon.ch13Project;

import java.util.ArrayList;

public class Ex13_15 {
	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		new Thread(new Cook(table)).start();
		//쓰레드 생성(Runnable 상속받은 Cook(Cook메소드()는 String table))
		new Thread(new Customer(table, "donut"),"CUSTOMER_1").start();
		new Thread(new Customer(table, "burger"),"CUSTOMER_2").start();
		
		Thread.sleep(2000); 
		//sleep은 try-catch로 사용해야하는데 메인메소드에서 throw Exception으로 던져서 사용가능
		System.exit(0);
	}//main method;
}//main class;

class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table, String food){
		this.table = table;
		this.food = food;
	}
	@Override
	public void run(){
		while (true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			String name =  Thread.currentThread().getName();
			table.eat(food);
			System.out.println(name + ": ate a " + food);
		}
	}//run method;
}//class Customer;

class Cook implements Runnable{
	private Table table;
	
	Cook(Table table){
		this.table = table;
	}
	@Override
	public void run(){
		while (true) {
			int idx = (int)(Math.random() * table.dishNum());
			//색인 번호 임의로 이동
			table.add(table.dishName[idx]); //요리사 (Cook 클래스)가 공급하는 요리를 테이블에 추가
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//while;
	}//run method;
}//class Cook;

class Table{
	//Cook과 Customer클래스가 공동으로 사용하는 자원용 클래스
	String [] dishName = new String[]{"donut","donut","burger"};
	final int MAX_FOOD = 6; //Table에 제공되는 최대 요리 개수
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) {
		//동기화 메서드로 1개의 스레드만 사용 가능
		while (dishes.size()>=MAX_FOOD) {
			String name = Thread.currentThread().getName();//현재 이 메서드를 사용하는 스레드를 확인
			System.out.println(name + "is waiting."); //테이블당 최대 요리 개수 이므로 대기를 위해 정지
			try {
				wait(); //Cook 쓰레드를 대기 시킴, wait(),notify등은 Object것이므로 여기서는 Table의 메서드
				//wait()는 현재 동기화 스레드를 사용하는 thread를 Table객체의 waiting pool로 보냄
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//while;
		dishes.add(dish); //여기서 .add()메소드는 ArrayList의 add메소드이다.
		notify(); //기다리고 있는 Customer 쓰레드를 깨우기 위함
		System.out.println("Dishes" + dishes.toString());
	}//add method;
	
	public void eat (String dishName) { //dishName은 먹은 요리명
		synchronized (this) { //동기화를 현재 Table객체에 적용
			String name = Thread.currentThread().getName(); //현재 이 메서드를 사용하는 스레드 확인
			while (dishes.size() == 0) {
				System.out.println(name + "is wating.");//Customer 스레드 대기
				try {
					wait(); //Customer 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}//while;

			//테이블에 요리가 있는 경우
			while (true) {
				for (int i = 0; i < this.dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i); //ArrayList의 remove(색인번호) 해당 요소의 값을 제거
						notify(); //wait하고 있는 Cook을 깨우기 위함.
						return;
					}
				}
				//테이블에 먹어서 제거 하고 난 후에는 요리가 새로 공급 될 때 까지 wait
				try {
					System.out.println(name + " is wating. ");
					wait(); //원하는 음식이 없는 Customer 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e.getCause());
				}
			}//while;
			
		}//synchronized;
	}//eat method;
	
	public int dishNum() {
		return dishName.length;
	}
}//class Table;
