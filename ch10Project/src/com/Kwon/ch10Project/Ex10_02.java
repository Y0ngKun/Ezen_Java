package com.Kwon.ch10Project;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		//���ϰ��� 1~7������ ��ȯ�Ѵ� (1���� 7���� ���ϰ����� ����) "" ��ĭ�� ���� ��ȣ 0���� ��������
		Calendar date1 = Calendar.getInstance(); //��ü ���� ������ ����ð�
		Calendar date2 = Calendar.getInstance();
		
		//Calendar ��ü�� �� ������Ҹ� �����ϱ� ���� set�޼��带 ���
		//month�� ��� 0���� �����ϱ� ������ 4���� ��� 3���� �����ؾ��Ѵ�
		//date1.set(2019, Calendar.APRIL, 29);�� ���� �� ���� �ִ�
		//������� �����ϴ� set�޼���� 0���� �������� �����ؼ� ����
		date1.set(2019, 3, 29);
		//void set(int year, int month, int date);
		//dat1.set (2019,Calendar.APRIL, 29);
		System.out.println("date1�� " + toString(date1)+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�, ");
		//toString(date1)�� Object�� toString()�� �ƴϴ�.
		//Calendar�� toString()�� �������̵�� �Ǿ� ������ Calendar�� ��� ��������� ǥ���ع�����.
		//������ �ʿ��� Calendar�� ��Ҹ� ���ڿ��� ����ϵ��� �޼��带 �������Ѵ�.
		System.out.println("����(date2)�� " + toString(date2)+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�");
		
		// �� ��¥���� ���̸� ��������, .getTimeInMillis() 1000/1�� ������ ��ȯ�ؾ� �Ѵ�.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		//getTimeInMillis�� ���ϰ��� pofix(unix)Ÿ���� 1970.1.1 0�� �������� ����� �ð��� �и�������� ��ȯ
		System.out.println("�׳�(date1)���� ����(date2)���� " + difference + "�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ� " + difference/(24*60*60)+ "���Դϴ�");
		//1��  = 24*60*60 �̴�
		
		
	
	}//main method;
		
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� " + (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE) +"�� "; 
	}
	
}//main class;
