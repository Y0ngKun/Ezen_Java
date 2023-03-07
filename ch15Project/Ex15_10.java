package com.Kwon.ch15Project;

import java.io.StringReader;
import java.io.StringWriter;

//StringReader, StringWriter는 문자 기반이며 메모리를 이용
//CharArrayReader와 CharArrayWriter처럼 동작하며 더욱 많이 활용
public class Ex15_10 {
	public static void main(String[] args) {
		
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		//StringReader객체는 생성시 문자열 객체를 이용하여 생성
	
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while ((data = input.read()) != -1) {
				output.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("input data : " + inputData);
		System.out.println("output data : " + output);
		System.out.println("data : " + data);
		//StringWriter는 StringBuffer를 내장 활용하고
		//StringWriter 객체.toString()는 버퍼에 저장된 내용을 메모리에 출력한다
	
	
	}
}
