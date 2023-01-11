package com.Kwon.ch09Project;

import java.util.ArrayList;

public class Ex09_16 {

	public static void main(String[] args) {
		int i = 10;
		
		//기본형도 참조형으로 강제 형변환 가능
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L; 
		// 100L은 기본형인데 Long형(wrapper 클래스)으로 자동 형변환
		//이를 오토박싱이라 한다.
		
		int int2 = intg + 10;
		//래퍼객체형 + 기본형 연산이 JDK 1.5부터 가능하다
		//intg에 intValue()가 자동 첨가(컴파일러가 해줌)
		
		long l = intg + lng; // int 10 + 100L
		//참조형간의 연산도 가능
		
		
		//박싱 - 언박싱 ArrayList 자주 사용함 중요
		ArrayList<Integer> list = new ArrayList<>();
		list = new ArrayList<>();
		//ArrayList는 배열을 처리하기 쉽도록 한 컬렉션 (데이터의 집합)
		//<Integer>는 지네릭이라 부르고 데이터형을 전달하는 매개변수
		//여기서는 list 요소가 전부 Integer형으로 되어있다는 뜻
		list.add(10);
		//자동으로 박싱 (오토박싱)
		list.add(intg);
		int res = list.get(0);
		//Integer를 반환하나 int로 받음
		//즉 자동으로 객체에서 정수로 변환
		//이를 언박싱이라고 한다.
		int res1 = list.get(1);
		
		System.out.println(res);
		System.out.println(res1);

	}//main method;

}//main class;
