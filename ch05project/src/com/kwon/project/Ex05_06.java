package com.kwon.project;

public class Ex05_06 {

	public static void main(String[] args) {
		//String �迭�� �ʱ�ȭ
		String[] names = {"kim","park","lee"};
		
		for(int i=0; i < names.length; i++) {
			System.out.println("names[" + i +"]:"+names[i]);
		}
		
		String tmp = names[2];//�迭 ��ҿ� ���ι�ȣ�� ����
		System.out.println("tmp :" + tmp);
		
		names[0] = "Yu"; //ù��° �迭���� Yu�� ����
//		names[1] = new String("ko");
		
		//�⺻ for���� �ʱ�ȭ��,���ǽ�,���������� ó��
		//�迭�̳� ������ó���÷��ǿ����� ������ for(enhanced for)�� ���
		for(String str: names) {
			//ù��° �Ķ���ʹ� ����� ���������� ����, �ι�° ��Ÿ���ʹ� �迭�̸�
			System.out.println(str);
			
		}
		
	}//main

}
