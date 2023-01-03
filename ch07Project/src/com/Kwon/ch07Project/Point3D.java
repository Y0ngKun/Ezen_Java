package com.Kwon.ch07Project;

public class Point3D extends Point {
	int z;
	public Point3D(int x,int y,int z) {
		super(x,y);
		//상위 클래스의 기본생성자가 기본형이 아니면 명시적으로 상위클래스 생성자를 호출
		//Point의 기본형 생성자가 없으므로 자동 호출되는 super()를 안쓰면 에러
		this.z = z;
		
	}

}
