package com.Kwon.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_03 {
	
	public static void main(String[] args) {

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		
		/*
		try {
			while(input.available() > 0) {
				//available()메서드는 입력스트림에서 읽어올 수 있는 데이터의 개수를 반환
				//read()하면 read된 원소는 소모(제외)된다.
				input.read(temp); //배열 temp의 크기만큼 읽어와서 배열을 채우고 반환은 데이터 개수
				//기존의 temp배열을 이용하여 덮어쓰기
				output.write(temp); //배열 temp에 저장된 모든 원소를 출력스트림에 작성한다.
				//write시는 기존의 출력스트림에 추가한다.
				outSrc = output.toByteArray();// 출력스트림을 바이트 배열로 변환
				printArrays(temp, outSrc);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		try {
			while(input.available() > 0) {
				//available()메서드는 입력스트림에서 읽어올 수 있는 데이터의 개수를 반환
				//read()하면 read된 원소는 소모(제외)된다.
				int length = input.read(temp); //배열 temp의 크기만큼 읽어와서 배열을 채우고 반환은 데이터 개수
				//기존의 temp배열을 이용하여 덮어쓰기
				output.write(temp,0,length); //배열 temp에 저장된 모든 원소를 출력스트림에 작성한다.
				//write시는 기존의 출력스트림에 추가한다.
				outSrc = output.toByteArray();// 출력스트림을 바이트 배열로 변환
				printArrays(temp, outSrc);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}//main method;
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
	
}
