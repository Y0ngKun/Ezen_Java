package com.Kwon.ch06Project;

import java.util.Arrays;

class Car{
	//멤버변수(인스턴스형)
	  String color;
	  String brand;
}

public class ArrayQuiz {

	public static void main(String[] args) {
		   //1번
	      String[] cars = {"Volvo","Bmw","Ford"}; 
	      //String[] cars = new String[]{"Volvo","Bmw","Ford"};
	      
	      //2번
	      System.out.println(cars[1]);
	      
	      //3번
	      cars[0] = "Opel";
	      System.out.println(cars[0]);
	      
	      //4번
	      System.out.println(cars.length);
	      
	      
	      //5_1번 일반 for
	      for(int i=0; i<cars.length; i++) {
	         System.out.print(cars[i]+" ");
	         }
	      
	      //5_2번 enhanced for 사용
	      System.out.println();//줄바꿈
	      
	      for(String arr : cars) {
	         System.out.print(arr+" ");
	         }
	      //*enhanced for는 주로 배열이나 collection 객체에서 사용한다*//
	      //6번
	      System.out.println();
	      
	      int[][] myNumbers = {{1,2,3,4},{5,6,7}};
	      //배열 첨자 = [] 의 개수가 배열의 차원을 나타냄
	      //2차원 배열은 첫번째{}가 행의 개수, 두번째가 열의 개수 
	      //위에서 행의 개수는 2개이고 열은 가변
	      //myNumbers[0][0] ~ [0]~[3]
	      //myNumbers[1][0] ~ [1]~[2]
	      //int[][] myNumbers = new int[2][];
	      //myNumbers[0] = new int[4]
	      //myNumbers[1] = new int[3]
 	      
	      // 7번	      
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
	       }//다른 답

	      System.out.println();
	      
	      
	      //8번
	      Arrays.sort(cars);
	      //Arrays는 배열처리를 편리하게 하도록 해주는 static메서드
	      //sort는 올림차순 (사전식 배열)로 정렬해줌
	    //9번
	      System.out.println(Arrays.toString(cars));
	      
	    
	      System.out.println(Arrays.deepToString(myNumbers));
	      
	      //10번

	 
	      //11번
	      Car[] car1 = new Car[5];
//	      car1 = new Car[5];
	      //car1배열은 배열의 구성 요소가 Car클래스의 값(Car객체)
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
 * 1.초기값 "Volvo","Bmw","Ford"를 갖는 배열 cars를 만듦
 * 2.cars 배열의 2번 째 값을 출력
 * 3.cars의 요소 Volvo를 Opel로 변경한 뒤 변경된 요소 값을 출력
 * 4.cars배열의 원소 갯수를 출력
 * 5.cars배열의 요소를 for문으로 출력 (기본 for문, enhanced for문)
 * 6.초기값 {{1,2,3,4},{5,6,7}}을 갖는 myNumbers배열 만들기
 * 7.myNumbers배열의 요소값을 for문을 이용하여 출력
 * 8.cars배열을 정렬
 * 9.car배열을 문자열로 변환하여 출력
 * 10.car클래스를 내부에다 만듦
     --멤버변수 : color,brand
   11.main method 안에 Car객체를 요소로 하는 배열 car1을 요소의 개수 5개로 만듦
     (리터럴 사용 안함)
     각 요소에 Car객체를 만들어 넣어줌
   
 */
