package com.Kwon.ch08Project;



public class Ex08_05 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(Exception e) { //최상위 Exception
//			e.getMessage(); getMessage는 꼭 출력문 출력하여 써야한다
			e.printStackTrace();
			//call stack 메모리에 있는 메서드의 정보에서 예외정보 콘솔창에 출력
			System.out.println("예외메세지 : " + e.getMessage());
			//해당 예외 객체에 정의된 예외 메세지
		}
		
		System.out.println(6);
		
	}

}
