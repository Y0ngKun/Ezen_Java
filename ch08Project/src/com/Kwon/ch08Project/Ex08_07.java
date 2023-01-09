package com.Kwon.ch08Project;

public class Ex08_07 {

	public static void main(String[] args) {
		
//		throw new Exception();
		//Exception 예외는 컴파일 예외(checked 에러)로 컴파일에러 발생
		//컴파일 에러는 명시적으로 제외
		try {
			throw new Exception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
