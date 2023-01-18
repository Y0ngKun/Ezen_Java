package com.Kwon.ch11Project;

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
		
	
	}//main method;
}//main class;
