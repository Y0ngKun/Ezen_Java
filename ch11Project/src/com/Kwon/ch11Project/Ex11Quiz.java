package com.Kwon.ch11Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex11Quiz {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();//1번;
		//ArrayList 제네릭 클래스이다 ArrayList <E> 이런식으로 정의는 E로 되어있다.
		//제네릭은 타입 파라메타이다.
		//데이터형을 변수화 해서 사용하는 것이다.
		//생성자 <>안에 입력 값은 1.8버전부터는 생략 가능하지만, 사용해주는 것이 좋다. 

		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Ford");
		cars.add("Kia");//2번;
		//제네릭을 사용한 ArrayList cars에는 대입 파라메타가 String만 사용가능하다.
		
		System.out.println("3번 cars 객체를 프린트 : " + cars); //3번;

		System.out.println("4번 첫번째 저장된 요소를 반환하는 메서드를 이용하여 출력 : " + cars.get(0)); //4번;
		//ArrayList의 데이터를 반환해주는 메서드는 .get(int index);
		
		cars.set(0, "Opel");
		System.out.println("5번 첫번째 요소를 Opel로 변경하고 출력 : " + cars.get(0)); //5번;
		//.set(int index , "변경할 값") -> cars에는 <String>이니 변경할 값은 String만 사용 가능.
		
		cars.remove(0);
		System.out.println("6번 첫번째 요소를 제거하고 출력 : " + cars);//6번;
		//.remove(int index) ArrayList의 요소 제거 메소드
		
		
		cars.clear();;
		System.out.println("7번 모든 요소를 제거하고 출력 : " + cars);//7번;
		//.removeAll(), .clear() 의 차이점에 대해 알고 있자(!!)
		//clear() 메서드와 removeAll() 메서드로 ArrayList 객체의 모든 요소를 제거할 수 있습니다.
		
		//removeAll() 메서드는 컬렉션 타입의 인수를 가집니다.
		//위 예제에서 알 수 있듯이 두 메서드 모두 ArrayList 객체의 모든 요소를 제거합니다. 그러나 clear() 메서드와 removeAll()은 다르게 동작합니다. 따라서 두 메서드의 차이점을 이해할 필요가 있습니다.
		//clear() 메서드의 목적은 리스트에서 모든 요소를 제거하는 것입니다. 따라서 clear() 메서드를 호출하면 모든 요소가 제거됩니다.
		//removeAll() 메서드는 clear() 메서드와 달리 Collection 타입의 인수가 존재합니다. removeAll() 메서드의 목적은 removeAll() 메서드를 호출한 컬렉션 객체와 인자로 전달된 컬렉션 객체와 일치하는 요소를 제거하는 것입니다.
		
		//clear() 메서드는 removeAll() 메서드보다 빠릅니다.
		
		cars.add("Volvo");
		cars.add("Bmw");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8번 cars에 다시 Volvo, Bmw, Ford, Kia 추가 : " + cars);//8번;

		for (int i = 0; i < cars.size(); i++) {
			System.out.println("9번 기본 for문으로 cars의 각 요소를 출력, " + i +"번 째 요소 : " + cars.get(i));
		}
		//9번;
		
		//Enhanced for문은 배열과 Collection에 적용
		//변수명은 소문자로(!!)
		for(String arr : cars) {
			System.out.println("10번 Enhanced for문으로 cars의 각 요소를 출력, " + arr.charAt(0) +"번 째 요소 : " + arr);
		} //10번;

		HashMap<String, String> capital = new HashMap<String, String>();//11번;
		//Map <K, V> capital = new HashMap<>();도 가능
		//Map은 Key값은 중복 허용이 안된다.
		//하지만 Value는 중복이 허용 되나, 기존건 삭제되고
		//마지막 값으로 교체한다.
		
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		//ArrayList는 .add()
		//Map은 .put()
		
		System.out.println("12번 : " + capital); //12번;
		//Map도 toString()을 재정의해놨다
		//Map은 toString()을 {K=V,K=V....}로 정의 해놨다
		
		System.out.println("13번 England의 value를 얻어서 출력 : " + capital.get("England")); //13번;
		//Map에는 .get()가 있는데 
		//색인번호가 아니고, .get(Key)값을 넣으면  
		//key에 해당하는 value가 출력된다(!!)
		
		capital.remove("England");
		System.out.println("14번 key가 England인 요소 삭제하고 print : " + capital);//14번;
		//remove()는 문자열로 반환해주는데 이전의 값을 반환해준다.

		capital.clear();
		System.out.println("15번 모든 요소 삭제하고 print : " + capital);//15번;

		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Tokyo");
		System.out.println("16번 capital객체에 다시 12번을 추가 : " + capital);//16번;

		for (int i = 0; i < capital.size(); i++) {
			String s =(String)capital.keySet().toArray()[i];
			System.out.println("17번 capital의 " + i +"번 째 key의 value는 : " + capital.get(s));
		}//17번;
		
	      
		for (String key : capital.keySet()) {
			//Map.set()은 Key로 구성된 된 Set
			System.out.println("17번 "+ ": " + capital.get(key));
		}//17번 enhanced for
		//enhanced for문으로 
		//key로 구성된 Set객체를 얻어서 key를 반복하여 얻어냄


		Iterator<String> it = cars/*컬렉션프레임워크*/.iterator(); //18번;

		for (int i = 0; i < cars.size(); i++) {
			System.out.println("19번 it를 이용하여 cars에 저장된 값을 출력 : " + it.next() +" , 다음 값 확인 : " + it.hasNext());
		}//19번;
		
		//Iterator의 객체를 .next()로 출력하면
		//요소에서 삭제된다 해서 for나 while로 .next()해서 출력하면
		//다음에 같은 요소들은 출력못한다.

		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
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
