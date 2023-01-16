package com.kwon.project;

import java.util.Arrays;
public class Ex05_Arrays {
//	int mem; = > ��� ����

	public static void main(String[] args) {
		
		//Arrays Ŭ������ ��� �޼��尡 static(Ŭ������)�޼���� ȣ��� -> Ŭ�����̸�.�޼����̸�()
		//Arrays.�޼����()
		
		//Arrays Ŭ����
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		//1���� �迭 ���� ��ȭ�� Arrays.toString(1���� �迭��);
		String strArr = Arrays.toString(arr);
		System.out.println(strArr);
		
		//2���� �迭 ���� ��ȭ�� Arrays.deepToString(2���� �迭��);
		System.out.println(Arrays.deepToString(arr2D));
		
		int[] arr1 = {0,1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		
		//1���� �迭 ��(arr,arr1)
		System.out.println("1���� �迭 �� : "+Arrays.equals(arr,arr1));
		
		//2���� �迭 ��(arr2D,arr2D1)
		System.out.println("2���� �迭 �� : " + Arrays.deepEquals(arr2D,arr2D1));
		
		//�迭�� ������ Arrays.sort(�迭��)
		int[] arr2 = {5,3,15,6,9,8};
		System.out.println(arr2);
		Arrays.sort(arr2);
		System.out.println("����: "+ Arrays.toString(arr2));
		
		
		
		//===============================================
		//�迭�� ����
		//copyof�� ������ ���ڸ�ŭ�� 
		//copyofRange()�� �迭�� ������ �����Ͽ� ������ �ٸ� �迭�� ����;
		//��� �����Ͽ� ���ο� �迭�� ��ȯ
		
		int [] arr3 = {5,6,7,8,9};
		int [] arr4 = Arrays.copyOf(arr3,3);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3,10);
		System.out.println("arr5 : "+ Arrays.toString(arr5));
		//�����ϴ� �迭�� ���Ұ������� ������ �������� �⺻������ ä��
		
		int[] arr6 = Arrays.copyOfRange(arr3, 1, 4);
		//1�� ���� ���� ��ȣ 4�� ���� ���� ��ȣ ������ �׾ձ���
		System.out.println("arr6 : " + Arrays.toString(arr6));
		
		//System.arraycopy()�� ����Ͽ� ����
		int[] scopyArr = {1,2,3,4,5};
		int[] scopyArr1 = new int[10];
		
		System.arraycopy(scopyArr, 0, scopyArr1, 0, 5);
		
		//scopyArr�� ����迭,0�� ����迭�� ���� ���ι�ȣ
		//scopyArr1�� ���纻 �迭, 0�� ���� ���� ��ȣ 5�� ���Ұ���
		
		System.out.println(Arrays.toString(scopyArr));
		System.out.println(Arrays.toString(scopyArr1));

	}

}
