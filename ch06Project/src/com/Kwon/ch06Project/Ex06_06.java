package com.Kwon.ch06Project;

class Data{int x;}

public class Ex06_06 {
	
	static void change(int x) {
		//���ڰ��� �޴� �Ķ��Ÿ�� �⺻���Ͻô� �� �ȿ��� ��Į������ �ۿ�
		//����� ���� ���ڰ��� ���������� ���Ѵ�
		x = 1000;
		System.out.println("change() : x = " + x);
	}//end of static change
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		
		change(d.x);//change �޼��� ȣ��
		//main �޼��� �ȿ��� �޼��� �̸����� �ٷ� ȣ���� ������ ���� 
		//main �޼��� (Ex06_06)�� ���� Ŭ������ static�޼��常 ����
		//static �޼���ȿ��� ���� Ŭ������ static�޼��� ȣ���� �޼��� �̸������� ����
		
	}

}

