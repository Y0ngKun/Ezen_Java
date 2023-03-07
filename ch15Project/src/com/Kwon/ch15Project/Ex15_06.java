package com.Kwon.ch15Project;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex15_06 {
	
	public static void main(String[] args) {
		try {
			//파일이 없으면 예외가 발생하므로 예외 처리를 해줘야 한다.
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			//BufferedOutputStream(OutputStream의 기반 객체, 바이트 크기)
			//보조스트림은 생성시 기반 스트림 객체를 이용하여 객체를 만듦
			//만일 버퍼 크기가 없으면 기본인 8192바이트를 가짐
			for(int i = '0' ; i <= '9'; i++) {
				//보조 스트림을 이용시 read,write 메서드는 보조스트림의 메서드 사용
				//실제로는 기반 스트림의 read,write가 처리함
				bos.write(i);
			}
			//fos.close(); 버퍼에 일부는 남게 됨
			bos.close();
			//보조스트림 객체를 close()하면 자동으로 기반 스트림인 fos.close()도 수행하여
			//flush()도 자동 실행되어 버퍼를 비워 준다.
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로젝트 폴더 밑에 123.txt가 생겼는지 프로젝트를 refresh해서 봄");
		
	}
}
