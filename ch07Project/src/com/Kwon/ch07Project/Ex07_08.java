package com.Kwon.ch07Project;

public class Ex07_08 {//���� Ŭ����(�ڹ� ���� �̸��� ����)

	public static void main(String[] args) {
		//�Ű�����(�Ķ��Ÿ)�� ������
		Buyer b = new Buyer();
		b.buy(new Tvex0708());//Product �Ķ���Ϳ� ���� Ŭ������ Tvex0708�� ���
		b.buy(new Computer());
		
		System.out.println("���� ����: " + b.money);
		System.out.println("���ʽ��� : " + b.bonusPoint);
		
	}//main method;

}//main class;

class Product{//extends Object�� ���� �Ǿ��ִ°Ͱ� ��������
	//�ܵ������� Ŭ���������� ���� ����� ���� ������ ���Ǹ� ���� ���⼭ ����
	//���� ������(public or default)�߿� default�� �� �� �ִ�
	int price; //���� �����ڴ� ����Ʈ
	int bonusPoint;
	
	Product(){
		//�ٸ� �����ڰ� ������� ������(�ٷ� �ؿ�) �⺻ �����ڵ� ����Ϸ��� ��������� �ۼ����ش�
		//���������ڴ� default ���� Ŭ������ ���������ڸ� ����}
	}

	public Product(int price) {
		super();
		this.price = price;//��������� �Ķ��Ÿ �������� ������ �� ������ ���� this�� ����
		bonusPoint = (int)(price/10.0);
	}
	
}//class Product;

class Tvex0708 extends Product{
	//������
	Tvex0708(){
		//���� Ŭ������ �������� �Ķ���� 1���ִ� �����ڸ� ȣ��
		super(100);
	}
	
	@Override//����Ŭ������ �޼��带 ������(�Ķ���Ͱ� ������)�� �� ����ϴ� ������̼�
	//toString()�޼���� Object�� Ŭ������ �޼���
	//��ü���� ���ڿ��� ��ȯ
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
}
class Buyer{//�����ڸ� classȭ
	int money = 1000; //���� ������
	int bonusPoint = 0;
	
	//������ �����ϴ� �޼���
	void buy(Product p) {
		//�޼����� �Ķ��Ÿ�� ����Ŭ������ Product�� �̿��Ͽ� �������� ����
		//�������� Ȱ������ ������ �Ķ���Ͱ� bonusPoint�� Computer�� ���� �޼��带 ���� ���� ����� �־�� �Ѵ�.
		//buy�޼��带 ���� ���ڷ� Product�� ����Ŭ������ Tvex0708�� computer��ü�� ���
		//�Ķ���ͷ� ���� ���� Ŭ���� ��ü�� ���⼭�� ���(���� Ŭ���� �޼ҵ� ��밡��)
		 if(money < p.price) {
			 System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			 return;//�׳� void �޼ҵ� �ȿ� �־ ������ �ʿ������ if �޼��带 �����϶�� �ǹ�;
			 
		 }
		 money -= p.price;//money = money - p.price();
		 bonusPoint += p.bonusPoint;
		 System.out.println(p+"�� �����ϼ̽��ϴ�");
		 //print������ ��ü�� ����ϸ� �ڵ����� .toString()�޼��尡 �߰�
		 System.out.println(p.toString()+"�� �����ϼ̽��ϴ�");
	}
}
