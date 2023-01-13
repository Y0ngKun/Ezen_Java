package com.Kwon.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_09 {

	public static void main(String[] args) {
		//SimpleDateFormat의 format과 parse 메서드 사용
		//format은 date객체를 정한 형식의 문자열로 변환, parse 정한 형식의 문자열을 Date형 표시
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		//DateFormat은 추상클래스로 SimpleDateFormat의 부모 클래스이다.
		
		Date d =null;
		
		try {
			d = df.parse("2019년 11월 23일");
			//정한 형식("yyyy년 MM월 dd일")의 문자열 값을 Date 객체로 변환
			//패턴과 다른 문자열을 주면 예외 발생
			//패턴에서 공백은 처리		
			System.out.println(df2.format(d));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//전한 형식의 문자열로 변환
		String ds = df2.format(d);
		System.out.println(ds);
		
		System.out.println(d);//원래 Date형으로 출력
		
		
		
	}//main method;
}//main class;
