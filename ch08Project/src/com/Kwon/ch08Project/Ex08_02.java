package com.Kwon.ch08Project;

public class Ex08_02 {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		try {
			System.out.println(0/0); 
			//���п��� 0�� 0���� �� �����Ƿ� �������(ArithmeticException)�� �߻�
			System.out.println(2);//�� �κп��� ���� �߻��ϸ� �� ������ ����(catch�� ������)
		}
		catch(ArithmeticException e){
			//ArithmeticException(������꿹��)�� �� ó��
			//���⼭ ����ó���Ǹ� try ~ catch�� ����
			System.out.println(3);
			e.printStackTrace();
		}
		catch(Exception e) {
			//Exception�� ���� Ŭ������ �ֻ��� Ŭ�����̹Ƿ� ��� ���� ó��
			//�� ���� ArithmeticException�� ������ ���ܸ� ó���Ѵ�
			System.out.println("ArithmeticException�� �ƴ� ���� �߻�");
		}
		
		//���ܰ� ���ų� catch�� ����ó�� �� ���� ����
		//���� �߻� ������ catch�� ����ó�� �ȵǸ� �̰����� �ȿ��� catch���� ����
		System.out.println("try~catch ���� ��");
		
	}
}
