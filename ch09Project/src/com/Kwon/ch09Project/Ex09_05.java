package com.Kwon.ch09Project;

public class Ex09_05 {

	public static void main(String[] args) {
		
		//클래스 객체의 멤버 변수 값을 파악시에는 toString()을 재정의해서 사용
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("DIAMOND",25);//2개의 인자로 호출
		
		//Card2에 재정의한 toString사용()
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//print문 안에서 출력하려는 객체를 넣으면 자동으로 toString()이 붙어서 출력됨
		System.out.println(c1);
		System.out.println(c2);
		

	}//main method;

}//main class;


class Card2 {
	String kind;
	int number;

	Card2() {this("SPADE", 1);}

	Card2(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	//Object의 toString()을 Override해서 멤버 변수값을 출력
	@Override
	public String toString() {
		return "kind : " + kind + ",number" + number;
	}

} //Class Card2;



