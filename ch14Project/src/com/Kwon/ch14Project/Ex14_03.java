package com.Kwon.ch14Project;

import java.util.function.*;
//Predicate 객체를 결합하여 사용하는 메서드
public class Ex14_03 {
	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i < 100; //i가 100이하면 true
		Predicate<Integer> q = i -> i < 200; //i가 200이하면 true
		Predicate<Integer> r = i -> i%2 == 0; //i가 짝수면 true
		
		Predicate<Integer> notP = p.negate(); // i >= 100 (p의 !연산)
		Predicate<Integer> all = notP.and(q.or(r)); 
		//q객체와 r객체를 || 연산 한 후에 notP객체와 &&연산 수행
		//( i >= 100 ) && ( i <= 200 || i%2 ==0 )
		//연산의 결과는 test()로 얻어냄
		
		System.out.println(all.test(202));
		
		String str1 = "abc";
		String str2 = "abc";
		
		/* str1과 str2가 같은지 비교한 결과를 반환
		 * 동등 비교할 목적은 Predicate의 객체를 만들시는
		 * static 메서드인 isEqual(비교객체명)
		 */
		Predicate<String> p2 = Predicate.isEqual(str1);
		//문자열 str1을 다른 문자열과 동등비교를 위해 사용할 Predicate(인터페이스) 객체 p2를 생성
		boolean result = p2.test(str2);
		//p2객체가 가진 str1을 str2와 동등비교
		System.out.println(result);
		if (p2.test(str2)) System.out.println(p2.test(str2));
		
	}//main method;
}//main class;
