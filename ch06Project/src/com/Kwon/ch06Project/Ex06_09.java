package com.Kwon.ch06Project;

class MyMath2{
	long a, b;//�ν��Ͻ� ����(�۷ι� ������ Ŭ���������� ��𼭳� ��밡��)
	
	//���� Ÿ���� long��, �Ķ��Ÿ ����
	//�ν��Ͻ� �޼���� �ν��Ͻ� ����� static���
	long add() { return a+b;} //a,b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	long subtract() {return a-b;}//a,b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	long multply() {return a*b;}//a,b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	long divide() {return a/b;}//a,b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	
	//�ν��Ͻ� ������ �޼��带 ȣ������ �ʴ� ��쿡�� static���� ����
	static long add(long a, long b) {return a+b;} 
	//�� �� a,b�� ������ �ν��Ͻ� ���� a,b�� �ƴ϶� ���� ���� ���� ��;
	static long subtract(long a, long b) {return a-b;}
	//�� �� a,b�� ������ �ν��Ͻ� ���� a,b�� �ƴ϶� ���� ���� ���� ��;
	static long multply(long a, long b) {return a*b;}
	//�� �� a,b�� ������ �ν��Ͻ� ���� a,b�� �ƴ϶� ���� ���� ���� ��;
	static double divide(long a, long b) {return a/(double)b;}
	//�� �� a,b�� ������ �ν��Ͻ� ���� a,b�� �ƴ϶� ���� ���� ���� ��;

}//class MyMath;

public class Ex06_09 {

	public static void main(String[] args) {
		
	//static �޼��� ȣ��
		System.out.println(MyMath2.add(200L,200L));
		System.out.println(MyMath2.subtract(200L,200L));
		System.out.println(MyMath2.multply(200L,200L));
		System.out.println(MyMath2.divide(200L,200L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.a = 200L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multply());
		
	

	}//main;;

}//Class Ex06_09;
