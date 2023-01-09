package com.Kwon.ch08Project;

public class Ex08_06 {

	public static void main(String[] args) {
		
		try {
			//고의로 발생시킬 예외 객체 만듦
			Exception e = new Exception("고의 발생 예외");
			//예외 객체 생성시 메세지를 넣어서(String) 객체를 만듦
			throw e;//예외 객체를 catch블록으로 던져준다,예외 종류에 따라 catch블록 선택
		}
		catch(Exception e) {
			System.out.println("예외 메세지 : " +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try-catch밖");
	}

}
