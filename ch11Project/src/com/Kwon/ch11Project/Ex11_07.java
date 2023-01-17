package com.Kwon.ch11Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex11_07 {
	public static void main(String[] args) {
		
		String[] strArr = new String [5];
		strArr[0] = "cat";
		strArr[1] = "dog";
		strArr[2] = "lion";
		strArr[3] = "tiger";
		strArr[4] = "02";
		
		Arrays.sort(strArr);
		//���ڿ� �迭�� �����ϹǷ� StringŬ������ ������ Comparable
		//�������̽��� compareTo()�޼��带 ���� ����
		System.out.println("Arrays.toString(strArr) = "+Arrays.toString(strArr));
		//String�� �ø����� ����(�ڵ��ȣ�� �������� ��ȣ�� �����ͺ��� ū������)
		//�빮�ڰ� �ҹ��ں��� ������ ���ڰ� �빮�ں��� ����
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		//CASE_INSENSITIVE_ORDER�� Comparator��ü������ �߰����� ���� ���� (��ҹ��� �Ȱ���,�ҹ��� ? ����)
		System.out.println("CASE_INSENSITIVE_ORDER = "+Arrays.toString(strArr));
	 	
		Arrays.sort(strArr, new Descending());
		//class Descending���� ������ (��������) , (��ȣ�� ū�� ���� ���� ������) ���� ����
		System.out.println("Descending Ŭ���� ���� = "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, Collections.reverseOrder());
		//��������(��ȣ�� ū �� ���� ���� ������)�� Arrays.sort(strArr, Collections.reversOrder()) ����ص� ��
		
		System.out.println("Collections.reverseOrder() = " + Arrays.toString(strArr));
		
		
	}//main method;
}//main class;

class Descending implements Comparator{
	//�߰����� ���� ���� ���� Ŭ����
	//Comparator -�������̽��� ���� �߻�޼��带 ����
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable�� ������ ��ü�̾�� �񱳰���
			Comparable c1 = (Comparable)o1; 
			Comparable c2 = (Comparable)o2; 
			
			//o1 �� o2�� String�̰� String�� Comparable�� compareTo�� ���� 
			return c1.compareTo(c2) * -1; //������(��������)
			//c1.compareTo(c2)�� �������� ����
		}//if;
		return -1;
	}//public int compare;
}//class Descending;