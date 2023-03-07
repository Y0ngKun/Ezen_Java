package com.Kwon.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//�޸𸮸� ������� �ϴ� ByteArrayInputStream�� ByteArrayOutputStream
public class Ex15_01 {
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		//byte�� -128 ~ 127
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		//public abstract class InputStream�� InputStream�� �ְ� ����
		//ByteArrayInputStream�� InputStream�� ������ ��� ��Ʈ��
		ByteArrayOutputStream output = null;
		//public abstract class OutputStream�� OutputStream�� �ְ� ����
		//ByteArrayOutputStream�� OutputStream�� ������ ��� ��Ʈ��		
		
		input = new ByteArrayInputStream(inSrc);
		//input��ü (ByteArrayInputStream ��ü)�� ������ �Է� ��Ʈ�� �ҽ��� ����� byte �迭�� ����Ͽ� ����
		output = new ByteArrayOutputStream();
		//32����Ʈ �뷮�� ���ۿ뷮 ���� byte[32];
		
		int data = 0; //�Է½�Ʈ������ �о���� �� ����
		while((data=input.read()) != -1) {
			//InputStream�� read()�޼���� 1����Ʈ�� �о���� �о�� ���� ������ -1�� ��ȯ
			
			output.write(data);
			//void write(int b)�������� ��½�Ʈ���� ���
			//������� output��Ʈ���� ���
		}
		
		outSrc = output.toByteArray();
		//output�� �ִ� ���� Byte�迭�� ��ȯ
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		//Arrays�� �ִ� toString(�迭)�� �̿��� ���ڿ��� ��ȯ
		
	}//main method;
}
