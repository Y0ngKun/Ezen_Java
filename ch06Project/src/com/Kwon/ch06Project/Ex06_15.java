package com.Kwon.ch06Project;

import java.util.Arrays;

public class Ex06_15 {
	
		static int[] arr = new int[10];
		//Ŭ������ �ε� �� �� static ��� ������ ����
		
		//Ŭ���� �ε��ÿ� arr[]�迭�� ���� ��
		static {
			for(int i=0;i<arr.length;i++) {
				arr[i] = i;
//				arr[i] = (int)(Math.random()*10)+1;
//				
			}
			System.out.println("static ��� : "+Arrays.toString(arr));
		}

	public static void main(String[] args) {
		System.out.print("main method ��� : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
	}//main method;

}//main class;
