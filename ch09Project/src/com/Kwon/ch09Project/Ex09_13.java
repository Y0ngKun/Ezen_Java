package com.Kwon.ch09Project;

import static java.lang.Math.*;
import static java.lang.System.*;


public class Ex09_13 {

	public static void main(String[] args) {
		
		double val = 90.7552;
		out.println("round("+ val +")=" + round(val));
		//System�� Math ��� �����ϰ� ���
		//long round(double d)���� ó�� - �Ҽ��� ù�ڸ����� �ݿø��� long�� ����
		
		val *= 100; //== val = val * 100;
		System.out.println(val);
		out.println("round("+ val +")=" + round(val));
		//�Ҽ��� 3° �ڸ����� �ݿø�
		out.println("round("+ val +")/100 =" + round(val)/100);
		//100���� ���� ������ �⺻ ���� long������ ������
		out.println("round("+ val +")/100.0 =" + round(val)/100.0);
		//100.0���� �Ἥ �Ҽ��� �⺻���� double������ ������
		System.out.println();
		System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
		//double java.lang.Math.ceil(double a)�� double�� �޾Ƽ� ������ �ø��� double�� ��ȯ
		System.out.println("floor()�޼���� ������ ����" + floor(1.5));
		System.out.println("rint�޼���� ���� ����� double�� ���� ��ȯ�ϳ� ���߾� ���� .5��"+"¦������ ��ȯ"+rint(1.5));
		
		//����ó��
		System.out.println("������ ó���� ����� ������ �ݿø� -1.6 : " + round(-1.6));
		System.out.println("������ ó���� ����� ������ �ݿø� -1.6 : " + round(-1.3));
		System.out.println("������ ó���� ����� ������ �ݿø� -1.6 : " + round(-1.5));
		System.out.println("������ ó���� ����� ������ �ݿø� -1.6 : " + ceil(-1.5));
		System.out.println("������ ó���� ����� ������ �ݿø� -1.6 : " + floor(-1.5));
		

	}//main method;
}//main class;
