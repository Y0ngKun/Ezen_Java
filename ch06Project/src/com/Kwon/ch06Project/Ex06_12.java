package com.Kwon.ch06Project;

public class Ex06_12 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		//기본형 생성자로 만들면 Car클래스 객체 c1의 멤버변수는 초기값이 기본값으로 생성됨
		//color는 null , geartype도 null, door는 0;
		c1.color = "red";
		c1.geartype = "auto";
		c1.door = 4;
		
		System.out.println("c1 color = " + c1.color);
		System.out.println("c1 color = " + c1.geartype);
		System.out.println("c1 color = " + c1.door);
		
		//객체 생성시에 생성자를 이용하여 초기화
		Car1 c2 = new Car1("dark","manual",3);
		System.out.println("c2 color = " + c2.color);
		System.out.println("c2 color = " + c2.geartype);
		System.out.println("c2 color = " + c2.door);
	}

}
//동일한 package에서 동일한 클래스명 사용불가
class Car1 {
	String color;
	String geartype;
	int door;
	//생성자의 접근 제한자는 class의 접근 제한자와 일치
	public Car1(){
		;
	}

	// 파라메타를 갖는 생성자 정의(기본형 생성자는 사용 불가하므로 명시적으로 만듦)
	Car1(String c, String g, int d) {
		color = c;
		geartype = g;
		door = d;
	}
}
