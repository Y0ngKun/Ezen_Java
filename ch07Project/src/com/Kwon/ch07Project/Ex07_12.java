package com.Kwon.ch07Project;


public class Ex07_12 {
	
	//�ν��Ͻ��� ���� Ŭ����
	class InstanceInner{
		int iv = 178;
//		static int cv = 200; //jdk ������ ���� ���� ���� �ִ�.
		final static int CONST = 100;//����� �ν��Ͻ� ����Ŭ���������� ��밡��
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 250; //static Ŭ�����ȿ����� static ������� ��밡��
		final static int CONST = 150;
	}
	
	void myMethod() {
		class LocalInner{
			int iv =300;
//			static int cv = 270;//jdk ������ ���� ���� ���� �ִ�
			final static int CONST = 170;
			}
		}
	
	public static void main(String[] args) {
		Ex07_12 dee1 = new Ex07_12(); // �� �� ���� �߿�
		InstanceInner dee = dee1.new InstanceInner(); // �� �� ���� �߿�
		
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
	
		System.out.println(dee.iv);
		
		//Ŭ������ ���� Ŭ���������� �ν��Ͻ� ������ Ŭ���� �̸����� ���� �Ұ�
		
	
		
	}

}
