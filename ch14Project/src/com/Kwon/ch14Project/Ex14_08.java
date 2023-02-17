package com.Kwon.ch14Project;

import java.util.Arrays;
import java.util.stream.Stream;

//인터페이스 Stream의 flatMap() 사용
//stream의 데이터요소가 String처럼 배열 요소 일 시 간단히 문자열 데이터요소로 변환
public class Ex14_08 {
	
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String [] {"abc","def","jkl"},
				new String [] {"ABC","GHI","JKL"}
						);
		/* Stream의 데이터 구성요소가 String[]이다.
		 * 이때는 map()메서드 대신 flatMap()을 사용해야 Stream<String>이 됨
		 * map을 사용하면 Stream<Stream<String>>이 되는데, 복잡하다. 
		 */
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		//Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::println)
		strStrm.map(String::toLowerCase) //소문자로 변환
		.distinct() //중복제거
		.sorted() //기본정렬, 오름차순
		.forEach(System.out::println);
		
		System.out.println("======================");
	
		String[] lineArr = {
				"Believe or no It is true ",
				"Do or do not There is no try"		
		};
		
		Stream<String> lineArrStrm = Arrays.stream(lineArr);
		lineArrStrm.flatMap(line -> Stream.of(line.split(" +")))
		//배열의 문자열을 받아서 Stream 객체로 만들고, split 으로 구분자를 이용하여 문자열을 배열로 반환
		//구분자 " +"인데 +는 정규식에서 사용하는 하나 이상의 문자를 나타냄
		//즉 공백이 하나 이상 (여러개) 이기 때문에 공백을 줌;
		//배열의 1행과 2열이 String[]으로 변환
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}//main method;
}//main class;
