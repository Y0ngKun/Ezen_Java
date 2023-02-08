package com.Kwon.ch14Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex14_04 {
	public static void main(String[] args) {
		//Collection 프레임워크가 갖고 있는, 함수형 인터페이스 사용 메서드 예제  
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//list의 모든 요소를 출력하는 메서드는 ArrayList에 있는
		//forEach() 메서드 사용
		//forEach()의 파라메타는 Consumer 함수형 인터페이스 객체 사용
		//void forEach(Consumer<? super Integer> action)
		
		//ArrayList 요소 확인하기
		list.forEach(i -> System.out.print(i + "  ")); System.out.println();
		//forEach의 파라메타로 람다식을 바로 사용,
		//forEach는 자동으로 원소값을 반복 처리
		//i는 list객체의 원소값을 나타냄 ( for (String i : 대상) )
		
		//ArrayList 요소 제거하기
		list.removeIf(x -> x%2==0 || x%3==0);
		//boolean removeIf(Predicate<E> filter)는 함수형 인터페이스
		//Predicate 객체를 파라메타로 사용
		System.out.println(list);
		
		//Map 활용
		Map <String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		System.out.println(map);
		
		//map의 void forEach(BiConsumer<K, V> action)
		map.forEach((K, V) -> System.out.print("(" + K + "의 value : " + V + ") ")); System.out.println();
		//map의 forEach에는 BiConsumer를 구현하는 람다식 사용, map의 요소들을 반복하여 처리 
		//BiConsumer는 파라메타값이 2개
		
	}//main method;
	
}//main class;
