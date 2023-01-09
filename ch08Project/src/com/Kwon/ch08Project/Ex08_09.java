package com.Kwon.ch08Project;

public class Ex08_09 {

	public static void main(String[] args) {
		
		//메서드에 throws를 사용하면 맨 처음 try-catch처리한 메서드까지 계속 예외처리를 위임한다.
		
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main메서드까지 예외처리 위임하여 main에서 처리");
		}
	}//main method;
	
	
	static void method1() throws Exception{
		//메서드에서 throws 예약 <throws Exception(예외처리명)>
		//예외처리를 자신 메서드에서 안하고 자신을 호출한 메서드로 위임
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();
	}


}



