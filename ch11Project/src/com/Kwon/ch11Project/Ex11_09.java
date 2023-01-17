package com.Kwon.ch11Project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {
	public static void main(String[] args) {
		Integer i1 = 1;
		Object[] objArr = {"1",i1,"2","2","3","3","4","4","4"};
		//문자열값과 Integer객체가 원소로 사용되므로 데이터형은 Object
		Set set = new HashSet();
		for (int i = 0; i < objArr.length; i++) {
			set.add((objArr)[i]);
			//1과 Integer i1 = 1은 다른 걸로 처리
		}
		System.out.println(set);
		//Set은 Object의 toString이 오버라이딩 됨
		
		//HashSet에 저장된 요소들을 출력한(Interator사용)
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}
