package com.Kwon.ch15Project;

import java.io.FileOutputStream;
import java.io.PrintStream;

//표준 입출력 대상 변경
public class Ex15_14 {
	
	public static void main(String[] args) {
		
		PrintStream ps = null; //보조 스트림
		FileOutputStream fos = null; //기반 스트림
		
		try {
			fos = new FileOutputStream("test1514.txt");
			//파일이 없으면 만들어줌
			ps = new PrintStream(fos);
			System.setOut(ps); //표준 출력을 파일로 변경함
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello by System.out");
		//out표준 출력을 setOut으로 파일 test1514.txt로 변경하였으므로
		//콘솔창이 아닌 파일에 내용이 써진다.
		System.err.println("Hello by System.err");
		//err객체도 출력 대상을 변경하려면 SetErr(printStream)메서드로 변경해야함
		
		
		
	}

}
