package com.Kwon.ch14Project;

public class Ex14_anony {
	public static void main(String[] args)  {
		
		//�͸��� ��ü obj�� ����
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
//		obj.max(5,3);
		//ObjectŬ�������� .max()�޼ҵ尡 �����Ƿ� ���� �߻�
		//���ٽ����� �͸��� ��ü�� �޼ҵ带 �����ϱ� ���ؼ��� �Ʒ�ó�� �Ѵ�
//		obj = (a,b) -> a > b ? a : b
		//�׷��� ���ٽ��� �͸��� ��ü�� �����Ϸ��� ���ٽĸ� �������ָ� �ȴ�.
		//��, �͸��� ��ü�� �߻�޼��尡 �ϳ��� �ִ� interface��ü���� �Ѵ�.
		//�߻�޼��尡 �ϳ��� �ִ� �������̽��� @FunctionalInterface
		//Object�� �߻�޼��尡 �ϳ��� �ƴϹǷ� ����
		
	}//main method;
}//main class;
