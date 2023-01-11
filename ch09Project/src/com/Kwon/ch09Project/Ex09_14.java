package com.Kwon.ch09Project;

public class Ex09_14 {
	public static void main(String[] args) {
//	Integer i = new Integer(100);//자바 9버전부터 권장하지 않는 생성 방식
//	Integer i2 = new Integer(100);//자바 9버전부터 권장하지 않는 생성 방식
	
	Integer i = 100; //기본형값을 객체형으로 자동으로 박싱(오토박싱)해 줌
	Integer i2 = 100; //기본형값을 객체형으로 자동으로 박싱(오토박싱)해 줌
	
	//String처럼 리터럴로 초기화하여 객체를 생성하면 JVM에서 동일한 값이면 공동 사용(주소값 같음)
	System.out.println("i == i2 ? "+ (i == i2));
	System.out.println("equals로 비교 : " + i.equals(i2));
	//wrapper클래스의 equals는 값을 비교하도록 오버라이딩 됨.
	
	//예전에는 wrapper클래스의 객체는 비교연산이 안되어서 campareTo()메서드를 사용
	//지금은 비교 연산 잘 됨
	System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
	//compareTo는 같으면 0 다르면 0이 아닌 값
	
	//toString()도 Override되어 Wrapper클래스 객체를 문자열로 변환
	System.out.println("i.toString() = " + i.toString());
	
	//각 wrapper클래스별 상수가 지정되어 있음
	System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);	
	System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
	System.out.println("SIZE = " +Integer.SIZE + "bits"  );
	System.out.println("BYTES = " +Integer.BYTES + "bytes");
	System.out.println("TYPE = " +Integer.TYPE);
	
	
}
}