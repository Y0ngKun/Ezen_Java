package com.Kwon.ch10Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_08 {

	public static void main(String[] args) {
		
		Date today = new Date();
//		Calendar today = Calendar.getInstance();
		
		System.out.println("today ��ü : " + today);
		//Fri Jan 13 12:37:42 KST 2023  - > �⺻�� ����ϸ� �̷��� ����
		
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		SimpleDateFormat sdf5,sdf6,sdf7,sdf8,sdf9,sdf10;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		//��(Month)�� �빮�� ���(!!)
		sdf2 = new SimpleDateFormat("''yyyy�� MMM dd�� E����");
		//E�� ����, '�� Ư�����ھտ� �ٿ��� Ư�����ڸ� �Ϲ� ���ڷ� ó��
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:ss.SSS");
		//H(�빮��)�� 24�ð� Ÿ�� 0~23 /  h(�ҹ���)�� 12�ð� ���� 1~12
		//s(�ҹ���)�� �� 0~59  /  S(�빮��) �и������� 0~999 
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//a�� ����,���� ǥ�� 
		sdf5 = new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		//D�� �� �� ���° �� ǥ��
		sdf6 = new SimpleDateFormat("������ �� ���� d��° ���Դϴ�.");
		//d�� ���� ���° �� ǥ��
		sdf7 = new SimpleDateFormat("������ �� ���� w��° �� �Դϴ�.");
		//w�� ���� ���° �� ǥ��
		sdf8 = new SimpleDateFormat("������ �� ���� W��° �� �Դϴ�.");
		//W�� ���� ����� �� ǥ��
		sdf9 = new SimpleDateFormat("������ �� ���� F��° E�����Դϴ�.");
		//F�� ���� �° ���� ǥ��
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		System.out.println();

		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));

		

	}

}
