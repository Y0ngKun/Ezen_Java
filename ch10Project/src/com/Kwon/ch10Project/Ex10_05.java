package com.Kwon.ch10Project;

import java.util.*;

public class Ex10_05 {
	
	public static void main(String[] args) {
		
		if (args.length !=2) {
			System.out.println("  Usage : java Ex10_5 2019 9");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); //시작일, //현재시각을 나타내는 객체
		Calendar eDay = Calendar.getInstance(); //마지막일 //현재시각을 나타내는 객체
		
		//args로 입력 받은 달을 1일로 sDay를 설정
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		//다음달의 첫날(12월 1일)에서 하루를 빼면 현재달의 마지막 날(11월 30일)이 된다.
		eDay.add(Calendar.DATE, -1);
		//위 코드 실행하면 eDay객체에는 전달 말일자가 지정된 객체값이 지정된다
//		END_DAY = sDay.getActualMaximum(Calendar.DATE); 를 사용해도 됨
		
		//현재 요일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		//START_DAY_OF_WEEK 는 1(일요일)부터 7 sDay는 입력받은 월이 1일이므로 1일의 요일값 반환
		//eDay에 지정된 날짜를 얻어온다.
		END_DAY = eDay.get(Calendar.DATE); //eDay Camendar 객체가 가진 날짜 값을 가져옴
		
		System.out.println("        " + args[0] + "년" + args[1] + "월");
		System.out.println("  SU  MO  TU  WE  TH  FR  SA");
//		
//		//해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
//		//만일 1일이 수요일이라면 공백을 세 번 찍는다. (일요일부터 시작)

		for (int i = 1; i < START_DAY_OF_WEEK; i++) 
			System.out.print("");
			
			for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
				System.out.print((i < 10)? "   " + i : "  " +i);
				if (n%7==0) System.out.println();	
		}
		
	}//main method;
}//main class;
