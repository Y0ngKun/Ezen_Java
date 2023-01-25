package com.Kwon.ch12Project;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Deprecated
@SuppressWarnings("all")  
//@SuppressWarnings("all") //value요소 하나이므로 value를 생략 값이 1111 유효하지 않은 어노테이션은 무시된다. 
@TestInfo1(testedBy="Kwon",testDate= @DateTime1(yymmdd="170101",hhmmss="123456"))
//나머지 요소들(count(),testTools(),testType())은 default값이 있기때문에 생략 가능하다(default값 적용됨) 

public class Ex12_08 {//@Deprecated를 사용해서 deprecated 처리됨) 
	public static void main(String[] args) {
		
		Class<Ex12_08> cls = Ex12_08.class;
		//어느 클래스(Class<Ex12_08>)의 객체(cls)는 자바파일을 컴파일한 클래스 파일이 됨
		TestInfo1 anno = cls.getAnnotation(TestInfo1.class);
		//어노테이션을 사용하는 클래스에 포함된 어노테이션 객체는 getAnnotation(TestInfo1.class)로 얻는다.  
		//어노테이션에 설정된 요소들 값을 알아내기 어노테이션객체.어노테이션 요소(메서드 형식)
		//어노테이션을 사용하는 객체를 만들고
		System.out.println("anno.testedBy() = "+anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = "+ anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = "+ anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) {
			System.out.println("anno.testTools() = " + str);
		}
		
		System.out.println();
		
		//getAnnotations()는 클래스파일에 사용하는 모든 어노테이션을 배열로 반환
		//유효하지 않은 SuppressWarnings는 제외하고 반환
		Annotation [] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
		
	}//main method;
}//main class;

@Retention(RetentionPolicy.RUNTIME) //실행시에 적용(Retention에는 CLASS,RUMTIME,SOURCE 3개 있음)

@interface TestInfo1{ //어노테이션은 만들때 그냥 interface가 아니고 @interface를 한다(!!)
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit"; // 배열인데 값이 하나이므로 {}생략가능
	TestType1 testType() default TestType1.FIRST;//enum 사용, enum TestType{FIRST,SECOND}
	DateTime1 testDate();//testDate는 다른 어노테이이션
}

@Retention(RetentionPolicy.RUNTIME) //실행시에 적용(Retention에는 CLASS,RUMTIME,SOURCE 3개 있음)
@interface DateTime1{
	String yymmdd();
	String hhmmss();
}

enum TestType1{FIRST,SECOND}