package com.Kwon.ch09Project;

public class Ex09_04 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//print�� �ȿ��� ����Ϸ��� ��ü�� ������ �ڵ����� toString()�� �پ ��µ�
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
