package com.Kwon.ch11Project;

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
		
	
	}//main method;
}//main class;
