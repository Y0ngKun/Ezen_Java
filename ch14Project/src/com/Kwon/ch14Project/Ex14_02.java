package com.Kwon.ch14Project;

import java.util.*;
import java.util.function.*;

public class Ex14_02 {
	public static void main(String[] args) {
		
		Supplier<Integer> s;
		//함수형 인터페이스 Supplier<T>는 
		//파라메타가 없고 반환을 <T>형으로 하는 추상메서드 T get()을 갖는다.
		//함수형 인터페이스 객체는 추상메서드를 매핑하는 람다식으로 생성
		//	한줄로 =	Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		s = () -> (int)(Math.random()*100)+1;

		Consumer c;
		//함수형 인터페이스 Consumer는 파라메타가 1개이고 리턴값이 없는 추상메서드
		//public abstract void accept(T t)를 갖고 있다.
		//함수형 인터페이스 객체는 추상메서드를 매핑하는 람다식으로 생성
		c = i -> System.out.println(i + "");
		
		Predicate<Integer> p = i -> i%2 == 0;
		Predicate<Integer> s0 = (x) -> x%3==0;
		//함수형 인터페이스 Predicate <T>는 파라메타가 하나와 리턴은 boolean을 하는
		//추상메서드 boolean test(T t)를 갖는다.
		
		Function <Integer, Integer> f;
		//함수형 인터페이스 Function은 파라메타가 1개이고 리턴타입이 있는 추상메서드
		//R apply(T t)를 갖는다
		f = i /*파라메타*/ -> i/10 * 10/*블록 내용*/ ;
	

		List<Integer> list = new ArrayList<Integer>();
		makeRandom(s, list);
		System.out.println(list);
		
	}//main method;
	
	static<T> void makeRandom(Supplier<T>s, List<T> list) {
		for (int i = 0; i < 10; i++) {
			//list 객체에 람다식으로 구현한 get메서드를 호출하여 반환되는 값을
			//.add메서드를 통해 list 값을 넣는다
			list.add(s.get());
		}
	}
	
}//main class;

