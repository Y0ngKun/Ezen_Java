package com.Kwon.ch10Project;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		//요일값은 1~7까지를 반환한다 (1부터 7까지 요일값으로 쓰고) "" 빈칸은 색인 번호 0으로 쓰기위함
		Calendar date1 = Calendar.getInstance(); //객체 생성 순간의 현재시간
		Calendar date2 = Calendar.getInstance();
		
		//Calendar 객체의 각 구성요소를 변경하기 위해 set메서드를 사용
		//month의 경우 0부터 시작하기 때문에 4월인 경우 3으로 지정해야한다
		//date1.set(2019, Calendar.APRIL, 29);와 같이 할 수도 있다
		//년월일은 변경하는 set메서드는 0부터 시작함을 감안해서 넣음
		date1.set(2019, 3, 29);
		//void set(int year, int month, int date);
		//dat1.set (2019,Calendar.APRIL, 29);
		System.out.println("date1은 " + toString(date1)+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		//toString(date1)은 Object의 toString()이 아니다.
		//Calendar의 toString()은 오버라이드는 되어 있으나 Calendar의 모든 멤버변수를 표시해버린다.
		//때문에 필요한 Calendar의 요소만 문자열로 출력하도록 메서드를 만들어야한다.
		System.out.println("오늘(date2)은 " + toString(date2)+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다");
		
		// 두 날짜간의 차이를 얻으려면, .getTimeInMillis() 1000/1초 단위로 변환해야 한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		//getTimeInMillis의 리턴값은 pofix(unix)타임인 1970.1.1 0시 정각부터 경과한 시간을 밀리세컨드로 반환
		System.out.println("그날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference/(24*60*60)+ "일입니다");
		//1일  = 24*60*60 이다
		
		
	
	}//main method;
		
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) +"일 "; 
	}
	
}//main class;
