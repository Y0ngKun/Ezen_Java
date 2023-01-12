package com.Kwon.ch10Project;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance(); //현재 (인스턴스 생성하는 순간)의 시각
		date.set(2019, 7, 31); //2019년 8월 31일
		
		System.out.println("처음 설정한 date : " + toString(date));
		System.out.println();//줄바꿈
		
		//Calendar객체의 구성 요소에 값을 더하거나 뺄 시 사용하는 add메서드
		//add메서드는 관련된 다른 구성 요소도 변경
		date.add(Calendar.DATE, 1); //date객체의 날짜에 1을(일) 더함
		System.out.println("add 메서드 사용 DATE +1 " + toString(date));
		
		date.add(Calendar.MONTH, -6);//6개월 전
		System.out.println("add 메서드 사용 MONTH -6 " +toString(date));
		
		date.add(Calendar.YEAR, -3); //3년전
		System.out.println("add 메서드 사용 YEAR -3 " +toString(date));
		
		
		//roll메서드도 구성 요소에 값을 더하거나 뺄 수 있으나
		//자신만 변경하고 관련 요소는 변경 안함
		
		date.roll(Calendar.DATE, -3);
		System.out.println("roll 메서드 사용 DATE - 1 : " + toString(date));
		//마지막 date값이 2016년 3월 1일인데 날짜만 -1해서 31로 바꾸고 년 월의 요소에는 영향을 끼치지 않는다
		
		date.roll(Calendar.MONTH, -1);
		System.out.println("roll 메서드 사용 MONTH - 1 : " + toString(date));
		
		date.roll(Calendar.YEAR, -2015);
		System.out.println("roll 메서드 사용 YEAR - 2015 : " + toString(date));
		

	}//main method;

	static String toString(Calendar date) {
		String result = 
				date.get(Calendar.YEAR)+"년 " + 
				(date.get(Calendar.MONTH)+1) + "월 " 
				+ date.get(Calendar.DATE) +"일 "; 
		return result;
	}
	
}//main class;
