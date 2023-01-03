package com.Kwon.ch07Project;

public class Point3D2 extends Point2 {
	int z;
	
	public Point3D2(int x,int y,int z) {
		//상위클래스에 명시적으로 기본 생성자인 Point2()가 있으므로
		//자동으로 호출되는 super()가 호출되어도 에러 발생 없음
		super();

		this.x = x;
		this.y = y;
		this.z = z;
	}

}
