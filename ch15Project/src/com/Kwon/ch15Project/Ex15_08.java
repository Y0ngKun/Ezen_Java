package com.Kwon.ch15Project;

import java.io.FileInputStream;
import java.io.FileReader;

//FileReader와 FileWriter
public class Ex15_08 {
	
	public static void main(String[] args) {
		
		try {
			String fileName = "ex1508.txt";
			
			FileInputStream fis = new FileInputStream(fileName);
			//byte 기반 
			
			FileReader fr = new FileReader(fileName);
			//text기반
			
			int data = 0;
			
			//FileInputStream을 이용해서 파일내용을 읽어 화면에 출력한다.
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			
			fis.close();
			System.out.println();
			System.out.println("=====================");
			
			//FileReder를 이용해서 파일 내용을 읽어 화면에 출력한다.
			while((data = fr.read()) != -1) {
				//char로 문자처리 (2바이트 문자) -- 한글처리 가능
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
