package com.kwon.project;

public class Ex05_02 {

	public static void main(String[] args) {
		int sum = 0;
		/*
		 * main 메서드 안에 있는 변수로 로컬변수 (지역변수)로 main method 안에서만 효력이 있다. 로컬변수는 기본값이 없어서 선언시에
		 * 초기 값을 주는 것이 좋다.
		 */
		float average = 0F;
		int[] score = {100, 88, 100, 100, 90};
		/*배열선언과 동시에 리터럴로 초기화
		int[] score = new int[] {100,88,100,100,90} 도 가능하다.
		*/
		for(int i=0; i<score.length;i++) {
			sum += score[i];
//			sum = sum +score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
	}//main

}
