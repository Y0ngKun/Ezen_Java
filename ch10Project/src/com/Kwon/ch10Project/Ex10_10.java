package com.Kwon.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요"+ "(입력 예: 2019/12//31)" );
		
		
		//Scanner.hasNextLine()은 맨 처음에 블록 안으로 진입
		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());//입력대기
				//정한 패턴 형식 (String pattern = "yyyy/MM/dd")이 아니면 Date객체로 변환 불가
				
				break;
				//예외 발생하면 catch로 가고 아니면 break;
			}
			catch(Exception e) {
//				e.printStackTrace();
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요" + "(입력 예 : 2019/12/31");
				
			}
		}//while
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
		System.out.println("입력하신 날짜는 현재와" + day +" 시간차이가 있습니다");

	}

}
