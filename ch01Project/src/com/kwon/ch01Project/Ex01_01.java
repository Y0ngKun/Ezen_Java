package com.kwon.ch01Project;

public class Ex01_01 {// Ŭ���� �̸� Ex01_01�� �ڹ������� �̸��� ����
	// �� �� �� �ּ�
	/*
	 * �����ٿ� �� ģ �ּ�
	 * 
	 */
	// /** ������ * / ����ȭ �ҽÿ� ����ϴ� �ּ�

	public static void main(String[] args) {
		System.out.println("Hello World");// �޼��� ���๮���� ���� ;�� �־���Ѵ�.
		int x = 1; // ���� x�� ����� ���� 1�� �����Ѵٴ� ���๮���� ���� ;�� �־�� �Ѵ�.
		int y = 2; // ���� ���๮�� �� �ٿ� �ϳ����� ������ �� �� �̻� ����ص� ����.
		double k = 0.6; //�Ǽ����� float�� double
		var result = x + y + k;
		int result2 = y + (int) Math.round(k); // �Ҽ��� �ݿø��Ͽ� ����

		System.out.println(result); // sysout���� ���� ctrl+space���� �ڵ��ϼ�
		System.out.println("Hello");
		System.out.println(k);
		System.out.println(result2);
		System.out.println("1");
	}

}
