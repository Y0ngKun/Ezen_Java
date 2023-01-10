package com.Kwon.ch08Project;

public class Ex08_13 {

	public static void main(String[] args) {
		try {
			install();		
		} catch (InstallException e) {
			//원인예외 SpaceException2가 등록된 InstallException예외를 처리한다 
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main method;

	
	static void install() throws InstallException {
		//InstallException예외 발생시 자신을 호출한 main 메서드로 예외 처리 위임
		try {statInstall();} 
		catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(e);
			//SpaceException2객체 e가 원인이 되어서 InstallException예외 ie를 발생시킴
			//다른 예외에 의해 발생한 ie에 원인 e를 등록시킴 
			throw ie;
		}
	}

	static void statInstall() throws SpaceException2 {
		//이 메소드를 호출한 install()메소드로 SpaceException2예외 처리를 위임
		throw new SpaceException2("설치할 공간이 부족합니다.");
	} 
}//main class;


class SpaceException2 extends Exception{
	SpaceException2(String msg){
		super(msg); //상위 클래스인 Exception의 생성자중 예외내용을 등록하는 생성자를 사용
	}
}

class InstallException extends Exception{
	InstallException(String msg){super(msg);}
}