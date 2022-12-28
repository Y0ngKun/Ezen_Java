package com.kwon.project;

public class Ex05_09 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,30,30},
				{20,30,30},
				{20,30,32},
		};	
		int kortotal = 0;
		int engtotal = 0;
		int mathtotal = 0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=======================");
		
		for(int i=0;i<score.length;i++) {
			int sum = 0;//번호별 총점;
			float avg = 0.0F;//번호별 평균
			kortotal += score[i][0];
			engtotal += score[i][1];
			mathtotal += score[i][2];
			
			System.out.printf("%3d",i+1);//번호값 출력 %n이 없으므로 줄 안바꿈
			for(int j=0;j<score[i].length;j++) { //각열의 배열값
				sum += score[i][j];//각 행의 3과목 점수의 총합;
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum / (float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("=======================");
		System.out.printf("%3d %4d %4d%n", kortotal,engtotal,mathtotal);

	}//main

}
