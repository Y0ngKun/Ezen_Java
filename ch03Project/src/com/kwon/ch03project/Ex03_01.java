package com.kwon.ch03project;

public class Ex03_01 {
	public static void main(String[] args) {
		int x,y;
		/*
		 * int x;
		 * int y;
		 * 를 한줄에 작성 / 데이터형에 같을 때만 사용 가능!
		 */
		x = y = 3; // =은 대입연산자이고 우측에서 좌측으로 연산
		x = ++ y;
		y = x++;
		
		

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
