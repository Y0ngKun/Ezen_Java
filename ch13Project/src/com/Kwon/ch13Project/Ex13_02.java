package com.Kwon.ch13Project;

public class Ex13_02 {

	public static void main(String[] args) {
		//main Thread �ϳ��� ����Ͽ� �۾�
		
		long startTime = System.currentTimeMillis();
		//currentTimeMillis()�� �и�������� �� posix ��
		//1970-01-01���� ���� �� ���� ����
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("-"));
			//"-"�� ������� �ʰ� new String("-")���� �ϸ� �ð��� ���� �� �ɸ�
			//���⼭�� �Ϻη� ����ߴ�
		}
		System.out.println("�ٹٲ�");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð�" + (startTime-endTime));
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		endTime = System.currentTimeMillis();
		System.out.println("�ٹٲ�2");
		System.out.println("�ҿ�ð�2" + (startTime-endTime));
		
	}//main method;
}//main class;
