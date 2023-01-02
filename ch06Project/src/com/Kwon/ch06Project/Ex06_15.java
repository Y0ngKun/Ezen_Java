package com.Kwon.ch06Project;

import java.util.Arrays;

public class Ex06_15 {
	
		static int[] arr = new int[10];
		//클래스가 로딩 될 시 static 멤버 변수는 생성
		
		//클래스 로딩시에 arr[]배열에 값을 줌
		static {
			for(int i=0;i<arr.length;i++) {
				arr[i] = i;
//				arr[i] = (int)(Math.random()*10)+1;
//				
			}
			System.out.println("static 블록 : "+Arrays.toString(arr));
		}

	public static void main(String[] args) {
		System.out.print("main method 블록 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
	}//main method;

}//main class;
