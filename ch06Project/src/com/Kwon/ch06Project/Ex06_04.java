package com.Kwon.ch06Project;

public class Ex06_04 {

	public static void main(String[] args) {
		
		/*MyMath Ŭ������ 
		 * add() =���ϱ�
		 * subtract(����)
		 * multiply(���ϱ�)
		 * divide(������) 
		 * �޼ҵ带 ȣ���Ͽ� ���
		 */
		
		//�޼���� ���� �ν��Ͻ� �޼����̹Ƿ� ��ü�� �����ؼ� ����ؾ���
		MyMath mm = new MyMath();
		long result = mm.add(15,20);
		//���� add�޼��� ȣ��, �޼����� �Ķ���Ͱ� long���̹Ƿ�
		//int�� �ڵ� ����ȯ �� (long����)
		long result1 = mm.subtract(5L, 3L);
		long result2 = mm.multiply(5L, 3L);
		double result3 = mm.divide(5L, 3L);
		
		System.out.println("result =" + result);
		System.out.println("result1 =" +result1);
		System.out.println("result2 = "+result2);
		System.out.println("resul3t =" +result3);//ȣ���� �޼����� �Ķ���Ͱ� double���̹Ƿ� �ڵ� ����ȯ
		
		//�ν���Ʈ ������� name
		mm.name = "kook";
		//Ŭ������ ������� price�� ����
		MyMath.price = 100;
		System.out.println("name = " + mm.name);
		System.out.println("price = " + mm.price);
		
		//Ŭ������ �޼��� smeth ȣ��
		MyMath.smeth();
		
	}//main

}//pb class

class MyMath{
	String name; // �ν���Ʈ�� �������
	static int price;//Ŭ����(static)�� �������
	static void smeth() {
		System.out.println("smeth");
	};
	
	long add(long a, long b) {
		//���(�����) long add(long a, long b)
		//long�� ��ȯ�������� (����Ÿ��) add�� �޼��� �̸�, ()�� �Ķ����
		// �Ķ��Ÿ ���� a,b�� ��Ͼȿ��� ���ú����� ����
		//���ú��� ��������� �Ķ��Ÿ����
		//a,b�� �����ϸ� �̾ȿ���  ����, ���޵� ȣ����� ���ڰ��� ����ȵ�
		
		long result = a + b;
		return result;
	}

	long subtract(long a, long b) {
		// �Ķ��Ÿ ���� a,b�� ��Ͼȿ��� ���ú����� ����
		long result = a - b;
		return result;
	}

	long multiply(long a, long b) {
		// �Ķ��Ÿ ���� a,b�� ��Ͼȿ��� ���ú����� ����
		long result = a * b;
		return result;
	}
	
	double divide(double x, double y) {
		// �Ķ��Ÿ ���� x,y�� ��Ͼȿ��� ���ú����� ����
		double result = x / y;
		return result;
	}
	
}//MyMath class
