package com.Kwon.ch08Project;

public class Ex08_NonException {

	public static void main(String[] args) throws Exception {
		//예외처리 최종인 main에서도 안하고 throw해서 JVM으로 넘어간다.
		method1();
		

	}

	static void method1() throws Exception {
		throw new Exception();
	}
	
}
