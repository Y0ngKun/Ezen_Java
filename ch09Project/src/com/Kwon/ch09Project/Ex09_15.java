package com.Kwon.ch09Project;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex09_15 {

	public static void main(String[] args) {
		
		int i = new Integer("100").intValue();
		//���ڿ��� ���ڷ� �޾� Integer��ü�� ���� �� intValue()�� int�� ��ȯ
		int i2 = Integer.parseInt("100");
		//Integer.parseInt�� int�� ��ȯ 
		Integer i3 = Integer.valueOf("100");
		//valueOf�� wrapper Ŭ������ ��ȯ
		int ix = Integer.valueOf("100");
		//��ȯ�� wrapperŬ������ Integer�� �ڵ����� int�� ��ȯ
		
		
		int i4 = Integer.parseInt("100",2);
		//���ڿ� 100�� 2������ ó��, ����� 10���� = 4
		int i5 = Integer.parseInt("100",8);
		//���ڿ� 100�� 8������ ó��, ����� 10���� = 64
		int i6 = Integer.parseInt("100",16);
		//���ڿ� 100�� 16������ ó��, ����� 10���� = 256
		int i7 = Integer.parseInt("FF",16); 
		//���ڿ� FF�� 16������ ó��, ����� 10���� = 255
		//16 * 15 + 15
		
		//int i8 = Integer.parseInt("FF"); //NumberFormatException ���� �߻�
		//Integer.parseInt("FF")�� 10�����ε� 10�������� FF��� ����
		
		Integer i9 = Integer.valueOf("100",2);
		//���ڿ� 100�� 2������ ó��, ����� 10���� = 4
		Integer i10 = Integer.valueOf("100",8);
		//���ڿ� 100�� 8������ ó��, ����� 10���� = 64
		Integer i11 = Integer.valueOf("100",16);
		//���ڿ� 100�� 16������ ó��, ����� 10���� = 256
		Integer i12 = Integer.valueOf("FF",16);
		//���ڿ� FF�� 16������ ó��, ����� 10���� = 255
		//Integer i13 = Integer.valueOf("FF"); 
		//10�����ε� 10�������� FF��� NumberFormatException ���� �߻�
		
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println("100(2) -> " + i4);
		System.out.println("100(8) -> " + i5);
		System.out.println("100(16) -> " + i6);
		System.out.println("FF(16) -> " + i7);
		
		
		System.out.println("100(2) -> " + i9);
		System.out.println("100(8) -> " + i10);
		System.out.println("100(16) -> " + i11);
		System.out.println("FF(16) -> " + i12);
	
	
	}

}
