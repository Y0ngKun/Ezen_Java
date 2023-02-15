package com.Kwon.ch14Project;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_06 {
	public static void main(String[] args) {
		Stream<StudentEx14> StudentEx14Stream = Stream.of(
				new StudentEx14("이자바",3,300),
				new StudentEx14("김자바",1,200),
				new StudentEx14("안자바",2,100),
				new StudentEx14("박자바",2,150),
				new StudentEx14("소자바",1,200),
				new StudentEx14("나자바",3,290),
				new StudentEx14("감자바",3,180)
				);
		//Comparator의 메서드를 이용해서 특정 값을 비교 정렬시는 Comparable 인터페이스를
		//구현한 클래스에 대해서는 파라메터가 하나인 comparing()을 사용
		StudentEx14Stream.sorted(Comparator.comparing(StudentEx14::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		//comparing()은 특정 값을 이용
		//Comparator.naturalOrder()는 Comparable을 구현한 Student에서 정의한
		//compareTo() 에서 정의한 내림차순 정렬 방식 사용
	
	
	}//main method;
}//main class;
