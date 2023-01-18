package com.Kwon.ch11Project;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_17 {
	public static void main(String[] args) {
		//Map 메서드 사용
		HashMap map = new HashMap();
		
		//put(키,값)
		map.put("김자바", 90);
		map.put("김자바", 100); //위에 김자
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		//Map Collection 인터페이스를 상속하지 않아 원소에 접근하는 iterator()를 못가짐
		//Set으로 변환뒤 Set에서 Iterator를 만듦.
		
		
		Set set = map.entrySet(); //map.keySet()도 Set반환
		System.out.println("entrySet() 반환 " + set);
		Set set1 = map.keySet();
		System.out.println("keySet() 반환 " + set1);
		
		Iterator it =set.iterator();
		
		while (it.hasNext()) {
			//key와 value를 멤버변수로 가지고 있는 클래스는 HashMap의 내부클래스인 Entry임
			//Map객체의 iterator는 Entry객체를 반환 (멤버변수로 key와 value를 처리)
			HashMap.Entry e = (HashMap.Entry)it.next();
			System.out.println("이름 (key) : " + e.getKey());
			System.out.println("정수 (value) : " + e.getValue());	
		}//while;
		
//		for (Object str : set) {
//			String key = (String)str;
//			System.out.println(key);
//			System.out.println(map.get(key));//key로 value를 얻을 시 get(key)사용 
//		}//선생님 코드
		
		set = map.keySet();
		System.out.println("참가자 명단 " + set);
		
		Collection values = map.values();
		//Collection.values()는 map에 포함된 value만 Collection으로 반환
		//즉 map에서 값만 가져올 시에는 map.values()메서드로 Collection 객체를 얻어 사용
		
		
		it = values.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}//while;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		
		
		
		
		
	}//main method;
}//main class;
