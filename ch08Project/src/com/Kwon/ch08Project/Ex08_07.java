package com.Kwon.ch08Project;

public class Ex08_07 {

	public static void main(String[] args) {
		
//		throw new Exception();
		//Exception ���ܴ� ������ ����(checked ����)�� �����Ͽ��� �߻�
		//������ ������ ��������� ����
		try {
			throw new Exception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
