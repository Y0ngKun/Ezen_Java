package com.Kwon.ch10Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_08 {

	public static void main(String[] args) {
		
		Date today = new Date();
//		Calendar today = Calendar.getInstance();
		
		System.out.println("today 객체 : " + today);
		//Fri Jan 13 12:37:42 KST 2023  - > 기본값 출력하면 이렇게 나옴
		
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		SimpleDateFormat sdf5,sdf6,sdf7,sdf8,sdf9,sdf10;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		//달(Month)만 대문자 사용(!!)
		sdf2 = new SimpleDateFormat("''yyyy년 MMM dd일 E요일");
		//E는 요일, '는 특수문자앞에 붙여서 특수문자를 일반 문자로 처리
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:ss.SSS");
		//H(대문자)는 24시간 타입 0~23 /  h(소문자)는 12시간 형식 1~12
		//s(소문자)는 초 0~59  /  S(대문자) 밀리세컨드 0~999 
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//a는 오전,오후 표시 
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		//D는 년 의 몇번째 일 표시
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		//d는 월의 몇번째 일 표시
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주 입니다.");
		//w는 년의 몇번째 주 표시
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주 입니다.");
		//W는 월의 몇번재 주 표시
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		//F는 월의 몇변째 요일 표시
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		System.out.println();

		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));

		

	}

}
