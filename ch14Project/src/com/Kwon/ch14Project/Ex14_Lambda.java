package com.Kwon.ch14Project;

public class Ex14_Lambda {
	public static void main(String[] args) {
		
//		(int a, int b) {return a > b ? a : b;}

//		(int a, int b) a > b ? a : b
		//���� �� ��� {} ���� ����
		//return���� ��� �ÿ��� ������ �ƴϰ� �����̹Ƿ� ;(�����ݷ�) ������.
		//�� return ���ÿ��� ;(�����ݷ�) ���� �Ұ�
		
//		(a,b) -> a > b ? a : b
		//�Ķ��Ÿ�� �������� ���� ����		
		
//		(String name, int i) -> {System.out.println(name + "=" + i);}
//		(name, i) -> {System.out.println(name + "=" + i);}
		//�Ķ��Ÿ�� �������� ����
//		(name, i) -> System.out.println(name + "=" + i)
		//(�Ķ��Ÿ�� �������� ����) + ({���} ����) + (; ����)
		
		
//		(int x) -> {return x * x;}
//		(int x) -> x * x
		//({���} ����) + (return����) +(; ����)
//		(x) - > x * x
		//(�Ķ��Ÿ�� �������� ����) + ({���} ����) + (return ����) + (; ����)
//		x -> x * x
		//�Ķ��Ÿ �Ű������� �ϳ� �� �ô� �Ķ��Ÿ() ���� ����
		//�� ���������� �����ô� �Ұ� 
		//(�Ķ��Ÿ �Ű����� ����) + (�Ķ��Ÿ�� �������� ����) + ({���} ����) + (return ����) + (; ����)
		
//		() -> {return (int)(Math.random()*6);} 
		//return�ÿ��� �����̶� {} ����ؾ���
//		() -> (int)(Math.random()*6)
		//�����̰��̰� return ���� {} ���� ; ����
		
		
//		(int[] arr) ->{
//			int sum = 0;
//			for (int i : arr) {
//				sum += i;
//			}
//			return sum;
//		}
		
		
	}//main method;
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	void printVar (String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	int square (int x) {
		return x * x;
	}
	
	int roll (){
		return (int)(Math.random()*6);
	}
	
	int sumArr(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
}//main class;

