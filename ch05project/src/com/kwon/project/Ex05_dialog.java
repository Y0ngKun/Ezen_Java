package com.kwon.project;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex05_dialog {

	public static void main(String[] args) {
		//GUI swing패키지의 클래스를 이용하여 그래픽 대화창을 만들기
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0;
//		String temp = "";
//		int count = 0;
//		
//		do {
//			count++;
//			temp = JOptionPane.showInputDialog("1~100사이 숫자를 입력하세요" + "끝내려면 -1을 입력하세요");
//			if (temp==null || temp.equals("-1")) break;
//			
//			System.out.println("입력값 : "+ temp);
//			input = Integer.parseInt(temp);
//
//			
//		}
		//do
		
		int[][] score = new int[5][3];//2차원 배열
		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(score[1].length);
		System.out.println(Arrays.toString(score));
		
		int[][] score1 = new int[5][];//가변배열
		
		

	}//main

}
