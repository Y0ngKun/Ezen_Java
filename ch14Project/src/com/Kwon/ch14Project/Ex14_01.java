package com.Kwon.ch14Project;

import java.util.function.Supplier;

public class Ex14_01 {
	public static void main(String[] args) {
		
		//MyFunction2 �������̽� ��ü�� ���ٽ����� �߻�޼��带 �����Ͽ� ����
		MyFunction01 f1  = () -> {
			System.out.println("f1.run()");
		};//���ٽ����� �Լ��� �������̽��� �߻� �޼��� Ȱ��
		
		/*
		 * ������ 
		 * MyFunction2 f1 = ()-> System.out.println("f1.run()");
		 */
		
		MyFunction01 f2 = new MyFunction01() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			};
		}; //��ü �������� �Լ��� �������̽��� �߻�޼��� Ȱ��
		
		MyFunction01 f3 = getMyFunction();
		
		//���� ���ô� ���ٽ����� ������ �߻�޼��带 ȣ���Ͽ� ���
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));
		
	}//main method;
	
	static MyFunction01 getMyFunction(){
		//��ȯ�� MyFunction2 ��ü�� ���ٽ��� �̿��� ���� ��ȯ
		MyFunction01 f = () -> System.out.println("f3.run()");
		return f;
		//������ return () -> System.out.println("f3.run()");
	}
	
	//�Ķ��Ÿ�� ���ٽ��� ����ϴ� �Լ��� �������̽� ��ü ��� �޼���
	static void execute (MyFunction01 f) {
		f.run();
	} 

}//main class;

//���ٽ��� ����Ϸ��� ���ٽ��� ������ �߻� �޼��尡 �ִ� <�Լ��� �������̽�>�� �����ؾ���
//�Լ��� �������̽��� �߻�޼��尡 �ϳ�(!!)�� �ִ� �������̽�
@FunctionalInterface
interface MyFunction01{
	//�Լ��� �������̽��̹Ƿ� �߻�޼���� �ϳ���(!!) ����
	/*public abstract*/ void run(); //�߻�޼���� {}����� ����(!!)
}
