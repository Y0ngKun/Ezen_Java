package com.Kwon.ch06Project;

public class Ex06_14 {
	//�⺻���� ���� ���� �ε�
	//�ʱ�ȭ�� ����� �ι�° �ε�
	//static�� Ŭ���� �ε��� static ��� �ε�
	//�ν���Ʈ����� ������ ����� ���� �ε��� ������ �ʱ�ȭ
	int x;
	static int y;
	int k = 5;
	static int j = 10;
	
	// Ŭ������ ���
	static {
		System.out.println("static{}");
	}
	//�ν��Ͻ��� ���
	{System.out.println("{}");}
	
	//������
	public Ex06_14(){//Ŭ������ public�̸� �����ڵ� public���� �ۼ�
		System.out.println("������");
	}
	
	
	
	
	
	//main �޼ҵ� ����
	public static void main(String[] args) {
		System.out.println("Ex06_14 bt = new Ex6_14()");
		
		Ex06_14 bt = new Ex06_14();
		//�����ڰ� ����ɽ� ���� �ν��Ͻ��� ����� ���� ����
		
		System.out.println("Ex06_14 bt = new Ex6_14()");
		
		Ex06_14 bt1 = new Ex06_14();
		
		
		//static Ŭ������ �� ���� ����
		//�״��� ���θ޼ҵ� ù ���� ����
		//�״���  ���θ޼ҵ� �ۿ� �ν��Ͻ��� ���
		//�״��� ���θ޼ҵ� �ۿ� ������
		
	}//main method;;

}//main class;


