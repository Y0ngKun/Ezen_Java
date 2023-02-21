package com.Kwon.ch14Project;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream의 reduce(), 최종연산자
public class Ex14_10 {

	public static void main(String[] args) {
		
		String[] strArr = {"Inheritance","Java","Lambda","stream",
				"OptionalDouble","IntStream","count","sum"};
		
		Stream.of(strArr).forEach(System.out::println);
		//문자열 배열 strArr을 Stream객체로 만들어 출력
		
		boolean noEmptyStr = Stream.of(strArr)
				.noneMatch(s->s.length()==0);
		//noneMatch()는 "모든" 요소가 조건에 맞지 않으면 true
		System.out.println("noEmptyStr = " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s')
				.findFirst();
		//문자열 배열의 요소중 0번째 색인번호가 's'인 것 중에
		//첫번째로 선택된 요소값만 반환
		System.out.println("sWord = " + sWord.get());
		
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)-> a + 1); //count() 역활을 한다.
		//reduce(초기값,BinaryOperator객체)메서드는 초기값을 
		//BinaryOperator 객체의 첫 번째 파라메터로 사용
		//다음에는 리턴값을 초기값으로 하여 반복
		
		int sum = intStream2.reduce(0,(a,b) -> a + b); //sum();
		
		OptionalInt max = intStream3.reduce(Integer::max);
		//각 요소인 문자열 중 가장 긴 문자열의 문자수
		OptionalInt min = intStream4.reduce(Integer::min);
		//각 요소인 문자열 중 가장 적은 문자열의 문자 수
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		System.out.println("max = " + max.getAsInt());
		System.out.println("min = " + min.getAsInt());
		//OptionalInt 객체시는 get()이 아니고 getAsInt();
		
	}//main method;
}
