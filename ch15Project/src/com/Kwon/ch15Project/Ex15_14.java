package com.Kwon.ch15Project;

import java.io.FileOutputStream;
import java.io.PrintStream;

//ǥ�� ����� ��� ����
public class Ex15_14 {
	
	public static void main(String[] args) {
		
		PrintStream ps = null; //���� ��Ʈ��
		FileOutputStream fos = null; //��� ��Ʈ��
		
		try {
			fos = new FileOutputStream("test1514.txt");
			//������ ������ �������
			ps = new PrintStream(fos);
			System.setOut(ps); //ǥ�� ����� ���Ϸ� ������
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello by System.out");
		//outǥ�� ����� setOut���� ���� test1514.txt�� �����Ͽ����Ƿ�
		//�ܼ�â�� �ƴ� ���Ͽ� ������ ������.
		System.err.println("Hello by System.err");
		//err��ü�� ��� ����� �����Ϸ��� SetErr(printStream)�޼���� �����ؾ���
		
		
		
	}

}
