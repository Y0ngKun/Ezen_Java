package com.Kwon.ch11Project;

import java.util.Arrays;

public class Ex11_06 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5}; //1���� �迭
		int [] [] arr2D = {{11,12,13},{21,22,23}}; //2���� �迭
		
		System.out.println("1���� �迭 arr = " + Arrays.toString(arr));
		//Arrays.toString(�迭��) = 1���� �迭 ��Ұ����
		System.out.println("2���� �迭 arr2D = " + Arrays.deepToString(arr2D));
		//Arrays.deepToString(arr2D) = 2���� �迭 ��Ұ� ���
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		//arr��ü ���翩 arr2�� ����
		int[] arr3 = Arrays.copyOf(arr, 3);
		//arr���� �տ��� 3���� �����Ͽ� arr3�� ����
		int[] arr4 = Arrays.copyOf(arr, 7);
		//arr�� �ڿ� ������ ���ں��� ������ �������� �⺻������ ä��
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		//�迭 ������ ������ �����ô� copyOfRange(���迭,���ۻ��ι�ȣ,���� ���ι�ȣ)
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		//���迭 ���� �̻��� �⺻������ ä��
		
		System.out.println("arr2 = "+Arrays.toString(arr2));
		System.out.println("arr3 = "+Arrays.toString(arr3));
		System.out.println("arr4 = "+Arrays.toString(arr4));
		System.out.println("arr5 = "+Arrays.toString(arr5));
		System.out.println("arr6 = "+Arrays.toString(arr6));
		
		
		
		int [] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		//arr7�迭�� ��� 9�� ä��
		
		System.out.println("arr7�� .fill�� 9�� ä�� = " + Arrays.toString(arr7));
		
		//seatAll(�迭��,���ٽ� �Ǵ� �Լ��� �������̽� ���� ��ü)
		Arrays.setAll(arr7, (i) -> (int)(Math.random()*6)+1);
		//���ٽ��� ȭ��ǥ �Լ���� �Ѵ�.
		//-> �̰� �Ķ��Ÿ
		
		System.out.println("arr7 ��Ҹ� Math.random()*6+1�� ä�� = " + Arrays.toString(arr7));
		
		for (int i : arr7) {
			char [] graph = new char[i];
			Arrays.fill(graph, '*');			
			System.out.println("graph = " + new String(graph)+ i);
		}
	
		String [][] str2D = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		String [][] str2D2 = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println("Arrays.equals(str2D, str2D2) = "+Arrays.equals(str2D, str2D2));
		//1���� �迭 ��  false; Arrays.equals(str2D, str2D2)
		System.out.println("Arrays.deepEquals(str2D, str2D2) = "+Arrays.deepEquals(str2D, str2D2));
		//2���� �迭 �� true; Arrays.deepEquals(str2D, str2D2)
		
		
		
		String [] str1d = new String [] {"a,b,c"};
		String [] str1d2 = new String [] {"a,b,c"};
		
		System.out.println("Arrays.equals(str1d, str1d2) = "+Arrays.equals(str1d, str1d2));
		System.out.println("Arrays.deepEquals(str1d, str1d2) = "+Arrays.deepEquals(str1d, str1d2));
		
		
		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr = " + Arrays.toString(chArr));
		//toString(��� �⺻�� �迭, ������ �迭)
		//binarySearch(chArr, 'B')�� chArr�迭���� 2�� �˻������� B�� ã�� ���ι�ȣ ��ȯ
		//���� �Ŀ� ����ؾ� ��
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		
		Arrays.sort(chArr);
		//������ �������� A�� ���� ���
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch( chArr, 'B'));
	}//main method;
}//main class;
