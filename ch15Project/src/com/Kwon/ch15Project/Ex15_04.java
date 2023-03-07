package com.Kwon.ch15Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream, FileOutputStream
public class Ex15_04 {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream(args[0]);
		//FileInputStream(String name) throws FileNotFoundException
		//file이 없으면 예외 발생
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		//FileOutputStream은 파일 생성시 파일이 없으면 새로 만듦
		
		int data = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data; // 0~255 사이의 값이므로 char범위에 들어감
			System.out.println(c);
			fos.write(data); //FileOutputStream을 이용하여 출력 대상 파일에 write
		}
		fis.close();
		fos.close();
	
	}
}
