package com.kwon.project;

public class Ex05_08 {
	public static void main(String[] args){
		//2���� �迭�� �ʱ�ȭ
		int[][] score = {
				// 4�� 3�� �迭
				// ����� ���ÿ� ���ͷ��� �ʱ�ȭ
				{ 100, 100, 100 }, 
				{ 20, 30, 20 }, 
				{ 30, 30, 30 }, 
				{ 30, 40, 50 } 
				};

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// �迭 ������ ����� ������ score[i].length
				System.out.printf("score[%d][%d]= %d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum = "+ sum);
		
	}//main

}
