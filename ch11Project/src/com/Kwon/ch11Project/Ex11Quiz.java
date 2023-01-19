package com.Kwon.ch11Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11Quiz {
	private static final int HashMap = 0;

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();//1번;
		
		cars.iterator();
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Kia");//2번;
		
		System.out.println(cars); //3번;
		
		System.out.println(cars.get(0)); //4번;
		
		cars.set(0, "Opel");
		System.out.println(cars.get(0)); //5번;

		cars.remove(0);
		System.out.println(cars);//6번;
		
		cars.removeAll(cars);
		System.out.println(cars);//7번;
		
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Kia");
		System.out.println(cars);//8번;
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i)+" ");
		}System.out.println();
		//9번;
		
		for(String arr : cars) {
			cars.get(0);
			System.out.println(cars);
		} //10번;
		
		HashMap<String, String> capital = new HashMap();//11번;
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.println(capital); //12번;
		
		System.out.println(capital.get("Korea")); //13번;
		
		capital.remove("England");
		System.out.println(capital);//14번;
		
		capital.clear();
		System.out.println(capital);//15번;
		
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.println(capital);//16번;
		
		capital.keySet();
		System.out.println("keyset: "+capital.keySet());
		capital.values();
		System.out.println("value:"+capital.values());
		
//		for (int i = 0; i < capital.size(); i++) {
//			capital.containsKey(capital);
//			System.out.println(capital.containsKey(capital));
//			capital.
//			System.out.println(capital.get(i));
//			
//		}//17번;
		
		Iterator<String> it = cars.iterator();//18번;
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("it : "+ it.next());
		}//19번;
	}//main method;
}//main class;

/*1. ArrayList객체 cars를 만드는데 제네릭으로 String클래스를 사용
 *2. cars객체에 Volvo, Bmw, Ford, Kia를 추가 
 *3. cars 객체를 프린트
 *4. 첫번째 저정된 요소를 반환하는 메서드를 이용하여 출력
 *5. 첫번째 요소를 Opel로 변경하고 출력
 *6. 첫번째 요소를 제거하고 출력
 *7. 모든 요소를 제거하고 출력
 *8. cars에 다시 Volvo, Bmw, Ford, Kia 추가
 *9. 기본 for문으로 cars의 각 요소를 출력
 *10. enhanced for문으로 cars의 각 요소를 출력
 *
 *11. HashMap객체 capital을 만드는데 제네릭을 사용 key도 String, value도 String인 제네릭
 *   <String, String> 사용
 * 
 *12. England는 London, Korea는 Seoul, Germany는 Berlin, Japan은 Tokyo를 Capital에 추가
 *   하고 print(나라 이름을 key로 사용)
 * 
 *13. England의 value를 얻어서 출력
 *14. key가 England인 요소 삭제하고 print
 *15. 모든 요소 삭제하고 print
 *16. capital객체에 다시 12번을 추가
 *17. 기본 for문으로 key set를 얻어 그 키값을 이용하여 value를 프린트
 *18. cars 객체의 Iterator 객체 it를 생성
 *19. it를 이용하여 cars에 저장된 값을 출력
 * 
 * 
 * 
 * 
 * 
 */
