package com.Kwon.ch07Project;

//�͸��� Ŭ���� �����
public class Ex07_17 {
	
	//�ٷ� �ش� ���� Ŭ������ �������̽� ��������(��ü)�� ���ϴ� ��ġ�� ����� ���

	//�ν��Ͻ��� �͸� Ŭ���� ������
	Object iv = new Object(){//������ �ڿ� �����θ� ����� ���� Ŭ������ ó���� ������ �ۼ�
		void method() {}		
	};
	
	//Ŭ������ �͸� Ŭ���� ������
	static Object sv = new Object() {
		void method() {}
	};
	
	//�޼ҵ��� �͸� Ŭ���� ������
	void method() {
		Object iv = new Object() {
			void method() {}
		};
	}//method

}
