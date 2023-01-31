package com.Kwon.ch13Project;

import java.util.ArrayList;

public class Ex13_15 {
	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		new Thread(new Cook(table)).start();
		//������ ����(Runnable ��ӹ��� Cook(Cook�޼ҵ�()�� String table))
		new Thread(new Customer(table, "donut"),"CUSTOMER_1").start();
		new Thread(new Customer(table, "burger"),"CUSTOMER_2").start();
		
		Thread.sleep(2000); 
		//sleep�� try-catch�� ����ؾ��ϴµ� ���θ޼ҵ忡�� throw Exception���� ������ ��밡��
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
			//���� ��ȣ ���Ƿ� �̵�
			table.add(table.dishName[idx]); //�丮�� (Cook Ŭ����)�� �����ϴ� �丮�� ���̺� �߰�
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//while;
	}//run method;
}//class Cook;

class Table{
	//Cook�� CustomerŬ������ �������� ����ϴ� �ڿ��� Ŭ����
	String [] dishName = new String[]{"donut","donut","burger"};
	final int MAX_FOOD = 6; //Table�� �����Ǵ� �ִ� �丮 ����
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) {
		//����ȭ �޼���� 1���� �����常 ��� ����
		while (dishes.size()>=MAX_FOOD) {
			String name = Thread.currentThread().getName();//���� �� �޼��带 ����ϴ� �����带 Ȯ��
			System.out.println(name + "is waiting."); //���̺�� �ִ� �丮 ���� �̹Ƿ� ��⸦ ���� ����
			try {
				wait(); //Cook �����带 ��� ��Ŵ, wait(),notify���� Object���̹Ƿ� ���⼭�� Table�� �޼���
				//wait()�� ���� ����ȭ �����带 ����ϴ� thread�� Table��ü�� waiting pool�� ����
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}//while;
		dishes.add(dish); //���⼭ .add()�޼ҵ�� ArrayList�� add�޼ҵ��̴�.
		notify(); //��ٸ��� �ִ� Customer �����带 ����� ����
		System.out.println("Dishes" + dishes.toString());
	}//add method;
	
	public void eat (String dishName) { //dishName�� ���� �丮��
		synchronized (this) { //����ȭ�� ���� Table��ü�� ����
			String name = Thread.currentThread().getName(); //���� �� �޼��带 ����ϴ� ������ Ȯ��
			while (dishes.size() == 0) {
				System.out.println(name + "is wating.");//Customer ������ ���
				try {
					wait(); //Customer �����带 ��ٸ��� �Ѵ�.
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}//while;

			//���̺� �丮�� �ִ� ���
			while (true) {
				for (int i = 0; i < this.dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i); //ArrayList�� remove(���ι�ȣ) �ش� ����� ���� ����
						notify(); //wait�ϰ� �ִ� Cook�� ����� ����.
						return;
					}
				}
				//���̺� �Ծ ���� �ϰ� �� �Ŀ��� �丮�� ���� ���� �� �� ���� wait
				try {
					System.out.println(name + " is wating. ");
					wait(); //���ϴ� ������ ���� Customer �����带 ��ٸ��� �Ѵ�.
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
