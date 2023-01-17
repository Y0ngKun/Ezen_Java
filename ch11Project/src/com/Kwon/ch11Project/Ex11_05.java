package com.Kwon.ch11Project;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex11_05 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList는 List인터페이스를 구현했고, List인터페이스는
		//Collection 인터페이스를 상속
		//generic<제네릭>을 이용하여 객체를 선언한다
		//generic은 ArrayList의 데이터들의 데이터형을 지정 
		//list 객체에 사용되는 요소 원소는 String이어야만 한다고 지정한 것
		list.add("1");
//		list.add(2); //문자열이 아닌 데이터형 입력시 에러;
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//list의 요소에 접근하기 위해 Iterator를 사용
//		Interface Interface<E>로 정의 되어 제네릭형 인터페이스
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//양방향으로 개선된 Iterator
		//Interface ListIterator<E> 제네릭 인터페이스 List계열에서만 사용
		ListIterator<String> lit = list.listIterator();
		while (it.hasNext()) {
			String str = lit.next();
			System.out.println(str);
		}
		
	}//main method;
}//main class;
