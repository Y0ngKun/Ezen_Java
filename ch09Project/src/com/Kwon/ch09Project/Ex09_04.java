package com.Kwon.ch09Project;

public class Ex09_04 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//print문 안에서 출력하려는 객체를 넣으면 자동으로 toString()이 붙어서 출력됨
		System.out.println(c1);
		System.out.println(c2);
		
	
	}//main method;

}//main class;

class Card{
	String kind;
	int number;
	Card(){
		this("SPADE",1);
	}
	Card(String kind,int number){
		super();
		this.kind = kind;
		this.number = number;
	}
	
	
}
