package com.Kwon.ch06Project;

public class Ex06_12 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		//�⺻�� �����ڷ� ����� CarŬ���� ��ü c1�� ��������� �ʱⰪ�� �⺻������ ������
		//color�� null , geartype�� null, door�� 0;
		c1.color = "red";
		c1.geartype = "auto";
		c1.door = 4;
		
		System.out.println("c1 color = " + c1.color);
		System.out.println("c1 color = " + c1.geartype);
		System.out.println("c1 color = " + c1.door);
		
		//��ü �����ÿ� �����ڸ� �̿��Ͽ� �ʱ�ȭ
		Car1 c2 = new Car1("dark","manual",3);
		System.out.println("c2 color = " + c2.color);
		System.out.println("c2 color = " + c2.geartype);
		System.out.println("c2 color = " + c2.door);
	}

}
//������ package���� ������ Ŭ������ ���Ұ�
class Car1 {
	String color;
	String geartype;
	int door;
	//�������� ���� �����ڴ� class�� ���� �����ڿ� ��ġ
	public Car1(){
		;
	}

	// �Ķ��Ÿ�� ���� ������ ����(�⺻�� �����ڴ� ��� �Ұ��ϹǷ� ��������� ����)
	Car1(String c, String g, int d) {
		color = c;
		geartype = g;
		door = d;
	}
}
