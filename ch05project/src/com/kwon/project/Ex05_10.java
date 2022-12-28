package com.kwon.project;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		//String 2차원 배열
		String[][] words = {
				//words[3][2] = 3행 2열
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"Integer","정수"},
		};
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?",i+1,words[i][0]);
			String tmp = sc.nextLine();//영어 문제에 대한 답 입력
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다");
				
				}else {
					System.out.println("오답입니다. 정답은 "+ words[i][1]+"입니다");
			}
		}
		System.out.println("for 문을 나옴");

	}//main

}//class
