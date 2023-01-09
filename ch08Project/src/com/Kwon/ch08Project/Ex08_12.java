package com.Kwon.ch08Project;

public class Ex08_12 {
	public static void main(String[] args) {
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}//main method;

	static void method1() throws Exception {
		//일부는 자신이 try~catch로 처리하고 일부는 throw로 처리
		try {
			throw new Exception();//예외 발생
		}
		catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e; 
			//발생한 예외를 이용하여 다시 예외 발생
			//이 때는 호출한 메서드로 예외 위임
		}
	}

}
