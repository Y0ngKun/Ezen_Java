package com.Kwon.ch09Project;

public class Ex09_10 {

	public static void main(String[] args) {
		
		int iVal = 100;
		String strVal = String.valueOf(iVal);
//StringŬ������ Ŭ������(static)�޼ҵ��� valueOf()�� �Ķ������ ���������� �޸��ϴ� �����ε��� �޼ҵ���̴�.
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //���ڿ��� �����ϸ� ���ڿ�(+�� ���ϱⰡ �ƴϰ� ���տ�����)
		
		//�� wrapperŬ����(�⺻���� Ŭ���������� ó��)�� parse�������� �޼��带 �̿� �⺻������ ����
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		//parse(���������ǹ��ڿ�)�� �ƴϸ� ��ȯ ����
		//+���� ���ڿ� ��ȯ�� jdk1.7 �̻� ���� ����
		System.out.println(sum);
		
		//ValueOf()�� ����Ͽ� ��ȯ
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		//parse�� �⺻������ ��ȯ , valueof�� Ŭ���������� ��ȯ
		//�⺻���� Ŭ���������� ��ȯ�� �ڽ̰����� ����Ѵ�.
		System.out.println(sum2);
		
		System.out.println(String.join("",strVal,"+", strVal2,"= ") + sum);
		//String join(CharSequence delimiter,CharSequence... elements)
		//join(������,�ڿ� �Ķ���ʹ� ���ڿ��� �̿��Ͽ� ����� ���ڿ��� �������)
		//...dms �Ķ���� ���� ������(varargs)--���⼭�� 4���� �Ķ����(����) ���
		System.out.println(strVal + "+" + strVal2 + " = " + sum2);
		
		//parseInt("���ڹ��ڿ�",����)�� ������ ������ �ִ� ���ڵ� ��� ����
		//parseInt("abc123",16)�� 16������ a,b,c,d,e,f�� �����Ƿ� ��ȯ ����
		
		
		
		
		
		int i = 101;
		String vi = String.valueOf(i);
		
		String v = "100";
		int vi2 = Integer.valueOf(v);
		

	}

}
