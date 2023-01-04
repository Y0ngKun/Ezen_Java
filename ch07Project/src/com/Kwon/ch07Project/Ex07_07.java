package com.Kwon.ch07Project;

public class Ex07_07 {

	public static void main(String[] args) {
		//다형성
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe2.water();
		fe2.stop();
		
		car.stop();
//		car.water(); 자손의 메소드 사용불가
		
		//다형성에 의해 부모클래스의 객체에는 자손클래스 객체를 대입해서 사용 할 수 있음.
		//단, 멤버(메서드,변수는) 부모것만 사용 가능
		car = fe;
//		car.water(); 위에서 부모 객체에 자손 객체를 대입했음에도 자손 클래스의 .water 메소드는 사용 불가하다.
		
		fe2 = (FireEngine)car;
		//조상객체를 자식객체로 형변환하여 대입하면 자손객체의 멤버들을 사용이 가능
		Car car1 = new Car();
		FireEngine fe3;
		//직접만든 조상 객체도 자손으로 형변환하면 자손의 메서드 사용가능
//		fe3 = (FireEngine)car1;
//		fe3.water();
//		car1.water(); //안됨 왜 안되지 이해안감
//		
//		FireEngine fe4;
//		fe4 = (FireEngine)(new Object());
//		fe4.water();
		
		
		
		//instanceof는 자동형변환이 되는 다형성일시는 true이나
		//부모를 자식형 참조변수에 대입시에는 강제 형변환이므로 false가 나옴
		//instanceof 앞의 피연산자는 정의된 참조형 변수이고 뒤의 피연산자는 참조형 변수의 클래스
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}

		if(fe instanceof Car) {
			System.out.println("fe는 Car형으로 형변환 가능합니다");
		}
		if(fe instanceof Object) {
			System.out.println("fe는 Object형으로 형변환 가능합니다");
		}
		if(car1 instanceof FireEngine) {
			System.out.println("car1는 FireEngine형으로 형변환 가능합니다");
		}else {
			System.out.println("car1은 FireEngine으로 형변환이 안됩니다");
		}
		if(car1 instanceof Car) {
			System.out.println("car1은 Car의 객체입니다");
		}
		
		
		Object obj = new FireEngine();
		FireEngine fo = (FireEngine)obj;
		fo.water();

		
	}//main method;;

}

class Car {//접근 제어자가 default
	String color;//접근 제어자가 default
	int door;
	
	void drive() {//접근제어자가 default
		System.out.println("drive, Brrrr");
	}
	void stop() {
	System.out.println("drive, Brrrr");
	}
}//class car;;

class FireEngine extends Car{
	//class Car에 있는 멤버변수와 멤버메서드를 상속--단 생성자와 초기화 블록은 상속 안됨,private 멤버도 상속 안됨
	void water() {
		System.out.println("water!!");
	}
}

