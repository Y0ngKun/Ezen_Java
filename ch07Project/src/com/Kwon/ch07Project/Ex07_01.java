package com.Kwon.ch07Project;

public class Ex07_01 {
	public static void main(String[] args) {
	
	SmartTv stv = new SmartTv();
	
	stv.channel = 10; //channel은 Tv 클래스로부터 상속받은 멤버변수
	stv.channelUp(); //상속받은 메서드
	stv.channelDown();
	stv.channelDown();
	stv.channelUp();
	stv.channelUp();
	
	System.out.println(stv.channel);
	stv.displayCaption("Hello, World"); //자신(자식 클래스)가 만든 메서드 조상인 Tv 클래스에는 없음
	stv.caption = true;//자신(자식 클래스)가 만든 메서드 조상인 Tv 클래스에는 없음
	stv.displayCaption("Hello, World");
	
	
	}//main method;
}//main class;
