package com.kwon.project;

import java.util.Arrays;

public class Ex05_04 {
	public static void main(String[] args) {
		//shuffle 뒤섞기 -0번째와 임의로 얻어진 색인 번호 값을 교환
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
	
		System.out.println(Arrays.toString(numArr));

		for(int i=0; i<100;i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			}//for
		
		
		System.out.println(Arrays.toString(numArr));
//		
 	}//main

}
