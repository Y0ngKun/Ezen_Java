package com.Kwon.ch09Project;

public class Ex09_14 {
	public static void main(String[] args) {
//	Integer i = new Integer(100);//�ڹ� 9�������� �������� �ʴ� ���� ���
//	Integer i2 = new Integer(100);//�ڹ� 9�������� �������� �ʴ� ���� ���
	
	Integer i = 100; //�⺻������ ��ü������ �ڵ����� �ڽ�(����ڽ�)�� ��
	Integer i2 = 100; //�⺻������ ��ü������ �ڵ����� �ڽ�(����ڽ�)�� ��
	
	//Stringó�� ���ͷ��� �ʱ�ȭ�Ͽ� ��ü�� �����ϸ� JVM���� ������ ���̸� ���� ���(�ּҰ� ����)
	System.out.println("i == i2 ? "+ (i == i2));
	System.out.println("equals�� �� : " + i.equals(i2));
	//wrapperŬ������ equals�� ���� ���ϵ��� �������̵� ��.
	
	//�������� wrapperŬ������ ��ü�� �񱳿����� �ȵǾ campareTo()�޼��带 ���
	//������ �� ���� �� ��
	System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
	//compareTo�� ������ 0 �ٸ��� 0�� �ƴ� ��
	
	//toString()�� Override�Ǿ� WrapperŬ���� ��ü�� ���ڿ��� ��ȯ
	System.out.println("i.toString() = " + i.toString());
	
	//�� wrapperŬ������ ����� �����Ǿ� ����
	System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);	
	System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
	System.out.println("SIZE = " +Integer.SIZE + "bits"  );
	System.out.println("BYTES = " +Integer.BYTES + "bytes");
	System.out.println("TYPE = " +Integer.TYPE);
	
	
}
}