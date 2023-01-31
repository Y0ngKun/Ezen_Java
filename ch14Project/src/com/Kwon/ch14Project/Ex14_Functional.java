package com.Kwon.ch14Project;

//���ٽ��� ����Ϸ��� @FunctionalInterface�� �߻�޼��忡 �����ϴ� ���ٽ��� �������̽� ��ü�� �����Ͽ� ���
//���ٽ��� ���ô� ���ٽ����� ������ �߻� �޼��带 ȣ��
public class Ex14_Functional {
	public static void main(String[] args) {
		
		//�͸��� ��ü�� ���� ���� (������ �ڹ� ���)
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		int res = f.max(5, 10);
		System.out.println("res = " + res);
		
		System.out.println("lambda ���");
		
		MyFunction f1 = (a,b) -> a > b ? a : b;
		int res1= f1.max(11, 6);
		System.out.println("res1 = " + res1);
		//�͸��� ��ü�� ����� ��� �ش� �������̽��� �߻�޼��带 ���ٽ����� �����Ͽ� ����
		
		MyFunction f2 = (a,b) -> b/2;
		//���ٽ����� �Ķ��Ÿ�� ��ġ�� ���ϰ� ��� ������ �ƿ� ���� �����ϴ�.(!!)
		System.out.println(f2.max(5, 50));
		
	}//main method;
}//main class;

@FunctionalInterface
//FunctionalInterface�� �߻� �޼��尡 1���̴�(!!)
interface MyFunction {	
	/*public abstract*/int max(int a, int b);
}