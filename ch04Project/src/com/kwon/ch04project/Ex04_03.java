package com.kwon.ch04project;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요.>>");
		
		int input = scanner.nextInt();
		//nextInt는 ()입력값을 숫자로 반환
		//입력하고 엔터 칠때까지 대기하다가 엔터치면 input에 입력값 대입
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다");
		}
		else {
			//else는 if의 true값이 아닌 모든 다른 조건이므로 조건식을 쓸 필요가 없다
			System.out.println("입력하신 숫자는 0이 아닙니다");
		}
		
		
		

	}

}
