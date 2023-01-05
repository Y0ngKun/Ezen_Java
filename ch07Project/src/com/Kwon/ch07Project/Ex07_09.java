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
		//cart 총 배열이 10 이므로 객체 생성이 10개를 넘으면 에러발생
		
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

	// Object클래스의 toString을 오버라이딩한다.
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer0709 extends Product0709 {
	Computer0709() {
		super(100);
	}

	// Object클래스의 toString을 오버라이딩한다.
	@Override
	public String toString() {
		return "Computer";
	}

}

class Audio0709 extends Product0709 {
	Audio0709() {
		super(50);
	}

	// Object클래스의 toString을 오버라이딩한다.
	@Override
	public String toString() {
		return "Audio";
	}
}

class buyer0709 extends Product0709 {
	int money = 1000;
	int bonusPoint = 0;

	Product0709[] cart = new Product0709[10];// 원소를 10개로 지정
	//	Vector cart = new Vector();//기본 10개 추가 할 수있는 객체생성
	int i = 0;// 배열의 색인번호로 활용

	void buy(Product0709 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;//그냥 void 메소드 안에 있어서 리턴이 필요없지만 if 메서드를 종료하라는 의미;
		}

		money -= p.price;//money = money - p.price();
		bonusPoint += p.bonusPoint;

		cart[i++] = p;	
		//Vector를 사용했으면 cart.add(p); 

		System.out.println(p+"을/를 구입하셨습니다");
		//print문에서 객체를 사용하면 자동으로 .toString()메서드가 추가
		System.out.println(p.toString()+"를 구입하셨습니다");

	}
	void summary() {
		int sum = 0;
		String itemList = "";
		for (int i = 0; i<cart.length;i++) {
			if(cart[i]==null){break;}
			sum += cart[i].price;
			itemList +=cart[i]+",";
		}
		System.out.println("총금액은 " + sum);
		System.out.println("제품리스트는 " + itemList);
	}
}
