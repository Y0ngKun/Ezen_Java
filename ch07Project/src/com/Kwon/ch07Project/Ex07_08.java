package com.Kwon.ch07Project;

public class Ex07_08 {//메인 클래스(자바 파일 이름과 같음)

	public static void main(String[] args) {
		//매개변수(파라메타)의 다형성
		Buyer b = new Buyer();
		b.buy(new Tvex0708());//Product 파라메터에 하위 클래스인 Tvex0708를 사용
		b.buy(new Computer());
		
		System.out.println("남은 돈은: " + b.money);
		System.out.println("보너스는 : " + b.bonusPoint);
		
	}//main method;

}//main class;

class Product{//extends Object가 생략 되어있는것과 마찬가지
	//단독적으로 클래스파일을 따로 만드는 것이 좋으나 편의를 위해 여기서 만듦
	//접근 제어자(public or default)중에 default만 쓸 수 있다
	int price; //접근 제어자는 디폴트
	int bonusPoint;
	
	Product(){
		//다른 생성자가 만들어져 있을시(바로 밑에) 기본 생성자도 사용하려면 명시적으로 작성해준다
		//접근제어자는 default 보통 클래스의 접근제어자를 따름}
	}

	public Product(int price) {
		super();
		this.price = price;//멤버변수와 파라메타 변수명이 동일할 때 구분을 위해 this로 구분
		bonusPoint = (int)(price/10.0);
	}
	
}//class Product;

class Tvex0708 extends Product{
	//생성자
	Tvex0708(){
		//상위 클래스의 생성자중 파라메터 1개있는 생성자를 호출
		super(100);
	}
	
	@Override//상위클래스의 메서드를 재정의(파라메터값 재정의)할 때 사용하는 어노테이션
	//toString()메서드는 Object의 클래스의 메서드
	//객체값을 문자열로 변환
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
}
class Buyer{//구매자를 class화
	int money = 1000; //현재 보유액
	int bonusPoint = 0;
	
	//물건을 구매하는 메서드
	void buy(Product p) {
		//메서드의 파라메타에 상위클래스인 Product를 이용하여 다형성을 구현
		//다형성을 활용하지 않으면 파라메터가 bonusPoint과 Computer를 가진 메서드를 따로 따로 만들어 주어야 한다.
		//buy메서드를 사용시 인자로 Product의 하위클래스인 Tvex0708과 computer객체를 사용
		//파라메터로 받은 하위 클래스 객체가 여기서는 사용(하위 클래스 메소드 사용가능)
		 if(money < p.price) {
			 System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			 return;//그냥 void 메소드 안에 있어서 리턴이 필요없지만 if 메서드를 종료하라는 의미;
			 
		 }
		 money -= p.price;//money = money - p.price();
		 bonusPoint += p.bonusPoint;
		 System.out.println(p+"를 구입하셨습니다");
		 //print문에서 객체를 사용하면 자동으로 .toString()메서드가 추가
		 System.out.println(p.toString()+"를 구입하셨습니다");
	}
}
