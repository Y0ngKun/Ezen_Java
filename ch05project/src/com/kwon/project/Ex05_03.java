package com.kwon.project;

public class Ex05_03 {

	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		int max = score[0];
		int min = score[0];
		
		for(int i=1;i<score.length;++i) {
			if(score[i]>max) {
				max = score[i];
			}//if
			else if(score[i]<min) {
				min = score[i];
			}
		}//for
		System.out.println("최소값은 : "+ min);
		System.out.println("최대값은 : "+ max);

	}//main

}
