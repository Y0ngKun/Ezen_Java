package com.Kwon.ch10Project;

import java.util.Calendar;
import java.util.Iterator;

public class Ex10_03 {

	public static void main(String[] args) {
		//Calendar의 시간 설정 set 메서드 사용법
		final int [] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간 ","분 ","초 "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		//set메서드에서 년월일시간분초를 함께 파라메타로 사용하는 메서드는 있음
		//시간 분 초만 처리해주는 메서드는 없음
		time1.set(Calendar.HOUR_OF_DAY, 10);
		//24시간 기준 시간을 10시로 변경
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		//24시간 기준 20시로 변경
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : "+ time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 "
				+time1.get(Calendar.SECOND)+"초");
		
		System.out.println("time2 : "+ time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 "
				+time2.get(Calendar.SECOND)+"초");
		
		//두 시각의 차이
		//getTimeInMillis()는 어느 언어나 통일된 날짜(1970.1.1 0시 정각)
		//를 기준으로 하기때문에 자주 쓰고 중요하다
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println("time1과 time2의 차이는 " + difference + "초 입니다.");
		//System.currentTimeMillis()도 getTimeInMillis()와 같이 posix반환 (현재 시각만 처리)
		String tmp = "";
		for (int i = 0; i < TIME_UNIT_NAME.length; i++) {
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			//difference를 i가 0일시 3600으로 difference나누면 시간(정수)가 나오고 뒤에는 시간이 결합
			difference %= TIME_UNIT[i];
			//3600으로 나눈 나머지(즉 시간에 포함되지 않는 초)
		}
		
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
		

	}//main method;

}//main class;
