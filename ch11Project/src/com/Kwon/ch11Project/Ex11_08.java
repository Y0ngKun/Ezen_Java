package com.Kwon.ch11Project;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ex11_08 {
	public static void main(String[] args) {
		
		Integer[] arr = {30,50,10,40,20};
		//�⺻���� �ڽ��� wrapperŬ������ Integer�� ��ȯ�� ����ڽ����� �ڵ� ó��
		
		Arrays.sort(arr);
		//sort�ÿ��� wrapperŬ������ IntegerŬ������ ������ comparable�� compareTo�� ���� ����
		//���� ���� ������������ ����
		System.out.println(Arrays.toString(arr));
		
		//������(��������)(ū������ ���� �� ������)
		Arrays.sort(arr, Collections.reverseOrder());
		//CollectionsŬ���� �ȿ� reverseOrder()�޼ҵ� ��� (��������)
		//Ȥ�� ���� 11_07�� ���� DescendingŬ������ ���� ����ؾ� �Ѵ�.
		
		System.out.println(Arrays.toString(arr));
	
		
		
		
		
	}//main method;
}//main class;
