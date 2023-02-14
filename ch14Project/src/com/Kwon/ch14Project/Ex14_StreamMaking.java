package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.swing.plaf.basic.BasicColorChooserUI;

//Stream 객체 생성하기

public class Ex14_StreamMaking {
	public static void main(String[] args) {
		//Collection 인터페이스에 stream()메서드가 존재하므로 
		//Collection 하위 클래스인 List,Set등은 Stream()메서드를 상속 받아 갖고있다.
		//Stream<E> stream(); 
		//stream() 메서드는 Stream객체를 반환한다.
		
		
		/*List로 된 객체를 Stream으로 된 객체로 반환해보기*/
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		//스트림 객체를 이용하여 스트림 메서드 활용
		//forEach는 list로 만든 stream의 데이터를 내부 반복을 통해서 람다식으로 처리
		intStream.forEach(System.out::println);
		
		/*가변 인자를 사용하여 Stream 만들기*/
		
		Stream<String> strStream1 = Stream.of("a","b","c");
		//Interface Stream <T>의 of 메소드 사용
		
		//Stream()로 배열 만들기
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c"});
		//Stream.of 메소드를 이용해 파라메타로 String[]을 생성하는 법
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"});
		//Arrays.stream 메소드로 String [] 생성하는 법
	
		Stream<String> strStream4 = Arrays.stream(new String[] {"a","b","c"},0,3);
		//{}뒤에 0은 색인번호 0이며, 3은 색인번호 3-1까지 선택
		
		
		/*기본형 Int Stream만들기*/
		
		IntStream intStream1 = IntStream.of(1,2,3);
		//파라메타로 배열 사용
		IntStream intStream2 = IntStream.of(new int[] {1,2,3});
		IntStream intStream3 = Arrays.stream(new int[] {1,2,3});
		IntStream intStream4 = Arrays.stream(new int[] {1,2,3},0,3);
	
		intStream4.forEach(System.out::println);
		
		
		/*Random클래스를 이용한 임의의 수 기본형 스트림 만들기*/
		
		IntStream intStream5 = new Random().ints(5);
		//ints()는 파라메타 값 미입력시 무한개의 정수를 갖는 intStream5를 만들기 때문에 
		//유한개의 임의의 수를 얻고 싶으면 파라메타에 사이즈를 지정해줘야함
		intStream5.forEach(System.out::println);
		
		DoubleStream doubleStream1 = new Random().doubles(5);
		doubleStream1.forEach(System.out::println);
		
		
		
		/*Stream - 특정 범위의 정수값 얻는 메소드*/
		
		IntStream IntStream6 = IntStream.range(1, 5);
		//1~4까지의 정수값을 반환하는 메서드(end 미포함)
		IntStream6.forEach(System.out::println);
		
		IntStream IntStream7 = IntStream.rangeClosed(1, 5);
		//1~5까지의 정수값을 반환하는 메서드(end 포함)
		IntStream7.forEach(System.out::println);
		
		IntStream IntStream8 = new Random().ints(1,5);
		//Random의 ints()를 사용해서도 가능, end는 포함 안하는 무한 반복 Stream 생성
		IntStream8.limit(4).forEach(System.out::println);
		
		//iterate()와 generate()는 static이며 무한 반복 Stream객체 생성
		Stream<Integer> eventStream = Stream.iterate(0, n->n+2);
		//무한 반복 Stream, seed값을 이용하고 리턴값이 다음 seed값이 됨
		eventStream.limit(5).forEach(System.out::println);
		
		Stream<Double> eventStream2 = Stream.generate(Math::random);
		eventStream2.limit(5).forEach(System.out::println);
		
		
		/*비어있는 Stream객체 만들기 < =null 보다 권고함> */
		Stream<String> emptyStream = Stream.empty();
		long count = emptyStream.count();
		System.out.println(count);
		

	}//main method;
}//main class;
