package com.kwon.project;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex05_dialog {

	public static void main(String[] args) {
		//GUI swing��Ű���� Ŭ������ �̿��Ͽ� �׷��� ��ȭâ�� �����
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0;
//		String temp = "";
//		int count = 0;
//		
//		do {
//			count++;
//			temp = JOptionPane.showInputDialog("1~100���� ���ڸ� �Է��ϼ���" + "�������� -1�� �Է��ϼ���");
//			if (temp==null || temp.equals("-1")) break;
//			
//			System.out.println("�Է°� : "+ temp);
//			input = Integer.parseInt(temp);
//
//			
//		}
		//do
		
		int[][] score = new int[5][3];//2���� �迭
		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(score[1].length);
		System.out.println(Arrays.toString(score));
		
		int[][] score1 = new int[5][];//�����迭
		
		

	}//main

}
