package com.Kwon.ch06Project;

public class Ex06_14 {
	//기본형이 제일 먼저 로딩
	//초기화된 멤버가 두번째 로딩
	//static은 클래스 로딩시 static 블록 로딩
	//인스턴트블록은 생성자 실행시 마다 로딩후 생성자 초기화
	int x;
	static int y;
	int k = 5;
	static int j = 10;
	
	// 클래스형 블록
	static {
		System.out.println("static{}");
	}
	//인스턴스형 블록
	{System.out.println("{}");}
	
	//생성자
	public Ex06_14(){//클래스가 public이면 생성자도 public으로 작성
		System.out.println("생성자");
	}
	
	
	
	
	
	//main 메소드 시작
	public static void main(String[] args) {
		System.out.println("Ex06_14 bt = new Ex6_14()");
		
		Ex06_14 bt = new Ex06_14();
		//생성자가 실행될시 마다 인스턴스형 블록이 먼저 실행
		
		System.out.println("Ex06_14 bt = new Ex6_14()");
		
		Ex06_14 bt1 = new Ex06_14();
		
		
		//static 클래스가 젤 먼저 실행
		//그다음 메인메소드 첫 문장 실행
		//그다음  메인메소드 밖에 인스턴스형 블록
		//그다음 메인메소드 밖에 생성자
		
	}//main method;;

}//main class;


