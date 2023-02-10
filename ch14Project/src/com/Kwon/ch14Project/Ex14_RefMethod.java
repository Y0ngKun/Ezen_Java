package com.Kwon.ch14Project;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//람다식의 블록(구현부)이 하나의 메서드만 사용시에는 메서드참조로 간단히 람다식 대체 
public class Ex14_RefMethod {
	

	public static void main(String[] args) {
		
	Function<String, Integer> f = (s) -> Integer.parseInt(s); //f라는 객체 생성
	//함수형 인터페이스 Function의 추상메서드는 R apply(T t);을 구현하는 람다식을 사용
		
	Function<String, Integer> f1 = Integer::parseInt;
	//블록안에 하나의 메서드만 사용하므로 메서드 참조식으로 사용가능, (파라메타) ->가 필요없으며,
	//메서드 호출도 static메서드는 클래스이름::메소드이름;
	//인스턴스형 메서드를 한번만 호출시에도 클래스이름::메서드이름으로 호출
	//인스턴스를 객체를 전달 받아서 처리
	
	//BiFunction 부터 뭔 소린지 1도 이해 못함;;;;;;;;;
	BiFunction<Object, String, String> bf = (Object obj, String s) -> obj.toString();
	//BiFunction<Object, String, String> bf1 = Object::toString();
	//외부 객체의 메서드 호출시는 외부객체명::인스턴스메서드

	//블록부분이 new 생성자 일때도 메서드참조를 이용 가능
	
	BiFunction <Object, String, Integer> bf2 = (Object obj, String s) -> Integer.parseInt(s);
	//국쌤이 지우기 전에 쓴 예시
	BiFunction<Object, String, Integer> bf3 = Example::process;
	//chatGPT로 얻은 함수형 인터페이스 BiFunction의 메서드 참조형 활용법
	
	Supplier <String> sp = () -> new String ("abc");
	Supplier <String> sp1 = String::new;
	//Supplier의 추상메서드가 T get();
	//메서드 참조로 생성자 활용시는 클래스이름::new;
	
	}//main method;
}//main class;

class Example {
	static Integer process(Object o, String s) {
		// do something with o and s
		return 0;
	}
}