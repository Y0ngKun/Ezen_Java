package com.Kwon.ch08Project;

public class Ex08_12 {
	public static void main(String[] args) {
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}//main method;

	static void method1() throws Exception {
		//�Ϻδ� �ڽ��� try~catch�� ó���ϰ� �Ϻδ� throw�� ó��
		try {
			throw new Exception();//���� �߻�
		}
		catch(Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e; 
			//�߻��� ���ܸ� �̿��Ͽ� �ٽ� ���� �߻�
			//�� ���� ȣ���� �޼���� ���� ����
		}
	}

}
