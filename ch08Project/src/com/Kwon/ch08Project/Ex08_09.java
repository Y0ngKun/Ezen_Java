package com.Kwon.ch08Project;

public class Ex08_09 {

	public static void main(String[] args) {
		
		//�޼��忡 throws�� ����ϸ� �� ó�� try-catchó���� �޼������ ��� ����ó���� �����Ѵ�.
		
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main�޼������ ����ó�� �����Ͽ� main���� ó��");
		}
	}//main method;
	
	
	static void method1() throws Exception{
		//�޼��忡�� throws ���� <throws Exception(����ó����)>
		//����ó���� �ڽ� �޼��忡�� ���ϰ� �ڽ��� ȣ���� �޼���� ����
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();
	}


}



