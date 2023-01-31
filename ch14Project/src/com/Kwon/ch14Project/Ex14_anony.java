package com.Kwon.ch14Project;

public class Ex14_anony {
	public static void main(String[] args)  {
		
		//익명의 객체 obj를 만듦
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
//		obj.max(5,3);
		//Object클래스에는 .max()메소드가 없으므로 에러 발생
		//람다식으로 익명의 객체의 메소드를 구현하기 위해서는 아래처럼 한다
//		obj = (a,b) -> a > b ? a : b
		//그러나 람다식을 익명의 객체에 대입하려면 람다식만 대입해주면 된다.
		//단, 익명의 객체는 추상메서드가 하나만 있는 interface객체여야 한다.
		//추상메서드가 하나만 있는 인터페이스는 @FunctionalInterface
		//Object는 추상메서드가 하나가 아니므로 에러
		
	}//main method;
}//main class;
