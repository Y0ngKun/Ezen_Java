package com.Kwon.ch06Project;

public class Ex06_02 {

	public static void main(String[] args) {
		
		//tv�� Ex06_01 Class.java ���ο� �־ ���� Ŭ������ �����߰� ���� Ŭ������ ���� package���� �����Ƿ� ���� ����
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1);
		System.out.println(t2);
		
		t1.channel = 7;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		
		t2 = t1; 
		// t2�� ���� �ּҰ� t1�� ���� �ּҷ� ����
		//������ �ּҸ� ���� �ΰ��� ��ü�� �������
		
		System.out.println(t1);
		System.out.println(t2);
                           
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		Tv[] tvArr = new Tv[] { new Tv(),new Tv(),new Tv()};
		                   
		
		
		

	}

}
