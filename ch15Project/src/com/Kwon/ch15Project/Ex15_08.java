package com.Kwon.ch15Project;

import java.io.FileInputStream;
import java.io.FileReader;

//FileReader�� FileWriter
public class Ex15_08 {
	
	public static void main(String[] args) {
		
		try {
			String fileName = "ex1508.txt";
			
			FileInputStream fis = new FileInputStream(fileName);
			//byte ��� 
			
			FileReader fr = new FileReader(fileName);
			//text���
			
			int data = 0;
			
			//FileInputStream�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			
			fis.close();
			System.out.println();
			System.out.println("=====================");
			
			//FileReder�� �̿��ؼ� ���� ������ �о� ȭ�鿡 ����Ѵ�.
			while((data = fr.read()) != -1) {
				//char�� ����ó�� (2����Ʈ ����) -- �ѱ�ó�� ����
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
