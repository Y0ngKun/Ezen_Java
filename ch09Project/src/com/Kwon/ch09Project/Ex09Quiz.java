package com.Kwon.ch09Project;

public class Ex09Quiz {
	public static void main(String[] args) {
	Integer myInt = 5;
//	int myInt = Integer.valueOf(5); // 내 풀이
	Double myDouble = 5.99;
//	double myDouble = Double.valueOf(5.99); // 내 풀이
	Character myChar = 'A';
//	char myChar = Character.valueOf('A'); // 내 풀이 

	
	System.out.printf("my Int : %d, myDouble : %.2f, myChar : %c%n",myInt,myDouble,myChar);
	
//	wrapper class는 toString()를 내용을 출력하도록 이미 Override됨
//	System.out.println(myInt);
//	System.out.println(myDouble);
//	System.out.println(myChar);
//	
	
	String strInt = String.valueOf(myInt);
	String strDouble = String.valueOf(myDouble);
	String strChar = String.valueOf(myChar);
	
	System.out.printf("strInt : %s, strDouble : %s, strChar: %s%n",strInt,strDouble,strChar);
	

	String greeting = String.valueOf("Hello World"); //내 풀이
//	String greeting = "Hello World"; // 다른 사람 답 , 좋은 방법 new 생성자 보다 권고된다.
	
	System.out.println("greeting의 문자 수는 : " + greeting.length());
	//문자열의 문자 개수는 length()메서드 사용. 특수문자와 공백등이 모두 포함된다.
	
	System.out.println(greeting.toUpperCase());
	System.out.println(greeting);
	
	System.out.println("John " + "Doe"); // + 연산자로 문자열 결합
	System.out.println("John ".concat("Doe")); //.concat()메서드로 문자열 추가를 자주 쓴다 
	
	int indexof = greeting.indexOf('e');
	System.out.println("Hello World중에 e의 색인번호는  = "+indexof);
	
	int x = 5;
	int y = 7;
	System.out.println(Math.max(x, y)); //Math.max(a, b) 파라메타중 최대값 비교해서 리턴
	System.out.println(Math.min(x, y)); //Math.min(a, b) 파라메타중 최소값 비교해서 리턴
	
	double z = 16.0;
	System.out.println(Math.sqrt(z)); //Math.sqrt()는 루트값(제곱근) 구하는 메소드
	
	StringBuffer sb = new StringBuffer("abcdef");
	System.out.println(sb.append(12345)); //StringBuffer도 toString이 Override 되어서 재정의 되어있다.
	
	}//main method;
}//main class;

/*1. int의 객체형 변수 myInt를 선언하고 초기값을 5를 대입
 *2. double 객체형 변수 myDouble을 선언하고 초기값 5.99 대입
 *3. char 객체형 myChar를 선언하고 초기값 A대입
 *4. 1,2,3을 출력
 *5. 1,2,3 변수를 문자열 변수 strInt,strDouble,strChar로 변환
 *6. 5번 변수값을 각각 출력
 *7. 값이 Hello World인 문자열 변수 greeting을 선언
 *8. 7번의 greeting변수의 문자수를 출력
 *9. 7번의 문자열을 모두 대문자로 변환하여 출력
 *10. John과 Doe를 결합하여 출력
 *11. 7번의 greeting변수에서 e문자의 색인번호를 얻어내기
 *12. x는 5이고 y는 7인데 이중 큰값을 얻어내기
 *13. z는 16인데 루트값 얻어내기
 *14. 문자열 abcdef를 갖는 StringBuffer 객체 sb를 선언
 *15. sb에 문자열 12345 붙이기
 * 
 */
