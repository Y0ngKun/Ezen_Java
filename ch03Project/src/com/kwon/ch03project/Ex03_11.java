package com.kwon.ch03project;

public class Ex03_11 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//��ȣ���� double * int --> double�� 3141.592
		//MathŬ������ �Ҽ��� ù�ڸ����� �ݿø��ϴ� round(3141.592)�� 3142L�� ��ȯ
		//�Ҽ��� ��° �ڸ��� ���� pi�� double shorPi�� ����� ���� 1000.0���� ����
		System.out.println(shortPi);
		
		double pi1 = 3.141592;
		double shortPi1 = Math.round(pi1 * 1000) / 1000f;
		
		System.out.println(shortPi1);
		
		
	}

}
