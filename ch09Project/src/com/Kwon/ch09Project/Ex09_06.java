package com.Kwon.ch09Project;

public class Ex09_06 {

	public static void main(String[] args) {
	
		String str1 = "abc";
		String str2 = "abc";
		//String 객체를 리터럴로 만들시 리터럴 값은 같은 클래스 메모리에 저장되어
		//리터럴 값이 사용 될 시 마다 비교하여 같은 것이 있으면 기존 것을 사용(주소가 동일)
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		//"String str1 = "abc";"인데 "안에 다른 따옴표를 넣는 것은 금지되어
		//escapee sequence문자 \를 앞에 붙여 사용
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		//==연산자는 주소 비교
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//String의 equals는 자바에서 이미 값을 비교하도록 재정의
		System.out.println();
			
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new연산자로 String에 값을 저장하면 언제나 새로운 인스턴스를 생성 후
		//값을 저장하기에 참조변수(주소)가 늘 다르다
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		
		
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//String에 값을 비교하도록 미리 정의된 equals() 사용
		

	}

}
