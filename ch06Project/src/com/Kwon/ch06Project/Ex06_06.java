package com.Kwon.ch06Project;

class Data{int x;}

public class Ex06_06 {
	
	static void change(int x) {
		//인자값을 받는 파라메타가 기본형일시는 이 안에서 로칼변수로 작용
		//변경된 값이 인자값을 변경하지는 못한다
		x = 1000;
		System.out.println("change() : x = " + x);
	}//end of static change
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		
		change(d.x);//change 메서드 호출
		//main 메서드 안에서 메서드 이름으로 바로 호출이 가능한 것은 
		//main 메서드 (Ex06_06)와 같은 클래스의 static메서드만 가능
		//static 메서드안에서 동일 클래스의 static메서드 호출은 메서드 이름만으로 가능
		
	}

}

