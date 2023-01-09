package com.Kwon.ch08Project;

public class Ex08_11 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}
		catch(SpaceException se) {
			System.out.println("에러 메시지 : " + se.getMessage());
			//개발자가 만든 SpaceException사용
			se.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치 하시기 바랍니다.");
		}
		catch(MemoryException me) {
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
			//개발자가 만든 MemoryException사용
		}
		finally {
			deleteTempFiles();
		}
	}

	
	static void startInstall() throws SpaceException, MemoryException {
		// 이 메서드 실행시는 무조건 SpaceException, MemoryException 예외처리
		if(!enoughSpace())
			throw new SpaceException("설치공간이 부족합니다.");
		if(!enoughMemory()) // 충분한 메모리가 없으면
			throw new MemoryException("메모리가 부족합니다");
	}

static void copyFiles() {}
static void deleteTempFiles() {}

static boolean enoughSpace() {return false;}
static boolean enoughMemory() {return true;}



class SpaceException extends Exception{
	//예외처리 클래스 Exception을 상속한 개발자가 만드는 예외처리 클래스
	SpaceException(String msg){
		//예외관련메세지를 예외 객체에 추가해주기는 super(Exception을 활용);
		super(msg);	
	}
}
class MemoryException extends Exception{
	//예외처리 클래스 Exception을 상속한 개발자가 만드는 예외처리 클래스
	MemoryException(String msg){
		//예외관련메세지를 예외 객체에 추가해주기는 super(Exception을 활용);
		super(msg);
	}
}
	
}//main class;
