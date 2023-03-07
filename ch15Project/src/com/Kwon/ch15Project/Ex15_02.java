package com.Kwon.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//read()와 write() 메서드 사용법
public class Ex15_02 {
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);
		
		//int read(byte[] b, int off, int len)
		
		//len개의 byte값을 읽어 배열 b의 색인번호 off번 부터 저장
		//반환은 읽어 온 개수 (읽어와서 배열에 채운다)
		
		output.write(temp, 5 , 5);
		//void write(byte[] b, int off, int len)
		//byte배열 b에서 색인번호 off번부터 len개 만큼 읽어서 출력스트림에 write.
		
		//출력스트림을 배열로 변환
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp Source : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
	}
}
