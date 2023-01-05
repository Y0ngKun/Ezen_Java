package com.Kwon.ch07Project;

import java.util.Vector;

public class Ex07_09 {

	public static void main(String[] args) {
		
		buyer0709 b = new buyer0709();
		
		b.buy(new Tv0709());
		b.buy(new Computer0709());
		b.buy(new Audio0709());
		
		b.buy(new Tv0709());
		b.buy(new Computer0709());
		b.buy(new Audio0709());
		
		b.buy(new Tv0709());
		b.buy(new Computer0709());
		b.buy(new Audio0709());
		
//		b.buy(new Tv0709());
//		b.buy(new Computer0709());
//		b.buy(new Audio0709()); 
		//cart �� �迭�� 10 �̹Ƿ� ��ü ������ 10���� ������ �����߻�
		
		b.summary();
		

	}

}

class Product0709 {
	int price;
	int bonusPoint;

	Product0709() {
	}

	Product0709(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10);
	}

}

class Tv0709 extends Product0709 {

	Tv0709() {
		super(50);
	}

	// ObjectŬ������ toString�� �������̵��Ѵ�.
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer0709 extends Product0709 {
	Computer0709() {
		super(100);
	}

	// ObjectŬ������ toString�� �������̵��Ѵ�.
	@Override
	public String toString() {
		return "Computer";
	}

}

class Audio0709 extends Product0709 {
	Audio0709() {
		super(50);
	}

	// ObjectŬ������ toString�� �������̵��Ѵ�.
	@Override
	public String toString() {
		return "Audio";
	}
}

class buyer0709 extends Product0709 {
	int money = 1000;
	int bonusPoint = 0;

	Product0709[] cart = new Product0709[10];// ���Ҹ� 10���� ����
	//	Vector cart = new Vector();//�⺻ 10�� �߰� �� ���ִ� ��ü����
	int i = 0;// �迭�� ���ι�ȣ�� Ȱ��

	void buy(Product0709 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;//�׳� void �޼ҵ� �ȿ� �־ ������ �ʿ������ if �޼��带 �����϶�� �ǹ�;
		}

		money -= p.price;//money = money - p.price();
		bonusPoint += p.bonusPoint;

		cart[i++] = p;	
		//Vector�� ��������� cart.add(p); 

		System.out.println(p+"��/�� �����ϼ̽��ϴ�");
		//print������ ��ü�� ����ϸ� �ڵ����� .toString()�޼��尡 �߰�
		System.out.println(p.toString()+"�� �����ϼ̽��ϴ�");

	}
	void summary() {
		int sum = 0;
		String itemList = "";
		for (int i = 0; i<cart.length;i++) {
			if(cart[i]==null){break;}
			sum += cart[i].price;
			itemList +=cart[i]+",";
		}
		System.out.println("�ѱݾ��� " + sum);
		System.out.println("��ǰ����Ʈ�� " + itemList);
	}
}
