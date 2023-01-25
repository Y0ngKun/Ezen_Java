package com.Kwon.ch12Project;

import java.util.ArrayList;

public class Ex12_06  {
	public static void main(String[] args) {
		
		for(Direction2 d : Direction2.values()) {
			//enum��.values�� enum���� ������ �ִ� ������ ����(���)�� �迭�� ��ȯ
			System.out.printf("%s=%ds%n",d.name(),d.getValue(),d.getSymbol());
		}
		
		Direction2 d1 = Direction2.EAST;//enum�� ������ ����� ��ä�� ó��
		Direction2 d2 = Direction2.SOUTH;//enum�� ������ ����� ��ä�� ó��
		
		System.out.printf("%s=%ds%n",d1.name(),d1.getValue(),d1.getSymbol());
		System.out.printf("%s=%ds%n",d2.name(),d2.getValue(),d2.getSymbol());
		
	}//main method;
}//main class;
enum Direction2 {
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	//����� ���� ������ �ο��ô�()�ȿ� �ο��Ѵ�(���⼭�� 2�� ���� ��)
	//��� �����Ŀ� ;�� ���
	//��ȣ���� ù��° ���ڴ� value�̰�, �ι�° ���ڴ� symbol������ ��Ÿ��
	//��ȣ�ȿ� 2���� ���ڸ� �ʱ�ȭ�ϴ� �����ڿ� �ΰ��� ���ڸ� ��Ÿ���� ��������� ������־���Ѵ�.
	private final int value;
	private final String symbol;
	
	private Direction2(int value, String symbol) {
		// ���������ڴ� ���������� private�̴�
		this.value = value;
		this.symbol = symbol;
	}

	//�ܺο��� ������� ������ ��������ϴ� get�޼��� �ۼ�
	public int getValue() {
		return value;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String toString() {
		return name() + getSymbol();
	}
	
}//Direction2;

