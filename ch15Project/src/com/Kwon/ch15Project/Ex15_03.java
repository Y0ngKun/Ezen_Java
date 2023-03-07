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
				//available()�޼���� �Է½�Ʈ������ �о�� �� �ִ� �������� ������ ��ȯ
				//read()�ϸ� read�� ���Ҵ� �Ҹ�(����)�ȴ�.
				input.read(temp); //�迭 temp�� ũ�⸸ŭ �о�ͼ� �迭�� ä��� ��ȯ�� ������ ����
				//������ temp�迭�� �̿��Ͽ� �����
				output.write(temp); //�迭 temp�� ����� ��� ���Ҹ� ��½�Ʈ���� �ۼ��Ѵ�.
				//write�ô� ������ ��½�Ʈ���� �߰��Ѵ�.
				outSrc = output.toByteArray();// ��½�Ʈ���� ����Ʈ �迭�� ��ȯ
				printArrays(temp, outSrc);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		try {
			while(input.available() > 0) {
				//available()�޼���� �Է½�Ʈ������ �о�� �� �ִ� �������� ������ ��ȯ
				//read()�ϸ� read�� ���Ҵ� �Ҹ�(����)�ȴ�.
				int length = input.read(temp); //�迭 temp�� ũ�⸸ŭ �о�ͼ� �迭�� ä��� ��ȯ�� ������ ����
				//������ temp�迭�� �̿��Ͽ� �����
				output.write(temp,0,length); //�迭 temp�� ����� ��� ���Ҹ� ��½�Ʈ���� �ۼ��Ѵ�.
				//write�ô� ������ ��½�Ʈ���� �߰��Ѵ�.
				outSrc = output.toByteArray();// ��½�Ʈ���� ����Ʈ �迭�� ��ȯ
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
