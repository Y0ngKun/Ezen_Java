package com.Kwon.ch06Project;

public class Ex06_13 {

	public static void main(String[] args) {
		Car0613_01 c1 = new Car0613_01();
		Car0613_01 c2 = new Car0613_01("dark");

	}//main method;

}//main class;

class Car0613_01{
	String Color;
	String gearType;
	int door;
	
	Car0613_01(){
		this("white");//�ڱ� Ŭ������ �ٸ� �������� �Ķ���� �ϳ� ���� ������ ȣ��
	}
	Car0613_01(String Color){ // �Ķ��Ÿ 1���� �� 
		this(Color,"auto",4);//�ڱ� Ŭ������ �ٸ� �������� �Ķ���� ���� ���� ������ ȣ�� Color�� ���� �Ķ��Ÿ Ȱ��
		
	}
	Car0613_01(String Color,String gearType, int door){ // << �Ķ���� 3���� ��
		//��� ���� �̸��� �Ķ���� �̸��� �����ô� ��������� this�� ��뱸��
		//this�� �ڱ� Ŭ������ ��ü
		super();
		//this�� �ڽ� ��ü�� ��Ÿ���� �ν��Ͻ� ��ü�� ��� �޼��忡�� ���� ������ �����Ѵ�.
		this.Color = Color;
		this.gearType = "auto";
		this.door = door;
	}
	int sum(int a,int b) {return a+b;}
	void call() {this.sum(5, 10);}
	//�ڱ� Ŭ������ �ν��Ͻ� �޼��� ȣ��ô� �̸����� ȣ���ص� �ǳ� 
	//���� ��� tins.sum(5,10)���� sum(5,10)���� ȣ�� ����
	//��� �޼��忡 ������ �ڽ��� �ν��Ͻ� ��ü�� this�� ����ص� ����(�ǰ�)
} //class Car0613_01;


class Car0613_02{
	String Color;
	String gearType;
	int door;
	
	//������� �����ڰ� ����
	//�ڹ� �����Ϸ��� �⺻�����ڸ� �߰�
}


