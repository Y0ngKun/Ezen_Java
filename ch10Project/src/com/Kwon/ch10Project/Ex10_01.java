package com.Kwon.ch10Project;

import java.time.ZoneOffset;
import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		//Calendar클래스는 추상 클래스이기 때문에 인스턴스를 만들 수 없다
		//생성된 Calendar객체는 현재 시각을 나타내는 객체
		//현재 시각의 각 구성 요소인 년,월,일,시간 등의 구성 요소는 
		//get(시각 구성하는 요소 상수값)
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		//public static final Calendar.YEAR = 1로 정의됨
		System.out.println("이 해의 년도 : " + today.get(Calendar.MONTH));
		//월은 0월 부터 11월로 출력된다
		System.out.println("오늘은 올 해의 몇번 째 주 인가요? : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("오늘은 이번 달의 몇번 째 주 인가요? : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("오늘이 며칠 인가요? "+today.get(Calendar.DATE));
		System.out.println("오늘은 이달의 며칠인가요? "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("오늘은 올해의 며칠인가요? "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("오늘은 이번달 요번 주의 며칠째인가요? "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("지금이 오전인가요 오후 인가요 ? 0은 오전, 1은 오후입니다 : "+today.get(Calendar.AM_PM));
		System.out.println("시간 (0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간 (0~24) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초 (0~59) : "+today.get(Calendar.SECOND));
		System.out.println("밀리세컨드 100분의 1초 (0~999) : "+today.get(Calendar.MILLISECOND));	
		
		
		System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		//TimeZone은 세계표준시(UTC)를 기준으로 지역시간이 몇시간 늦냐 빠르냐를 나타냄
		//UTC와의 차이가 밀리세컨드로 나와서 
		//초로 환산시 1000으로 나누고
		//초는 다시 1분을 환산하기 위해 60으로 나누고
		//다시 1시간을 60으로 나누기 위해 1000*60*60
		
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
		
		
		
	}//main method;

}//main class;
