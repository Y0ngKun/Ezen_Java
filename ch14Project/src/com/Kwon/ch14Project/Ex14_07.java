package com.Kwon.ch14Project;

import java.io.File;
import java.util.stream.Stream;

//map 중간 연산 메서드
public class Ex14_07 {
	
	public static void main(String[] args) {
		//<R> Stream<R> map ( Function <? super T, ? extends R> mapper )
		//앞에 <R>표시가 있어서 제네릭 메서드임
		//파라메타로 T를 받아서 R을 반환하는 함수형 인터페이스 Function사용
		
		File[] fileArr = {
				new File("Ex1.java"),
				new File("Ex1.bak"),
				new File("Ex2.bak"),
				new File("Ex1"),
				new File("Ex1.txt")
		}; 
	//File(String pathName)생성자는 파라메타로 파일의 경로명을 이용하여 파일 객체를 만듦
	
		Stream<File> fileStream = Stream.of(fileArr);
		//map()으로 Stream<File>을 Steam<String>으로 변환
		
		Stream<String> fileNameStream = fileStream.map(File::getName);
		//데이터 타입이 File인 객체를 받아서 데이터 타입을 String으로 변환
		fileNameStream.forEach(System.out::println);
		//forEach는 최종 연산이므로 Stream을 소모시켜버린다.
		
		System.out.println("=============================");
		
		fileStream = Stream.of(fileArr);
		//Stream 객체 재생성
		
		fileStream.map(File::getName)/*String Stream*/
		.filter( s -> s.indexOf('.') != -1  )/*indexOf 메서드로 문자 '.'을 찾아서 해당 문자의 색인번호가 -1이 아니면 true, 즉 문자 .이 포함되어있으면 생략 한다*/
		.peek(s->System.out.printf("fileName = %s%n",s)) /*중간연산도 각각의 데이터요소에 대해 최종처리 하면서 반복*/
		.map(s -> s.substring(s.indexOf('.')+1))/* .이후의 확장자 문자열만 선택 */
		.peek(s->System.out.printf("extension = %s%n",s))
		.map(String::toUpperCase) /*대문자로 변환*/
		.distinct() /*중복제거*/
		.forEach(System.out::println);
		//map은 중간 연산이므로 여러번 수행 가능
		
	}//main method;
}//main class;
