package com.Kwon.ch07Project;

public class Outer { //extends�� �����Ƿ� ������ Object���
	
	
	int iv = 0; //Ŭ������ �ν��Ͻ��� ��� ����
	static int cv = 0; //Ŭ������ Ŭ������(static) ��� ����
	
	void myMethod() {//�ν��Ͻ��� ��� �޼���
		int x = 0; //�ν��Ͻ��� ��� �޼����� ���ú��� 
		
		//�޼��峪 �ʱ�ȭ ��Ͼȿ� Ŭ������ "����Ŭ����"
		class LocalClass{}
	}
	static void mySmethod() { //Ŭ������ ��� �޼���
		int y = 0;
		
	}
	
	public Outer(){ //������
		super();//Object�� ������ ȣ��
	}
	
	//���� Ŭ������ Ŭ������ ����� �������,����޼���,������ó�� ó��
	//���� Ŭ������ ����̹Ƿ� �ν��Ͻ���,Ŭ������ 2���� ������ Ŭ������ �����Ѵ�
	private class InstanceInner{ //�ν��Ͻ��� ���� Ŭ����
		//���������ڷδ� ��������� �޼���ó�� public,private,default,protected 4���� ��밡��
		//�Ϲ������ڷδ�Ŭ������ ����ϴ� abstract,final ��밡��
	}
	
	static class StaticInner{ //Ŭ������ ���� Ŭ����
		
	}
}//class Outer;
