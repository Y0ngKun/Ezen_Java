package com.Kwon.ch10Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Ex10_Time {
	public static void main(String[] args) {
		//자바 1.8부터 추가된 time패키지의 클래스들
		LocalDate myObj = LocalDate.now();
		//현재 날짜(년,월,일)를 나타내는 객체
		
		System.out.println(myObj); //2023-01-16
		//LocalDate클래스의 Object에서 상속한 
		//toString()을 yyyy-MM-dd로 나오도록 재정의 해놨음.
		//toString()을 재정의 안해 놨다면 주소값이 나왔을 것
		
		LocalTime myObj1 = LocalTime.now(); 
		//현재 시간을 나타내는 객체생성
		
		System.out.println(myObj1);
		//LocalTIme클래스의 Object에서 상속한 
		//toString()을 (HH-mm-ss-ns) 10억분의 1초까지 나오도록 재정의 해놨음.
		//toString()을 재정의 안해 놨다면 주소값이 나왔을 것
		
		LocalDateTime myDateObj = LocalDateTime.now();
		//날짜 + 시간 표시 객체
		
		System.out.println("Before fomatting"+myDateObj);
		//LocalDateTime클래스의 Object에서 상속한 
		//toString()을 (2023-01-16T09:42:25.296488300) 
		//(yyyy-MM-dd) + T + (HH-mm-ss-ns) 10억분의 1초까지 나오도록 재정의 해놨음.
		//toString()을 재정의 안해 놨다면 주소값이 나왔을 것
		
		DateTimeFormatter myFomatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println();
		String formattedDate = myDateObj.format(myFomatObj);
		System.out.println(myDateObj);
		
		
		
		
		
		
	}//main method;
}//main class;
