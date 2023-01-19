package com.Kwon.ch11Project;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex11_property {
	public static void main(String[] args) {
		
		//! ���� Properties�� �ܺ� ���Ͽ� �����Ѵ�. !
		//Properties�� Map�� �����̰� HashTable �Ʒ��� �ִ�

		//Properties ���
		//HashTable�� �̿��ϹǷ� Mapó�� ���
		//�� Key�� value�� String String
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "Korean");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.properties"), "properties Exam");
			//�ۼ��� ������ ������ txt������
			//FileOutputStream�� �ڹ��� ����� ó�� ���� Ŭ������ ���Ͽ� ������ �ۼ��� ���
			//void store(OutputStream out, String comments) throws IOException
			//OutputStream out�� ��� ��ü, comments�� Properties���Ͽ� �ۼ��� �ּ�
		
			prop.storeToXML(new FileOutputStream("output.xml"), "properties Xml Exam");
			//�ۼ��� ������ ������ xml������
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}//main method;
}//main class;
