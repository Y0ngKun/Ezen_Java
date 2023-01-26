package com.Kwon.ch12Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex12Quiz {
	public static void main(String[] args) {
		
		Level myVar = Level.MEDIUM;
		
		System.out.println(myVar);
		
		switch (myVar) {
		case LOW : //case에는 상수 이름만 사용 가능 
			System.out.println("LOW");
		break;
		case MEDIUM: 
			System.out.println("MEDIUM");
		break;
		case HIGH : 
			System.out.println("HIGH");
		break;
		
		default:
			break;
		}
		
		Level[] s = Level.values();
		
		for(Level ss : s) {
			System.out.println(ss.ordinal());
		}

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("k1");
		cars.add("k2");
		
		LinkedList<String> cars1 = new LinkedList<String>();
		cars1.add("k3");
		cars1.add("k4");
		cars1.addFirst("sonata");
		cars1.addLast("santafe");
		System.out.println("cars1의 첫번째와 마지막 요소 : "+cars1.getFirst()+", "+cars1.getLast());
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("na", 99);
		people.put("me", 100);
		
		for(String aa : people.keySet()) {
			System.out.println("people : " + aa +" value : " + people.get(aa) );
		}
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(7);
		
	
		for(int i = 1; i <= 10; i++) {
			if(numbers.contains(i))  {
				System.out.println("*가지고 있는 수: "+ i);
			}
			else {
				System.out.println("가지고 없는 수: " + i);
			}
		}//10번;
		
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}//main method;
	
}//main class;
enum Level {LOW,MEDIUM,HIGH}

/* 1.열거형 level을 만들고 구성 상수는 LOW,MEDIUM,HIGH로 한다
 * 2.main메서드 안에서 level객체 myVar을 만들고 값은 MEDIUM을 대입한다
 * 3.myVar객체를 프린트 한다
 * 4.myVar객체를 파라메터로 하는 switch문을 만든다
 *   각 case별로 LOW,MEDIUM,HIGH를 출력
 * 5.enhanced for문을 이용하여 enum Level의 각 상수 값을 출력해본다
 * 6.대입타입 파라메타가 String인 ArrayList객체 cars를 만든 다음 2개 값을 추가해본다.
 * 7.대입 파라메타가 String인 LinkedList객체 cars1을 만든 다음 2개 값을 추가해본다.
 *   cars1의 첫번째 요소로 sonata를 추가한 뒤 마지막 요소로 santafe를 추가한다
 *   cars1의 첫번째와 마지막 요소를 구해본다
 * 8.대입타입 파라메타가 String과 Integer인 HashMap객체 people를 만들고 2개 값을 추가해본다(이름,나이)
 * 9.enhanced for문을 이용해 key의 Set을 구한 다음 key로 값을 구해서 출력 해본다.
 *10.대입타입 파라메타가 Integer인 HashSet객체 numbers를 만들고 2개 값을 추가한다(4와 7)
 *   for문을 반복값 i로 1부터 10까지 반복하면서 numbers가 i값을 가지고 있으면 가지고 있음 + i를 출력하고
 *   없으면 안가지고 있음 + i를 출력
 *11. 6번의 cars객체를 이용한 Interator객체 it를 만들되 대입타입변수를 이용하여 만든다
 *    it를 이용해 cars의 요소들을 출력 해본다
 */

