package com.Kwon.ch13Project;

public class Ex13_02 {

	public static void main(String[] args) {
		//main Thread 하나만 사용하여 작업
		
		long startTime = System.currentTimeMillis();
		//currentTimeMillis()은 밀리세컨드로 된 posix 입
		//1970-01-01부터 지금 이 순간 까지
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("-"));
			//"-"을 사용하지 않고 new String("-")으로 하면 시간이 조금 더 걸림
			//여기서는 일부러 사용했다
		}
		System.out.println("줄바꿈");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("소요시간" + (startTime-endTime));
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		endTime = System.currentTimeMillis();
		System.out.println("줄바꿈2");
		System.out.println("소요시간2" + (startTime-endTime));
		
	}//main method;
}//main class;
