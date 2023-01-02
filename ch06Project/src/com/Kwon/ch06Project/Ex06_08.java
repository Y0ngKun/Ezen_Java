package com.Kwon.ch06Project;

public class Ex06_08 {

	public static void main(String[] args) {
		
//		Data3 d;//여기까진 참조형 변수
		Data3 d = new Data3(); //인스턴스 객체 생성
		
		d.x = 10;
		
		Data3 d2 =copy(d);//return값이 tmp이므로 10;
		
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		//tmp.x의 기본값은 = 0;

	}//main
	
	static Data3 copy(Data3 d) {
		//static메서드,Ex06_08클래스의 멤버메서드
		//return타입이 Date3객체,파라메타도 Data3의 객체
		Data3 tmp = new Data3();
		tmp.x = d.x;
		
		return tmp;
	}
	
} //pb class

class Data3 {
	int x;
	
}