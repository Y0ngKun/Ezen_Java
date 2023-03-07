package com.Kwon.ch15Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream, FileOutputStream
public class Ex15_04 {
	
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream(args[0]);
		//FileInputStream(String name) throws FileNotFoundException
		//file�� ������ ���� �߻�
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		//FileOutputStream�� ���� ������ ������ ������ ���� ����
		
		int data = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data; // 0~255 ������ ���̹Ƿ� char������ ��
			System.out.println(c);
			fos.write(data); //FileOutputStream�� �̿��Ͽ� ��� ��� ���Ͽ� write
		}
		fis.close();
		fos.close();
	
	}
}
