package com.Kwon.ch09Project;

import java.util.ArrayList;

public class Ex09_16 {

	public static void main(String[] args) {
		int i = 10;
		
		//�⺻���� ���������� ���� ����ȯ ����
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L; 
		// 100L�� �⺻���ε� Long��(wrapper Ŭ����)���� �ڵ� ����ȯ
		//�̸� ����ڽ��̶� �Ѵ�.
		
		int int2 = intg + 10;
		//���۰�ü�� + �⺻�� ������ JDK 1.5���� �����ϴ�
		//intg�� intValue()�� �ڵ� ÷��(�����Ϸ��� ����)
		
		long l = intg + lng; // int 10 + 100L
		//���������� ���굵 ����
		
		
		//�ڽ� - ��ڽ� ArrayList ���� ����� �߿�
		ArrayList<Integer> list = new ArrayList<>();
		list = new ArrayList<>();
		//ArrayList�� �迭�� ó���ϱ� ������ �� �÷��� (�������� ����)
		//<Integer>�� ���׸��̶� �θ��� ���������� �����ϴ� �Ű�����
		//���⼭�� list ��Ұ� ���� Integer������ �Ǿ��ִٴ� ��
		list.add(10);
		//�ڵ����� �ڽ� (����ڽ�)
		list.add(intg);
		int res = list.get(0);
		//Integer�� ��ȯ�ϳ� int�� ����
		//�� �ڵ����� ��ü���� ������ ��ȯ
		//�̸� ��ڽ��̶�� �Ѵ�.
		int res1 = list.get(1);
		
		System.out.println(res);
		System.out.println(res1);

	}//main method;

}//main class;
