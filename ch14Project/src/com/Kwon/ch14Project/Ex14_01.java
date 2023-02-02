package com.Kwon.ch14Project;

import java.util.function.Supplier;

public class Ex14_01 {
	public static void main(String[] args) {
		
		//MyFunction2 인터페이스 객체는 람다식으로 추상메서드를 구현하여 대입
		MyFunction01 f1  = () -> {
			System.out.println("f1.run()");
		};//람다식으로 함수형 인터페이스의 추상 메서드 활용
		
		/*
		 * 단축형 
		 * MyFunction2 f1 = ()-> System.out.println("f1.run()");
		 */
		
		MyFunction01 f2 = new MyFunction01() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			};
		}; //객체 생성으로 함수형 인터페이스의 추상메서드 활용
		
		MyFunction01 f3 = getMyFunction();
		
		//실제 사용시는 람다식으로 구현된 추상메서드를 호출하여 사용
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));
		
	}//main method;
	
	static MyFunction01 getMyFunction(){
		//반환할 MyFunction2 객체를 람다식을 이용해 만들어서 반환
		MyFunction01 f = () -> System.out.println("f3.run()");
		return f;
		//간단히 return () -> System.out.println("f3.run()");
	}
	
	//파라메타로 람다식을 사용하는 함수형 인터페이스 객체 사용 메서드
	static void execute (MyFunction01 f) {
		f.run();
	} 

}//main class;

//람다식을 사용하려면 람다식을 구현할 추상 메서드가 있는 <함수형 인터페이스>를 구현해야함
//함수형 인터페이스는 추상메서드가 하나(!!)만 있는 인터페이스
@FunctionalInterface
interface MyFunction01{
	//함수형 인터페이스이므로 추상메서드는 하나만(!!) 존재
	/*public abstract*/ void run(); //추상메서드는 {}블록이 없다(!!)
}
