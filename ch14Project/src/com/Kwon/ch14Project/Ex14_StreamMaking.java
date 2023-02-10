package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream 객체 생성하기

public class Ex14_StreamMaking {
	public static void main(String[] args) {
		/*Collection 인터페이스에 stream()메서드가 존재하므로 
		  Collection 하위 클래스인 List,Set등은 Stream()메서드를 상속 받아 갖고있다.
		  Stream<E> stream(); 
		  stream() 메서드는 Stream객체를 반환한다.
		*/
		
		//List로 된 객체를 Stream으로 된 객체로 반환해보기
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		//스트림 객체를 이용하여 스트림 메서드 활용
		//forEach는 list로 만든 stream의 데이터를 내부 반복을 통해서 람다식으로 처리
		intStream.forEach(System.out::println);
		
		//가변 인자를 사용하여 Stream 만들기
		Stream<String> strStream1 = Stream.of("a","b","c");
		//Interface Stream <T>의 of 메소드 사용
		
		
		//Stream()로 배열 만들기
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c"});
		//Stream.of 메소드를 이용해 파라메타로 String[]을 생성하는 법
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"});
		//Arrays.stream 메소드로 String [] 생성하는 법
	
		Stream<String> strStream4 = Arrays.stream(new String[] {"a","b","c"},0,3);
		//{}뒤에 0은 색인번호 0이며, 3은 색인번호 3-1까지 선택
		
		
		//기본형 Int Stream만들기
		IntStream intStream1 = IntStream.of(1,2,3);
		//파라메타로 배열 사용
		IntStream intStream2 = IntStream.of(new int[] {1,2,3});
		IntStream intStream3 = Arrays.stream(new int[] {1,2,3});
		IntStream intStream4 = Arrays.stream(new int[] {1,2,3},0,3);
	
		intStream4.forEach(System.out::println);
		
		
		//Random클래스를 이용한 임의의 수 기본형 스트림 만들기
		IntStream intStream5 = new Random().ints(5);
		//ints()는 파라메타 값 미입력시 무한개의 정수를 갖는 intStream5를 만들기 때문에 
		//유한개의 임의의 수를 얻고 싶으면 파라메타에 사이즈를 지정해줘야함
		intStream5.forEach(System.out::println);
		
		DoubleStream doubleStream1 = new Random().doubles(5);
		doubleStream1.forEach(System.out::println);
		
	}//main method;
}//main class;
