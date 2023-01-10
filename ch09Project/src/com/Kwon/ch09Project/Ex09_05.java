package com.Kwon.ch09Project;

public class Ex09_05 {

	public static void main(String[] args) {
		
		//Ŭ���� ��ü�� ��� ���� ���� �ľǽÿ��� toString()�� �������ؼ� ���
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("DIAMOND",25);//2���� ���ڷ� ȣ��
		
		//Card2�� �������� toString���()
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//print�� �ȿ��� ����Ϸ��� ��ü�� ������ �ڵ����� toString()�� �پ ��µ�
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
	
	//Object�� toString()�� Override�ؼ� ��� �������� ���
	@Override
	public String toString() {
		return "kind : " + kind + ",number" + number;
	}

} //Class Card2;



