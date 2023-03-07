package com.Kwon.ch15Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Stream 기반을 문자기반으로 변환 처리
//현재는 scanner 객체를 이용하여 키보드 입력 처리
public class Ex15_12 {
	
	public static void main(String[] args) {
		
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//InputStreamReader는 기반 Reader
			//System.in 변수는 표준 입력 스트림으로 InputStream객체임
			
			BufferedReader br = new BufferedReader(isr);
			System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());
			
			do {
				System.out.println("문장을 입력하세요. 마치시려면 q를 입력하세요. >");
				line = br.readLine();
				System.out.println("입력하신 문장 : " + line);
				
			} while (!(line.equalsIgnoreCase("q")));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
