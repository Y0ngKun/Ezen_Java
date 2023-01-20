package com.Kwon.ch12Project;

enum Direction {EAST, SOUTH, WEST, NORTH}
//enum�� ������� �����̹Ƿ� �̸��� ��� �빮�ڷ� �ۼ�
//���� �ڵ����� 0���� 1�� �����Ͽ� ���� ����� �־���

public class Ex12_05 {

	public static void main(String[] args) {
		
		//enum�� �������� ������ Ŭ����ó�� ����, enum�� �������� �̸�
		//enum�� ���� enum�̸�.��� �̸����� ǥ��(Ŭ������ ����ó�� ����)
		Direction d1 = Direction.EAST; //���� 0
		Direction d2 = Direction.valueOf("WEST"); //���� 2
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		//enum ��ü�� ������� ����
		System.out.println("d1 : "+d1);
		System.out.println("d2 : "+d1);
		System.out.println("d3 : "+d1);
		
		//enum��ü �񱳴� ���� �񱳴� == ,compareTo()���
		//�ٸ� �� �����ڴ� ��� �Ұ� >,<,>=,<= ���
		System.out.println("d1 == d2 ? : " + (d1==d2));
		System.out.println("d1 == d3 ? : " + (d1==d3));
		//equal()�� ��� ����
		System.out.println("d1.equals(d3) : " + d1.equals(d3));
//		System.out.println("d2 < d3 ? : " + d2<d3); //���� 
		
		//compareTo ��� ���� �հ�ü-�ް�ü(0,-,+)
		//compareTo�� enum����� ���� ��
		//enum��ü�� Enum��ü�� (��Ӱ���)
		System.out.println("d1.compareTo(d3) ? : "+ d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? : "+ d1.compareTo(d2));
		
		
		switch(d1){//switch case ���� ���ô� ��� �̸��� ���(enum�̸�.��� ���Ұ�)
		case EAST : System.out.println("The direction is EAST"); break;
		case SOUTH : System.out.println("The direction is SOUTH"); break;
		case WEST : System.out.println("The direction is EAST"); break;
		case NORTH : System.out.println("The direction is EAST"); break;
		default : System.out.println("Invalid direction");
		}//switch;
		
		
		Direction[] dArr = Direction.values();
		//values()�� enum������ ����(static��),enum�迭�� ��ȯ(enum�� Enum��ü)
		//values�� valueOf�� staticó�� enum�̸����� ����
		for(Direction d : dArr) {
			//name()�� ordinal()�޼���� �ֻ��� Ŭ���� Enum�� �����ϴ� �޼���
			//ordinal()�� ���ڰ�(�����)��ȯ
			System.out.printf("%s=%d%n",d.name(), d.ordinal());
			//enum ��ü.name()�� �����, enum ��ü.ordinal()�� ��ҹ�ȣ(!!)
		}//for;

	}//main method;
}//main class;
