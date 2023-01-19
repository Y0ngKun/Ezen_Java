package com.Kwon.ch11Project;

import java.util.*;
import static java.util.Collections.*;
//static 생략시 바로 접근 불가
//Collection클래스의 모든 static 멤버는 Collections.없이 사용

public class Ex11_19 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("List 객체 list 생성 : "+list);
		
		addAll(list,1,2,3,4,5);
		//import static을 해줘서 collection 생략 가능
		//<Integer>boolean addAll(Collection<> super Integer> c, Integer... elements)
		//addAll 메서드는 반환은 불리언이고 c 컬렉션객체(요소가 Integer의 상위 클래스를 가진 Collection)
		//가변 Integer를 파라메터로 가짐
		
		System.out.println("addAll list : "+list);
		
		rotate(list, 2);
		//list의 구성요소를 뒤로 2칸씩 밀어서 회전, -2가능
		System.out.println("rotate list : "+list);
		
		swap(list, 0, 2);
		//색인번호 0번과 2번의 위치를 서로 바꾼다
		System.out.println("swap list : "+list);
		
		shuffle(list); 
		//저장된 요소의 위치를 임의로 변경
		System.out.println("shuffle list : "+list);
		
		sort(list);
		//오름차순 정렬
		System.out.println("sort(list) : "+list);
		
		sort(list, reverseOrder());
		//역순 정렬 (내림 차순) , reverse(list)와 동일하다
		System.out.println("sort (list.reverseOrder) : "+list);
		
		int idx = binarySearch(list, 3);
		//3이 저장된 위치 (index)를 반환, 정렬 후 사용해야함
		System.out.println("index of 3, by binarySearch : "+idx);
		
		System.out.println("max(list) : "+ max(list));
		//Collections.max(list)
		System.out.println("min(list) : "+ min(list));
		//Collections.min(list)
		System.out.println("min(list), (max 후 reverseOrder()) : "+ max(list, reverseOrder()));
		
		fill(list, 9);
		//list를 9로 채운다
		System.out.println("fill (list,9) : " + list);
		
		List newList = nCopies(list.size(), 2);
		//nCopies 역시 Collections에 있는 메소드이다.
		System.out.println("newList = nCopies(list.size(), 2) : "+ newList);
		
		System.out.println("disjoint (list , newList) : "+disjoint(list, newList));
		//disjoint (비교대상, 비교대상)은 공통된 요소가 하나도 없으면 true, 있으면 false;
		
		copy(list, newList);
		//newList(후자)값을 List(전자)에 복사해서 덮어쓰기
		System.out.println("copy(list, newList) 후 newList : "+newList);
		System.out.println("copy(list, newList) 후 list : "+ list);
		
		replaceAll(list, 2, 1);
		//list에서 2를 1로 대체한다
		System.out.println("replaceAll(list, 2, 1) : " + list);
		
		Enumeration e = enumeration(list);
		//Enumeration은 iterator의 구버젼
		//list객체를 반복 접근 가능한 Enumeration으로 변환
		ArrayList list2 = list(e);
		System.out.println("Enumeration객체 생성 후 ArrayList list2 = list(e) "+list2);

	}//main method;
	
}//main class;
