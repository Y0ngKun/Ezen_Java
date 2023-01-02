package com.Kwon.ch06Project;

public class Ex06_04 {

	public static void main(String[] args) {
		
		/*MyMath 클래스의 
		 * add() =더하기
		 * subtract(빼기)
		 * multiply(곱하기)
		 * divide(나누기) 
		 * 메소드를 호출하여 사용
		 */
		
		//메서드는 전부 인스턴스 메서드이므로 객체를 생성해서 사용해야함
		MyMath mm = new MyMath();
		long result = mm.add(15,20);
		//만든 add메서드 호출, 메서드의 파라메터가 long형이므로
		//int는 자동 형변환 됨 (long으로)
		long result1 = mm.subtract(5L, 3L);
		long result2 = mm.multiply(5L, 3L);
		double result3 = mm.divide(5L, 3L);
		
		System.out.println("result =" + result);
		System.out.println("result1 =" +result1);
		System.out.println("result2 = "+result2);
		System.out.println("resul3t =" +result3);//호출한 메서드의 파라메터가 double형이므로 자동 형변환
		
		//인스턴트 멤버변수 name
		mm.name = "kook";
		//클래스형 멤버변수 price값 변경
		MyMath.price = 100;
		System.out.println("name = " + mm.name);
		System.out.println("price = " + mm.price);
		
		//클래스형 메서드 smeth 호출
		MyMath.smeth();
		
	}//main

}//pb class

class MyMath{
	String name; // 인스턴트형 멤버변수
	static int price;//클래스(static)형 멤버변수
	static void smeth() {
		System.out.println("smeth");
	};
	
	long add(long a, long b) {
		//헤더(선언부) long add(long a, long b)
		//long은 반환데이터형 (리턴타입) add는 메서드 이름, ()는 파라메터
		// 파라메타 변수 a,b는 블록안에서 로컬변수로 사용됨
		//로컬변수 선언식으로 파라메타변수
		//a,b를 변경하면 이안에서  변경, 전달된 호출부의 인자값은 변경안됨
		
		long result = a + b;
		return result;
	}

	long subtract(long a, long b) {
		// 파라메타 변수 a,b는 블록안에서 로컬변수로 사용됨
		long result = a - b;
		return result;
	}

	long multiply(long a, long b) {
		// 파라메타 변수 a,b는 블록안에서 로컬변수로 사용됨
		long result = a * b;
		return result;
	}
	
	double divide(double x, double y) {
		// 파라메타 변수 x,y는 블록안에서 로컬변수로 사용됨
		double result = x / y;
		return result;
	}
	
}//MyMath class
