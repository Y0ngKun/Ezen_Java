package com.Kwon.ch06Project;

public class Ex06_03 {

	public static void main(String[] args) {
		
		//Class����(Static)�� Class.���������� ����
		System.out.println("card.width = " + Card.width);
		System.out.println("card.width = "+ Card.height);
		

		//�ν���Ʈ ������ ��ü�� �����Ͽ� ��ü.���������� ����
		Card c1 = new Card();
		//�⺻ �����ڴ� Class�� �����ڰ� �ϳ��� ���� �ÿ��� �����Ͻ� �ڹٰ� ����
		c1.kind = "spade";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Heart";
		c2.number = 8;
		
		//Ŭ�������� ��ü.class�� ������ �����ص� ����
		System.out.println("c1�� = " + c1.kind + "," + c1.number + "�̸�");
		System.out.println("c1�� ũ��� = " + c1.width + "," + c1.height + "�̸�");
		System.out.println("c2�� = " + c2.kind + "," + c2.number + "�̸�");
		System.out.println("c2�� ũ��� = " + c2.width + "," + c2.height + "�̸�");
		
		c1.width = 	50;
		c1.height = 80;
		//width�� height�� �������� ����ϴ� Ŭ������ �����̹Ƿ� c2�� �����ϴ��� ����� ��
		
		System.out.println("c2 width = " + c2.width);
		System.out.println("c2 height = " + c2.height);
		
		//������ �ٶ����� ����� �Ʒ��Ͱ��� ���� Ŭ������ Ŭ����.������ �����ؼ� ����� ��
		Card.width = 51;
		Card.height = 81;
		
	}

}
