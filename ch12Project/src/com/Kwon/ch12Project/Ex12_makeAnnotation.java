package com.Kwon.ch12Project;

@TestInfo(
		count = 3,testedBy="kwon",testTools= {"JUnit","AutoTester"},testType=TestType.FIRST,
				testDate = @DateTime(yymmdd="160101",hhmmss="230125")
	)
public class Ex12_makeAnnotation {
	public static void main(String[] args) {
		
		System.out.println("어노테이션 활용");
		
		
	}//main method;
}//main class;

@interface TestInfo{//@interface로 어노테이션 정의
	//추상메서드 형식으로 어노테이션에서 사용할 요소를 만든다
	//단, 파라메타는 없어야함
	int count() default 1;
	String testedBy();
	String[] testTools();
	TestType testType();//enum 사용, enum TestType{FIRST,SECOND}
	DateTime testDate();//testDate는 다른 어노테이이션
}

enum TestType{
	FIRST,SECOND
}

@interface DateTime{
	//인터페이스 구성요소는 추상메서드 형식
	String yymmdd();
	String hhmmss();
}