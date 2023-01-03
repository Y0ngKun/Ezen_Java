package com.Kwon.ch07Project;

public class Point2 {
	int x,y;
	
	public Point2() {} //기본 생성자를 명시적으로 만들면 이 생성자를 사용 가능
	public Point2(int x, int y) {
		//상위클래스인 Object의 생성자를 자동호출 (super())
		this.x = x;
		this.y = y;
	}
	int[] k = {2,4};
	
//	Arrays.toString(k);
	
}
