package com.kwon.project;

public class Ex05_02 {

	public static void main(String[] args) {
		int sum = 0;
		/*
		 * main �޼��� �ȿ� �ִ� ������ ���ú��� (��������)�� main method �ȿ����� ȿ���� �ִ�. ���ú����� �⺻���� ��� ����ÿ�
		 * �ʱ� ���� �ִ� ���� ����.
		 */
		float average = 0F;
		int[] score = {100, 88, 100, 100, 90};
		/*�迭����� ���ÿ� ���ͷ��� �ʱ�ȭ
		int[] score = new int[] {100,88,100,100,90} �� �����ϴ�.
		*/
		for(int i=0; i<score.length;i++) {
			sum += score[i];
//			sum = sum +score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
	}//main

}
