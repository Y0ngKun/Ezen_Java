package com.Kwon.ch06Project;

import java.util.Arrays;

public class ArrayQuiz {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo","Bmw","Ford"}; //1��
	
		System.out.println(cars[2]);//2��
	
		cars[0] = "Opel";
		System.out.println(cars[0]);//3��
		
		System.out.println(cars.length);//4��
		
	
		for(int i=0;i<=cars.length;i++) {
			String sum = "";
			sum += cars[i];
			System.out.println(sum);
			String tmp = "";
			cars[i] = tmp;
			
		}
		
//		
////		for(String arr : cars) {
////			System.out.print(arr);
////			
////		}//5_2�� enhanced for ���
////		
////		System.out.println();
////		int[][] myNumbers = {{1,2,3,4},{5,6,7}}; //6��
////		
//////		sum = "";
//////		for(int i=0;i<myNumbers.length;i++) {
//////			sum += myNumbers[i];
//////			System.out.println(Arrays.deepToString(myNumbers));
//////			
//////		}
//////		
//////		
		
		
		
	}//main method

}//public class

/*
 * 1.�ʱⰪ "Volvo","Bmw","Ford"�� ���� �迭 cars�� ����
 * 2.cars �迭�� 2�� ° ���� ���
 * 3.cars�� ��� Volvo�� Opel�� ������ �� ����� ��� ���� ���
 * 4.cars�迭�� ���� ������ ���
 * 5.cars�迭�� ��Ҹ� for������ ��� (�⺻ for��, enhanced for��)
 * 6.�ʱⰪ {{1,2,3,4},{5,6,7}}�� ���� myNumbers�迭 �����
 * 7.myNumbers�迭�� ��Ұ��� for���� �̿��Ͽ� ���
 * 8.cars�迭�� ����
 * 9.car�迭�� ���ڿ��� ��ȯ�Ͽ� ���
 * 10.carŬ������ ���ο��� ����
     --������� : color,brand
   11.main method �ȿ� Car��ü�� ��ҷ� �ϴ� �迭 car1�� ����� ���� 5���� ����
     (���ͷ� ��� ����)
     �� ��ҿ� Car��ü�� ����� �־���
   
 */
