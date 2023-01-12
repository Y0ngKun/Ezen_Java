package com.Kwon.ch10Project;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance(); //���� (�ν��Ͻ� �����ϴ� ����)�� �ð�
		date.set(2019, 7, 31); //2019�� 8�� 31��
		
		System.out.println("ó�� ������ date : " + toString(date));
		System.out.println();//�ٹٲ�
		
		//Calendar��ü�� ���� ��ҿ� ���� ���ϰų� �� �� ����ϴ� add�޼���
		//add�޼���� ���õ� �ٸ� ���� ��ҵ� ����
		date.add(Calendar.DATE, 1); //date��ü�� ��¥�� 1��(��) ����
		System.out.println("add �޼��� ��� DATE +1 " + toString(date));
		
		date.add(Calendar.MONTH, -6);//6���� ��
		System.out.println("add �޼��� ��� MONTH -6 " +toString(date));
		
		date.add(Calendar.YEAR, -3); //3����
		System.out.println("add �޼��� ��� YEAR -3 " +toString(date));
		
		
		//roll�޼��嵵 ���� ��ҿ� ���� ���ϰų� �� �� ������
		//�ڽŸ� �����ϰ� ���� ��Ҵ� ���� ����
		
		date.roll(Calendar.DATE, -3);
		System.out.println("roll �޼��� ��� DATE - 1 : " + toString(date));
		//������ date���� 2016�� 3�� 1���ε� ��¥�� -1�ؼ� 31�� �ٲٰ� �� ���� ��ҿ��� ������ ��ġ�� �ʴ´�
		
		date.roll(Calendar.MONTH, -1);
		System.out.println("roll �޼��� ��� MONTH - 1 : " + toString(date));
		
		date.roll(Calendar.YEAR, -2015);
		System.out.println("roll �޼��� ��� YEAR - 2015 : " + toString(date));
		

	}//main method;

	static String toString(Calendar date) {
		String result = 
				date.get(Calendar.YEAR)+"�� " + 
				(date.get(Calendar.MONTH)+1) + "�� " 
				+ date.get(Calendar.DATE) +"�� "; 
		return result;
	}
	
}//main class;
