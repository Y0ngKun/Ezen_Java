package com.kwon.project;

public class Ex05_08 {
	public static void main(String[] args){
		//2차원 배열의 초기화
		int[][] score = {
				// 4행 3열 배열
				// 선언과 동시에 리터럴로 초기화
				{ 100, 100, 100 }, 
				{ 20, 30, 20 }, 
				{ 30, 30, 30 }, 
				{ 30, 40, 50 } 
				};

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// 배열 각행의 요소의 갯수는 score[i].length
				System.out.printf("score[%d][%d]= %d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum = "+ sum);
		
	}//main

}
