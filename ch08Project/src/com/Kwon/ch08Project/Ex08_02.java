package com.Kwon.ch08Project;

public class Ex08_02 {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		try {
			System.out.println(0/0); 
			//수학에서 0을 0으로 못 나누므로 산술예외(ArithmeticException)가 발생
			System.out.println(2);//앞 부분에서 에외 발생하면 이 문장은 못옴(catch로 던져짐)
		}
		catch(ArithmeticException e){
			//ArithmeticException(산술연산예외)일 때 처리
			//여기서 예외처리되면 try ~ catch문 종료
			System.out.println(3);
			e.printStackTrace();
		}
		catch(Exception e) {
			//Exception은 예외 클래스의 최상위 클래스이므로 모든 예외 처리
			//즉 위에 ArithmeticException을 제외한 예외를 처리한다
			System.out.println("ArithmeticException이 아닌 예외 발생");
		}
		
		//예외가 없거나 catch로 에외처리 후 실행 문장
		//예외 발생 했으나 catch로 예외처리 안되면 이곳으로 안오고 catch에서 종료
		System.out.println("try~catch 문장 밖");
		
	}
}
