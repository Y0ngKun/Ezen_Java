package com.Kwon.ch07Project;

public class Ex07_14 {
	private int outerIv = 0; //Ex07_14 Ŭ���� �ȿ����� ���
	static int outerCv = 0; //���������ڰ� �����Ƿ� (default) �� ��Ű�� �ȿ����� ��𼭳� ��밡��
	class InstanceInner{//�ν��Ͻ��� ���� Ŭ������ �θ�Ŭ������ ����̹Ƿ� �ٸ� ��� ��밡��
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	static class StaticInner{//Ŭ������ ����Ŭ����
		//static�� static��� �״�� ����ϳ� �ν��Ͻ������ �ܺΰ�ü�� ����� ���
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0;//�޼����� ������ ���� ����
		final int LV = 0; 
		//�޼����� ������ ���ú����ε� LocalŬ�������� ����� ���� final���(�ڹ�8���� ���� ����)
		
		//myMethod()�ȿ� ���� Ŭ����
		class LocalInner{
			//�ܺ�Ŭ���� ����� ��� ��� ����
			int iiv = outerIv;
			int iiv2 = outerCv;
			int iiv3 = lv;
			int iiv4 = LV;//�ڹ�8 �������� final�� ���� ���������� ��� �����ϳ� ������ final����
		
		}
		
	}
	
	public static void main(String[] args) {}

}
