package com.kwon.project;

import java.util.Arrays;

public class controlQuiz {

	public static void main(String[] args) {
		
		int x = 50;// 1��
		   int y = 50;// 2��

		   if (x == y) {
		      System.out.println("x==y : " + (x == y) + " 1 ");
		   }
		   if (x > y) {
		      System.out.println("x>y : " + (x > y));
		   } else {
		      System.out.println("x>y : " + (x > y)+ " 2 ");
		   }
		   if (x < y) {
		      System.out.println("x<y : " + (x < y));
		   } else {
		      System.out.println("x<y : " + (x < y)+" 3 ");
		   } // 3��
		   
		   
		   if(x == y) {
			   System.out.println(1);
		   }
			   
		    else if (x > y) {
		    	System.out.println(2);
		    }
		    else {
		    	System.out.println(3);
		    }//3�� ������ ��
		   

		   int time = 20;
		   String noon = "good day";
		   String evening = "good evening";
		   var result = (time < 18) ? noon : evening;
		   System.out.println(result); 
		   // 4��
		   
		   String result1 = (time < 18) ? "Good day" : "Good morning";
		   System.out.println(result1);
		   
		   //4�� ������ ��

		   int day = 4;
		   switch (day) {
		   case 1:
		      System.out.println("case1");
		      break;
		   case 2:
		      System.out.println("case2");
		      break;
		   case 3:
		      System.out.println("case3");
		      break;
		   case 4:
		      System.out.println("case4");
		      break;
		   default:
		      System.out.println("��Ÿ");
		   }// 5��
		   
		   switch(day) {
		   	case 1: System.out.println(1);
		   	break;
		   	case 2: System.out.println(2);
		   	break;
		   	default: System.out.println("��Ÿ");
		   }
		   //5�� ������ ��

		   int i = 1;

		   while (i < 6) {
		      System.out.print(i);
		      i++;
		   } // 6��

		   System.out.println();
		   i = 1; //int i �ѹ� �����ϰ� �ؿ� �� �ٲ� �� i�� ���� = �ٲ�..
		   do {
		      System.out.print(i);
		      i++;
		   } 
		   while (i < 6);// 7��

		   System.out.println();
		   for (i = 0; i <= 5; i++) {
		      System.out.print("Yes ");
		   } // 8��
		   
		   System.out.println();
		   for(int c = 0; c<=5; c++) {
			   System.out.print("Yes ");
		   }//8�� ������ ��

		   System.out.println();
		   String[] cars = { "bmw", "volvo", "ford" };
		   for (String arr : cars) {
		      System.out.print(arr + " ");
		   } // 9�� 
		   

		   System.out.println();
		   loop1: for (i = 0; i <= 10; i++) {
		      System.out.print(i);
		      if (i >= 5) {
		         break loop1;
		      }
		   } // 10��
		   
		   
		   System.out.println();
		   for(i = 0; i<10; i++) {
			   if(i == 5){
				  break; //break�� �ִ� ���� ������ for���� ����
			   }
			   System.out.print(i);
		   }//10�� ������ ��
		   
		   System.out.println();
		   for(i = 0; i<10; i++) {
			   if(i == 4){
				  continue; 
				  //���� for���� ���� �ݺ��� ���� (���� ������ ���� ����)
			   }
			   System.out.print(i);
		   } //11�� ������ ��
		   
		   System.out.println();
		   int[] score = {100,100,90,90,88};
		   System.out.println(score.length);
		   System.out.println(Arrays.toString(score));
		   System.out.println(score[4]);
		   
		   char[] ch3 = {'a','b','d'};
		   String[] ch4 = {"ab","bd"};
		   String[] ch5 = new String[5];
		   ch5[0] = "kim";
		   ch5[1] = "lee";
		   System.out.println(ch3);
		   System.out.println(ch4);
		   System.out.println(ch4.length);
		   System.out.println(Arrays.toString(ch4));
		   System.out.println(ch5.length);
		   System.out.println(Arrays.toString(ch5));
		   
		   
		

/*1. int���� x�� �����ϰ� �ʱⰪ 50
 *2. int ���� y�� �����ϰ� �ʱⰪ 50
 *3. ���ǹ� if�� �̿��Ͽ� x,y�� �����, ũ�� �񱳿� ��Ÿ�� ��(if ~else if ~else)
 *   ������ ��� ������ "1","2","3" ���
 *4. int ���� time�� 20
 *   ���ǿ����� (���׿�����)�� �̿��Ͽ� time�� 18���� ������ good day��, �ƴϸ� good evening�� �����Ͽ� result ������ �����ϰ� result�� ���
 *5. int day = 4;
 *	 day�� ���ǽ����� �ϴ� switch���� �����
 *   case���� 1�� 2�� ����� ���� case�Ͻ� ����� case���� ����ϰ� switch�� ����
 *   ��Ÿ�� ��Ÿ�� ���
 *6. int i = 1;
 *	 i�� 6���� �����ø� �ݺ��ϴ� while���� ����(�ݺ��� ����� i�� ���)
 *	 ���� ���� �����ʵ��� i���� �����Ͽ� �ݺ�ó��
 *7. i������ �ٽ� 1�� ����, 6���� do while�� ����
 *8. �⺻ for������ yes�� 5�� ����Ͻÿ�
 *9. "volvo","bmw","ford"�� ��ҷ� ���� �迭 cars�� ����
 *   enhandced for���� �̿��Ͽ� cars�� ���Ҹ� ���
 *10.�ݺ� ���� i�� 0���� �����Ͽ� 1�� �����ϸ� 10ȸ �ݺ��ϴٰ� i�� 5�� �Ǹ� for���� �ߴ�, ����� i���� ���
 *11.10���� ���� �ϵ� i�� 4�� �Ǹ� �н��ϰ� �ٽ� for�� ����
 *  */

	}

}
