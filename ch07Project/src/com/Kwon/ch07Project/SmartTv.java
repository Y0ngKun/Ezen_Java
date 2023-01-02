package com.Kwon.ch07Project;

public class SmartTv extends Tv {
	//Tv 클래스를 상속
	//Tv 클래스의 멤버변수와 멤버메서드를 상속(생성자나 초기화 블록은 상속 안 됨)
	//멤버변수 power,channel과 멤버메서드 power(),channelUp(),channelDown()을 상속
	//상속된 것 외에 추가 할 것만 작성
	boolean caption;
	void displayCaption(String text) {
		if (caption) { //caption 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}

}
