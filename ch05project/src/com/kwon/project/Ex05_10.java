package com.kwon.project;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		//String 2���� �迭
		String[][] words = {
				//words[3][2] = 3�� 2��
				{"chair","����"},
				{"computer","��ǻ��"},
				{"Integer","����"},
		};
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?",i+1,words[i][0]);
			String tmp = sc.nextLine();//���� ������ ���� �� �Է�
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�");
				
				}else {
					System.out.println("�����Դϴ�. ������ "+ words[i][1]+"�Դϴ�");
			}
		}
		System.out.println("for ���� ����");

	}//main

}//class
