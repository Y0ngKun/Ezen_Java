package com.Kwon.ch11Project;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_mapIter {
	public static void main(String[] args) {
		//Map은 Collection인터페이스를 구한하지 않은 데이터그룹 처리 인터페이스
		//Map객체는 iterator()메서드가 없어 바로 사용 할 수 없음.
		//Collection인터페이스를 상속한 Set계열로 반환하는 메서드를 이용해서 변환 후 사용
		
		Map map = new HashMap();
		
		map.put("age", 50);
		map.put("name", "kim");
	
		Set kset = map.keySet();
		Set vset = map.entrySet();
		
		Iterator it = vset.iterator();
		Iterator it2 = kset.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}//main method;
}//main class;
