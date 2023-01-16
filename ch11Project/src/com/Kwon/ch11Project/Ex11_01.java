package com.Kwon.ch11Project;

import java.util.*;

public class Ex11_01 {
	public static void main(String[] args) {
		//ArrayList객체는 생성자를 이용
//		ArrayList list1 = new ArrayList(10);
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		//10은 초기 용량
		//ArrayList클래스는 지네릭 클래스로 사용 안하면 원시 타입
		//ArrayList<Integer> = new ArrayList<Integer>(10)이 정상 
		//List인터페이스 계열로 배열 기반으로 순서 유지, 중복 허용, 저장 메모리가 연속되어 사용
		//ArrayList객체에 요소 값을 추가시에는 .add()를 쓴다
		list1.add(5); // 5는 기본형이나 자동 박싱에 의해 Integer로 변환	
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		list1.add(5); // 중복값 허용
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		//List<Integer> subList(int fromIndex, int toIndex)메서드는
		//List객체의 색인번호 fromIndex에서 toIndex-1을 선택한 List객체 반환
		//생성자의 파타레터로 Collection 객체를 사용 가능
	
		
		Collections.sort(list1);
		Collections.sort(list2);
		//Collections는 클래스로, 인터페이스인 Collection와는 완전히 별개
		//public class Collections extends Object로 Collection을 구현 안함
		//Collections클래스는 Collection관련 클래스 처리에 유용한 메서드등을 제공
		//List객체를 정렬 해줌
		
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add(6);
		list2.add(7);
		//add(값)은 마지막 요소 뒤에다가 추가

		list2.add(2,8);
		//add(색인번호,값)은 해당 색인 번호의 값을 변경(삽입)
		//변경 전 해당 색인 번호부터 이후 색인 번호는 한칸씩 뒤로 밀림
		
		print(list1,list2);
		
		list2.set(3, 44);
		//.set는 해당 색인 번호(3)의 값을 입력한 값(44)으로 아예 변경해버림
		print(list1,list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다(retainAll메서드)
		//반환은 boolean
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1,list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		for (int i = list2.size()-1; i >=0 ; i--) {
			//size() 메서드는 list의 원소 개수
			if (list1.contains(list2.get(i))) {
				//.get(색인번호)는 색인 번호에 저장된 원소값
				//.contains(값)은 값을 포함 포함 여부
				list2.remove(i);
				//.remove(색인번호)는 색인번호의 원소값 제거
				//제거나 추가시에 맨 끝에서 하는 것은 바로 처리가 된다
				//하지만 맨 처음이나 중간에서의 처리는 새로운 배열을 만들어 처리(처리속도가 늦어짐)
				//현재 for문에서는 맨 마지막 원소부터 처리 
			}
		}
//		System.out.println("list2.retainAll(list1) : "+list2.retainAll(list1));
		print(list1,list2);
		
		Vector v = new Vector();
		v.add(5);
		v.add(6);
		
		
	}//main method;
	
	static void print(ArrayList list1, ArrayList list2) {
		//List배열의 toString()도 값으로 표시되도록 Overriding 되어있다.
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();
	}//print;
	
}//main class;
