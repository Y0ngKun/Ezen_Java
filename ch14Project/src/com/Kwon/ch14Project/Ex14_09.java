package com.Kwon.ch14Project;

import java.util.Optional;
import java.util.OptionalInt;

//Optional 클래스 사용
//Optional<T>는 wrapper class로 모든 객체를 감싼다(수용 할 수 있다)
//Optional을 사용하면 null처리시 if문을 쓰지 않고도 Optional의 메서드로 간단히 처리 할 수 있다.
//Stream처럼 동작
public class Ex14_09 {
	
	public static void main(String[] args) {
		
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		
		//Optional의 저장 값은 get()으로 구하나 null 체크를 해주지는 않는다.
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		Optional<String> optStr1 = null;
//		System.out.println("optStr1 = " + optStr1.get() );
		//optStr1이 null이므로 get()사용시 NullPointerException 예외 발생
		
		
		int result = Optional.of("123")
				.filter(x-> x.length() > 0)
				.map(Integer::parseInt)
				.get();
		System.out.println("result = " + result);
		
		OptionalInt optInt1 = OptionalInt.of(0);
		//Optional객체인 OptionalInt에 0을 저장
		OptionalInt optInt2 = OptionalInt.empty();
		//빈 객체를 생성, -값을 getAsInt()로 반환시 예외 발생
		System.out.println("optInt1 = "+optInt1.getAsInt()); //0
		//OptionalInt에서는 get()대신 getAsInt()를 쓴다.

		//System.out.println("optInt2 = "+optInt2.getAsInt());
		//optInt2는 empty로 null이므로 getAsInt()사용시  NoSuchElementException 예외 발생
		
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));
		//0과 empty() 비교, 결과는 false
		
	}//main method;
}
