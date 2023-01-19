package com.Kwon.ch11Project;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex11_property {
	public static void main(String[] args) {
		
		//! 보통 Properties는 외부 파일에 저장한다. !
		//Properties도 Map의 일종이고 HashTable 아래에 있다

		//Properties 사용
		//HashTable을 이용하므로 Map처럼 사용
		//단 Key와 value가 String String
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "Korean");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.properties"), "properties Exam");
			//작성될 문서의 종류가 txt문서임
			//FileOutputStream은 자바의 입출력 처리 관련 클래스로 파일에 내용을 작성시 사용
			//void store(OutputStream out, String comments) throws IOException
			//OutputStream out은 출력 객체, comments는 Properties파일에 작성할 주석
		
			prop.storeToXML(new FileOutputStream("output.xml"), "properties Xml Exam");
			//작성될 문서의 종류가 xml문서임
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}//main method;
}//main class;
