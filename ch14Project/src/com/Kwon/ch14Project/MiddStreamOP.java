package com.Kwon.ch14Project;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiddStreamOP {
	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//1부터 10까지의 정수 값을 반환하는 스트림 객체 생성
		
		intStream.skip(3).limit(5).forEach(System.out::println);
		//skip은 중간 연산으로 앞에서 3개를 생략하는 중간 연산을 하여 stream으로 다시 반환
		//limit은 중간 연산으로 처음부터 n개까지를 선택한 새로운 stream을 만듦 
		//forEach는 최종 연산으로 limit로 생성한 stream의 데이터 요소를 반복 연산 (람다식을 파라메타로 사용)
		
		IntStream intStream01 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		intStream01.distinct().forEach(System.out::print);
		//distinct()는 중간 연산으로 stream객체 데이터 요소의 중복값을 1개로 처리하여 stream으로 반환
		
		
		IntStream intStream02 = IntStream.rangeClosed(1, 10);
		intStream02.filter(i->i%2==0).forEach(System.out::println);
		//filter(Predicate형 파라메타)는 파라메타값으로 boolean을 return해줘야 하고 파라메타는 1개만 받는다,비교 후 false이면 데이터 요소 제거하고 true인 것만 반환
		//filter()도 stream의 데이터들에 대한 반복 처리
		
		intStream02 = IntStream.rangeClosed(1, 10);
		intStream02.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::println);
		//최종 연산이 끝난 stream객체는 다시 사용 할 수 없으므로 값을 다시 생성 해줌
		//.filter()를 연달아서 쓸 수 있다. 
		
		
		System.out.println("===== sorted() - 중간처리 메서드 사용=====");
		
		
		/*sorted() - 중간처리 메서드 사용 */
		Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
		strStream.sorted().forEach(System.out::println);
		//sorted()는 Comparable을 사용하는 기본형 정렬
		//정렬 방법은 사전식 정렬, 대문자가 소문자보다 빠름
		
		System.out.println("========== String.CASE_INSENSITIVE_ORDER 사용 ========");
		
		strStream = Stream.of("dd","aaa","CC","cc","b");
		//위에서 strStream이 forEach로 최종연산되어 소모됐으므로 다시 생성
		strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
		//정렬시 comparable의 기본 정렬이 아니라 정렬 조건을 주면
		//sorted(comparator c) 형태로 사용
		//String.CASE_INSENSITIVE_ORDER는 대소문자 무시하고 정렬하는 조건
		//Comparator<String> CASE_INSENSITIVE_ORDER
	}//main method;
}//main class;
