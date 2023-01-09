package com.Kwon.ch08Project;

import java.io.File;

public class Ex08_10 {

	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" 다시 입력해 주시기 바랍니다.");
		}

	}//main method;

	static File createFile(String fileName) throws Exception{
		//자신 메서드를 호출한 main메서드로 에외처리 위임
		if(fileName==null || fileName.equals("")) 
			throw new Exception("파일이름이 유효하지 않습니다");
		//예외발생시 이 메서드안에서 try~catch로 처리 안하고 호출한 메서드로 처리 위임
		//예외처리로 가므로 호출메서드로 감
		File f = new File(fileName);
		f.createNewFile();//File객체로 실제 파일 만들기
		
		System.out.println("파일이 프로젝트 밑에 만들어짐 - 프로젝트에서 Refresh해야 보임");
		return f;
	}
	
	
}//main class;
