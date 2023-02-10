package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_05 {
	public static void main(String[] args) {
		
		//배열이나 Collection의 데이터들을 쉽게 처리하기 위해 Stream을 사용
		String[] strArr = new String[3];
		strArr[0] = "aaa";
		strArr[1] = "bbb";
		strArr[2] = "ccc";
		
		List<String> strList = Arrays.asList(strArr);
		
		//Collection에는 stream으로 변환해주는 stream()을 가짐
		
		Stream<String> strStream1 = strList.stream();
		//<List>를 Stream 객체로 생성하는법
		//Interface Stream<T>
		
		Stream<String> strStream2 = Arrays.stream(strArr);
		//<배열>을 Stream 객체로 생성하는법
		//배열을 Stream으로 변환시는 Arrays의 static 메서드인 stream(배열)을 사용
		
		//Stream에서 제공하는 메서드를 이용
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
		
	}//main method;
}//main class;
