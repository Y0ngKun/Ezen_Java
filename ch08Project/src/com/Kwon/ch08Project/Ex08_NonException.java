package com.Kwon.ch08Project;

public class Ex08_NonException {

	public static void main(String[] args) throws Exception {
		//����ó�� ������ main������ ���ϰ� throw�ؼ� JVM���� �Ѿ��.
		method1();
		

	}

	static void method1() throws Exception {
		throw new Exception();
	}
	
}
