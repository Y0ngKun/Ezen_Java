package com.Kwon.ch06Project;

public class Ex06_08 {

	public static void main(String[] args) {
		
//		Data3 d;//������� ������ ����
		Data3 d = new Data3(); //�ν��Ͻ� ��ü ����
		
		d.x = 10;
		
		Data3 d2 =copy(d);//return���� tmp�̹Ƿ� 10;
		
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		//tmp.x�� �⺻���� = 0;

	}//main
	
	static Data3 copy(Data3 d) {
		//static�޼���,Ex06_08Ŭ������ ����޼���
		//returnŸ���� Date3��ü,�Ķ��Ÿ�� Data3�� ��ü
		Data3 tmp = new Data3();
		tmp.x = d.x;
		
		return tmp;
	}
	
} //pb class

class Data3 {
	int x;
	
}