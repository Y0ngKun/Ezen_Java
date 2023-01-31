package com.Kwon.ch14Project;

//람다식을 사용하려면 @FunctionalInterface의 추상메서드에 매핑하는 람다식을 인터페이스 객체에 대입하여 사용
//람다식을 사용시는 람다식으로 구현한 추상 메서드를 호출
public class Ex14_Functional {
	public static void main(String[] args) {
		
		//익명의 객체를 만들어서 사용시 (기존의 자바 방식)
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		int res = f.max(5, 10);
		System.out.println("res = " + res);
		
		System.out.println("lambda 사용");
		
		MyFunction f1 = (a,b) -> a > b ? a : b;
		int res1= f1.max(11, 6);
		System.out.println("res1 = " + res1);
		//익명의 객체를 만드는 대신 해당 인터페이스의 추상메서드를 람다식으로 구현하여 대입
		
		MyFunction f2 = (a,b) -> b/2;
		//람다식으로 파라메타만 고치지 못하고 블록 내용은 아예 변경 가능하다.(!!)
		System.out.println(f2.max(5, 50));
		
	}//main method;
}//main class;

@FunctionalInterface
//FunctionalInterface는 추상 메서드가 1개이다(!!)
interface MyFunction {	
	/*public abstract*/int max(int a, int b);
}