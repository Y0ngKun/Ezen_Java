package com.Kwon.ch06Project;

import java.util.Arrays;

class Car{
	//�������(�ν��Ͻ���)
	  String color;
	  String brand;
}

public class ArrayQuiz {

	public static void main(String[] args) {
		   //1��
	      String[] cars = {"Volvo","Bmw","Ford"}; 
	      //String[] cars = new String[]{"Volvo","Bmw","Ford"};
	      
	      //2��
	      System.out.println(cars[1]);
	      
	      //3��
	      cars[0] = "Opel";
	      System.out.println(cars[0]);
	      
	      //4��
	      System.out.println(cars.length);
	      
	      
	      //5_1�� �Ϲ� for
	      for(int i=0; i<cars.length; i++) {
	         System.out.print(cars[i]+" ");
	         }
	      
	      //5_2�� enhanced for ���
	      System.out.println();//�ٹٲ�
	      
	      for(String arr : cars) {
	         System.out.print(arr+" ");
	         }
	      //*enhanced for�� �ַ� �迭�̳� collection ��ü���� ����Ѵ�*//
	      //6��
	      System.out.println();
	      
	      int[][] myNumbers = {{1,2,3,4},{5,6,7}};
	      //�迭 ÷�� = [] �� ������ �迭�� ������ ��Ÿ��
	      //2���� �迭�� ù��°{}�� ���� ����, �ι�°�� ���� ���� 
	      //������ ���� ������ 2���̰� ���� ����
	      //myNumbers[0][0] ~ [0]~[3]
	      //myNumbers[1][0] ~ [1]~[2]
	      //int[][] myNumbers = new int[2][];
	      //myNumbers[0] = new int[4]
	      //myNumbers[1] = new int[3]
 	      
	      // 7��	      
	      for(int i=0; i<myNumbers.length; i++) {
	         int[] k = myNumbers[i];
	         for(int j=0; j<k.length; j++) {
	            System.out.print(k[j] + " ");
	         }
	         System.out.println();
	         }
	      
	      for(int i=0; i<myNumbers.length;i++) {
	          for(int j=0;j<myNumbers[i].length;j++) {
	             System.out.print(myNumbers[i][j]);
	          }
	       }//�ٸ� ��

	      System.out.println();
	      
	      
	      //8��
	      Arrays.sort(cars);
	      //Arrays�� �迭ó���� ���ϰ� �ϵ��� ���ִ� static�޼���
	      //sort�� �ø����� (������ �迭)�� ��������
	    //9��
	      System.out.println(Arrays.toString(cars));
	      
	    
	      System.out.println(Arrays.deepToString(myNumbers));
	      
	      //10��

	 
	      //11��
	      Car[] car1 = new Car[5];
//	      car1 = new Car[5];
	      //car1�迭�� �迭�� ���� ��Ұ� CarŬ������ ��(Car��ü)
	      car1[0] = new Car();
	      car1[1] = new Car();
	      car1[2] = new Car();
	      car1[3] = new Car();
	      car1[4] = new Car();
//	      for (int i = 0; i < car1.length; i++) {
//			car1[i] = new Car();
//		}
//	      int a = 1;
//	      int b = 2;
//	      
//	      int max(int a, int b) {
//	    	  result = 0;
//	    	  if(a > b)
//	    		  result = a;
//	    		  return a;
//	    	  else
//	    		  result = b;
//	    		  return b;
//	      }
	      

	
		
		
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
